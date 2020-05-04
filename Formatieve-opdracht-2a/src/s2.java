public class s2 extends Node {
    @Override
    public String A() {
        throw new IllegalArgumentException("S2 doesn't have a transition A");
    }

    @Override
    public String B() {
        System.out.println("S3");
        return "S3";
    }
}
