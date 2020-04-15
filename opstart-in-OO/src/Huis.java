public class Huis {
    String adres;
    int bouwjaar;
    Persoon huisbaas;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    @Override
    public String toString() {
        return "Huis{" +
                "adres='" + adres + '\'' +
                ", bouwjaar=" + bouwjaar +
                ", huisbaas=" + huisbaas +
                '}';
    }
}
