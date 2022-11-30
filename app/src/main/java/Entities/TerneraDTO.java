package Entities;

import com.google.gson.annotations.SerializedName;

public class TerneraDTO {
    @SerializedName("caravanasnis")
    private String caravanaSnis;
    @SerializedName("caravanatambo")
    private String caravanatambo;

    @SerializedName("url")
    private String url = "";

    public TerneraDTO() {
    }

    public TerneraDTO(String caravanaSnis, String caravanatambo, String url) {
        this.caravanaSnis = caravanaSnis;
        this.caravanatambo = caravanatambo;
        this.url = url;
    }

    public String getCaravanaSnis() {
        return caravanaSnis;
    }

    public void setCaravanaSnis(String caravanaSnis) {
        this.caravanaSnis = caravanaSnis;
    }

    public String getCaravanatambo() {
        return caravanatambo;
    }

    public void setCaravanatambo(String caravanatambo) {
        this.caravanatambo = caravanatambo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TerneraDTO{" +
                "caravanaSnis='" + caravanaSnis + '\'' +
                ", caravanatambo='" + caravanatambo + '\'' +
                '}';
    }
}
