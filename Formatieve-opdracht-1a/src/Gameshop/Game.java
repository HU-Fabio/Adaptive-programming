package Gameshop;

public class Game {
    private String name;
    private int releaseYear;
    private double buyPrice;
    private double sellPrice;

    public Game(String name, int releaseYear, double buyPrice) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.buyPrice = buyPrice;
        this.sellPrice = buyPrice / 2;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", buyPrice=" + buyPrice +
                ", sellPrice=" + sellPrice +
                '}';
    }
}
