package models;

import java.util.Date;

public class HEnfermedadDTO {

    private Long id;
    private String enfermedad;
    private String variante;
    private String gravedad;
    private String identificadorTernera;
    private Date fechaRegistro;

    public HEnfermedadDTO() {
    }

    public HEnfermedadDTO(Long id, String enfermedad, String variante, String gravedad, String identificadorTernera, Date fechaRegistro) {
        this.id = id;
        this.enfermedad = enfermedad;
        this.variante = variante;
        this.gravedad = gravedad;
        this.identificadorTernera = identificadorTernera;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getIdentificadorTernera() {
        return identificadorTernera;
    }

    public void setIdentificadorTernera(String identificadorTernera) {
        this.identificadorTernera = identificadorTernera;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
