public class Main {
    public static void main(String[] args) {
        Huis h1 = new Huis("Nijenoord 1", 1970);
        Persoon p1 = new Persoon("Ronald Plasterk", 52);
        h1.setHuisbaas(p1);
// Print H1
        System.out.println(h1);

        Huis h2 = new Huis("Vredenburg", 1991);
        Persoon p2 = new Persoon("Annie Brouwers", 59);
        h2.setHuisbaas(p2);
// Print H2
        System.out.println(h2);
//Print "Huisbaas 1: " + h1.getHuisbaas().toString();
//Print "Huisbaas 2: " + h2.getHuisbaas().toString();
    }
}
