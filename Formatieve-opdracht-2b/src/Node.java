public class Node {
    private String name;
    private Node A;
    private Node B;
    private double value;
    private Boolean isDice = false;
    private int eyes;

    public Node(String name, double value, Boolean isDice, int eyes) {
        this.name = name;
        this.value = value;
        this.isDice = isDice;
        if (isDice) {
            this.eyes = eyes;
        }
    }

    public void setA(Node a) {
        A = a;
    }

    public void setB(Node b) {
        B = b;
    }

    public Node getA() {
        return A;
    }

    public Node getB() {
        return B;
    }

    public Boolean getDice() {
        return isDice;
    }

    public int getEyes() {
        return eyes;
    }
}
