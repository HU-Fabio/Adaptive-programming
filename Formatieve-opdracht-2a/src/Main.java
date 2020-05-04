public class Main {
    public static void main(String[] args) {
        FSM fsm = new FSM();

        String[] msgs = {"B", "A", "A", "B", "B", "A", "A", "B"};

        for(String msg : msgs) {
            if (msg.equals("A")) {
                fsm.next("A");
            } else if (msg.equals("B")) {
                fsm.next("B");
            }
        }
        System.out.println("Nodes walked by: " + fsm.getHistory());

    }
}
