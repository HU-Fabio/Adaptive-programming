package Gameshop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int releaseYear1 = LocalDate.now().getYear() -1; // 1 Jaar geleden
        int releaseYear2 = LocalDate.now().getYear() - 2; // 2 Jaar geleden

        Game g1 = new Game("Just Cause 3", releaseYear1, 49.98);
        Game g2 = new Game("Need for Speed: Rivals", releaseYear2, 45.99);
        Game g3 = new Game("Need for Speed: Rivals", releaseYear2, 45.99);

        Person p1 = new Person("Eric", 200.0);
        Person p2 = new Person("Hans", 55.0);
        Person p3 = new Person("Arno", 185.0);


        System.out.println(p1.buy(g1));
        System.out.println(p1.buy(g2));
        System.out.println(p1.buy(g3));
        System.out.println(p2.buy(g2));
        System.out.println(p2.buy(g1));
        System.out.println(p3.buy(g3));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println(p1.sell(g1, p3));
        System.out.println(p1.sell(g2, p3));
        System.out.println(p1.sell(g1, p1));

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
