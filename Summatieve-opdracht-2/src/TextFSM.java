public class TextFSM implements FSM{
    private String name;
    private Node startNode;
    private Node currentNode;

    public TextFSM(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public void nextNode() {

    }
}
