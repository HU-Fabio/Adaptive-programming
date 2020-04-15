package Autohuur;

public class Klant {
    String naam;
    double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Autohuur.Klant{" +
                "naam='" + naam + '\'' +
                ", kortingsPercentage=" + kortingsPercentage +
                '}';
    }
}
