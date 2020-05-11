import java.util.*;

public class Main {

    public static void main(String[] args) {
        FSM fsm = new FSM();

        Node startNode = fsm.CreateDice(6).get(0);

        System.out.println("Er is " + fsm.rollDice(startNode) + " gegooid door de dobbelsteen");
    }
}
