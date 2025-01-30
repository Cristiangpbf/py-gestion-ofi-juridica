package com.uisrael.juridic.controller;

import com.uisrael.juridic.model.Caso;
import com.uisrael.juridic.model.Entidad;
import com.uisrael.juridic.model.dto.ErrorDTO;
import com.uisrael.juridic.services.ICasoServices;
import com.uisrael.juridic.services.IEntidadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

@Controller
public class CasoController {

    @Autowired
    private ICasoServices casoService;

    @Autowired
    private IEntidadServices entidadService;

    @GetMapping("/casos")
    public String listarCasos(Model model) {
        List<Caso> listaCasos = casoService.listCaso();
        model.addAttribute("listaCasos", listaCasos);
        return "/caso/listarCasos";
    }

    @GetMapping("/nuevoCaso")
    public String nuevoCaso(Model model) {
        List<Entidad> listaClientes = entidadService.listaXRol("Cliente");
        List<Entidad> listaEmpleados = entidadService.listaXRol("Empleado");
        model.addAttribute("listaClientes", listaClientes);
        model.addAttribute("listaEmpleados", listaEmpleados);
        model.addAttribute("nuevoCaso", new Caso());
        return "/caso/nuevoCaso";
    }

    @PostMapping("/guardarCaso")
    public String guardarCaso(@ModelAttribute("nuevoCaso") Caso nuevo, RedirectAttributes redirectAttributes) {
        try{
            nuevo.setFechaCreacion(new Timestamp(Calendar.getInstance().getTimeInMillis()));
            casoService.insertCaso(nuevo);
            return "redirect:/casos";
        }catch (Exception e){
            redirectAttributes.addFlashAttribute("error", new ErrorDTO(e.getMessage(), "Error grave!"));
            return "redirect:/mostrarError";
        }
    }

    @GetMapping("/actualizaCaso")
    public String actualizaCaso(@ModelAttribute("id") Integer casoId, Model model) {
        Caso caso = casoService.getCaso(casoId);
        caso.setFechaCreacion(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        List<Entidad> listaClientes = entidadService.listaXRol("Cliente");
        List<Entidad> listaEmpleados = entidadService.listaXRol("Empleado");
        model.addAttribute("listaClientes", listaClientes);
        model.addAttribute("listaEmpleados", listaEmpleados);
        model.addAttribute("nuevoCaso", caso);
        return "/caso/nuevoCaso";
    }

    @GetMapping("/eliminarCaso")
    public String eliminarCaso(@ModelAttribute("id") Integer casoId, Model model) {
        casoService.deleteCaso(casoId);
        return "redirect:/casos";
    }

}
