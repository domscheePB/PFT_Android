package models;

import java.util.Date;

public class TerneraDTO
{
    private String caravanasnis;
    private String caravanatambo;
    private Date fechaNacimiento;
    private int id;
    private int idMadre;
    private int idPadre;
    private String identificadorGuachera;
    private float pesoAlNacer;
    private String raza;
    private String tipoDeParto;

    public String getCaravanasnis() {
        return caravanasnis;
    }

    public void setCaravanasnis(String caravanasnis) {
        this.caravanasnis = caravanasnis;
    }

    public String getCaravanatambo() {
        return caravanatambo;
    }

    public void setCaravanatambo(String caravanatambo) {
        this.caravanatambo = caravanatambo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    public String getIdentificadorGuachera() {
        return identificadorGuachera;
    }

    public void setIdentificadorGuachera(String identificadorGuachera) {
        this.identificadorGuachera = identificadorGuachera;
    }

    public float getPesoAlNacer() {
        return pesoAlNacer;
    }

    public void setPesoAlNacer(float pesoAlNacer) {
        this.pesoAlNacer = pesoAlNacer;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoDeParto() {
        return tipoDeParto;
    }

    public void setTipoDeParto(String tipoDeParto) {
        this.tipoDeParto = tipoDeParto;
    }

    @Override
    public String toString() {
        return "TerneraDTO{" +
                "caravanasnis='" + caravanasnis + '\'' +
                ", caravanatambo='" + caravanatambo + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", id=" + id +
                ", idMadre=" + idMadre +
                ", idPadre=" + idPadre +
                ", identificadorGuachera='" + identificadorGuachera + '\'' +
                ", pesoAlNacer=" + pesoAlNacer +
                ", raza='" + raza + '\'' +
                ", tipoDeParto='" + tipoDeParto + '\'' +
                '}';
    }
}
