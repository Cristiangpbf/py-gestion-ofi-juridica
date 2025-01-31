package com.uisrael.juridic.controller;

import com.uisrael.juridic.model.Caso;
import com.uisrael.juridic.model.Entidad;
import com.uisrael.juridic.model.Plazo;
import com.uisrael.juridic.model.dto.ErrorDTO;
import com.uisrael.juridic.services.ICasoServices;
import com.uisrael.juridic.services.IPlazoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

@Controller
public class PlazoController {

    @Autowired
    private IPlazoServices plazoService;
    @Autowired
    private ICasoServices casoService;

    @GetMapping("/plazosXCaso")
    public String plazosXCaso(@ModelAttribute("id") Integer casoId, Model model) {
        List<Plazo> listaPlazos = plazoService.listPlazoXCasoId(casoId);
        Caso caso = casoService.getCaso(casoId);
        model.addAttribute("listaPlazos", listaPlazos);
        model.addAttribute("caso", caso);
        return "/plazo/listarPlazosXCaso";
    }

    @GetMapping("/nuevoPlazo")
    public String nuevoPlazo(@ModelAttribute("id") Integer casoId, Model model) {
        Caso caso = casoService.getCaso(casoId);
        model.addAttribute("caso", caso);
        model.addAttribute("nuevoPlazo", new Plazo());
        return "/plazo/nuevoPlazo";
    }

    @PostMapping("/guardarPlazo")
    public String guardarPlazo(@ModelAttribute("nuevoPlazo") Plazo nuevo,
                               @RequestParam("casoId") Integer casoId,
                               Model model, RedirectAttributes redirectAttributes) {
        try{
            Caso caso = casoService.getCaso(casoId);
            nuevo.setFechacreacion(new Timestamp(Calendar.getInstance().getTimeInMillis()));
            nuevo.setCaso(caso);
            plazoService.insertPlazo(nuevo);
            return "redirect:/plazosXCaso?id="+nuevo.getCaso().getId();
        }catch (Exception e){
            redirectAttributes.addFlashAttribute("error", new ErrorDTO(e.getMessage(), "Error grave!"));
            return "redirect:/mostrarError";
        }
    }

    @GetMapping("/actualizaPlazo")
    public String actualizaPlazo(@ModelAttribute("id") Integer plazoId, Model model) {
        Plazo plazo = plazoService.getPlazo(plazoId);
        model.addAttribute("caso", plazo.getCaso());
        model.addAttribute("nuevoPlazo", plazo);
        return "/plazo/nuevoPlazo";
    }

    @GetMapping("/eliminarPlazo")
    public String eliminarPlazo(@ModelAttribute("id") Integer plazoId, Model model) {
        Plazo plazo = plazoService.getPlazo(plazoId);
        casoService.deleteCaso(plazoId);
        return "redirect:/plazosXCaso?id="+plazo.getCaso().getId();
    }

}
