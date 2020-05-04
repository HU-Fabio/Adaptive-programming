import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FSM {
//  Create nodes used for Finite state machine
    private Node[] nodes = {new s0(), new s1(), new s2(), new s3()};
//  Create the transitions between the nodes
    private String[][] transitions = {{null, "B", "A", null}, {null, "A", "B", null}, {null, null, null, "B"}, {"B", null, null, "A"}};
//  Keep track of the walked by nodes
    private ArrayList<String> history = new ArrayList<String>(Collections.singleton("S0"));
//  Current node position
    private Node current = nodes[0];

    public void next(String msg) {
//      Get currentnode index
        int currentNode = Arrays.asList(nodes).indexOf(current);
//      Check which type of transition it is
        if (msg.equals("A")) {
            history.add(nodes[currentNode].A());
        } else if (msg.equals("B")) {
           history.add(nodes[currentNode].B());
        }
//      Get transitions for the currentnode
        String[] transition = transitions[currentNode];
//      Find the index of the msg
        int nextNode = Arrays.asList(transition).indexOf(msg);
//      Set current node to the enxt node
        current = nodes[nextNode];
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}
