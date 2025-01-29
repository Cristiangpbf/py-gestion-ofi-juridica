package com.uisrael.juridic.controller;

import com.uisrael.juridic.model.Entidad;
import com.uisrael.juridic.model.dto.ErrorDTO;
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
public class EntidadController {

    @Autowired
    private IEntidadServices entidadService;

    @GetMapping("/entidades")
    public String listarEntidades(Model model) {
        List<Entidad> listaEntidades = entidadService.listEntidad();
        model.addAttribute("listaEntidades", listaEntidades);
        return "/entidad/listarEntidades";
    }

    @GetMapping("/nuevaEntidad")
    public String nuevaEntidad(Model model) {
        model.addAttribute("nuevaEntidad", new Entidad());
        return "/entidad/nuevaEntidad";
    }

    @PostMapping("/guardarEntidad")
    public String guardarEntidad(@ModelAttribute("nuevaEntidad") Entidad nuevo, RedirectAttributes redirectAttributes) {
        try{
            nuevo.setFechaRegistro(new Timestamp(Calendar.getInstance().getTimeInMillis()));
            entidadService.insertEntidad(nuevo);
            return "redirect:/entidades";
        }catch (Exception e){
            redirectAttributes.addFlashAttribute("error", new ErrorDTO(e.getMessage(), "Error grave!"));
            return "redirect:/mostrarError";
        }
    }

    @GetMapping("/actualizaEntidad")
    public String actualizaEntidad(@ModelAttribute("id") Integer entidadId, Model model) {
        Entidad entidad = entidadService.getEntidad(entidadId);
        entidad.setFechaRegistro(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        model.addAttribute("nuevaEntidad", entidad);
        return "/entidad/nuevaEntidad";
    }

    @GetMapping("/eliminarEntidad")
    public String eliminarEntidad(@ModelAttribute("id") Integer entidadId, Model model) {
        entidadService.deleteEntidad(entidadId);
        return "redirect:/entidades";
    }
}
