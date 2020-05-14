import java.util.HashMap;

public class Node {
    private String name;
//  TODO: Check if int could also work
    private HashMap<String, Node> transition;
    private boolean isEndNode;

    public Node(String name, boolean isEndNode) {
        this.name = name;
        this.transition = new HashMap<String, Node>();
        this.isEndNode = isEndNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Node> getTransition() {
        return transition;
    }

    public void addTransitionNode(String key, Node node) {
        this.transition.put(key, node);
    }

    public void removeTransitionNode(String key) {
        this.transition.remove(key);
    }

    public boolean isEndNode() {
        return isEndNode;
    }

    public void setEndNode(boolean endNode) {
        isEndNode = endNode;
    }
}
