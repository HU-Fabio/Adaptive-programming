public class ChanceFSM implements FSM{
    private String name;
    private Node startNode;
    private Node currentNode;

    public ChanceFSM(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
//        TODO: figure out how to work with chances
    }
}
