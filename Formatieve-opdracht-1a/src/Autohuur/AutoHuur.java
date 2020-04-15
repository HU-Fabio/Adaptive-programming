package Autohuur;

public class AutoHuur {
    int aantalDagen;
    Auto gehuurdeAuto;
    Klant huurder;

    public AutoHuur() {
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public String getGehuurdeAuto() {
        return gehuurdeAuto.type + " met prijs per dag: " + gehuurdeAuto.prijsPerDag;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public double totaalPrijs() {
        return (1 - (this.huurder.kortingsPercentage / 100)) * (this.aantalDagen * this.gehuurdeAuto.prijsPerDag);
    }

    @Override
    public String toString() {
        String text = "";

        if (gehuurdeAuto == null) {
            text = text + " er is geen auto bekend\n";
        } else {
            text = text + " autotype: " + gehuurdeAuto.type + " met prijs per dag: " + gehuurdeAuto.prijsPerDag + "\n";
        }

        if(huurder == null) {
            text = text + " er is geen huurder bekend\n";
        } else {
            text = text + " op naam van: " + huurder.naam + " (korting: " + huurder.kortingsPercentage + "%)\n";
        }

        if(gehuurdeAuto == null || huurder == null) {
            text = text + " aantal dagen: 0 en dat kost 0.0 \n";
        } else {
            text = text + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        }

        return text;
    }
}
