package com.uisrael.juridic.model.dto;

public class ErrorDTO {
    private String mensaje;
    private String gravedad;

    public ErrorDTO(String mensaje, String gravedad) {
        this.mensaje = mensaje;
        this.gravedad = gravedad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }
}
