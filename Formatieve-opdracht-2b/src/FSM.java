import java.util.*;

public class FSM {
    private Map<Integer, ArrayList<Node>> binaryTree = new HashMap<>();

    public ArrayList<Node> CreateDice(int amount) {
        ArrayList<Node> sides = new ArrayList<>();

        for(int i=1; i<=amount; i++) {
            Node side = new Node(Integer.toString(i), 0, true, i);
            sides.add(side);
        }

        ArrayList<Integer> rowNodeAmount = new ArrayList<>();

        int x = (int) roundUp(sides.size(), 2);

//      Count amount of nodes needed for each row
        while(x != 1) {
            rowNodeAmount.add(x);
            x = (int) roundUp(x, 2);
        }

        rowNodeAmount.add(1);

//      Create the row nodes for the binary tree
        for(int row : rowNodeAmount) {
            binaryTree.put(row, new ArrayList<>());
            for(int i=1; i<=row; i++) {
                String nodeName = "N" + row + i;
                binaryTree.get(row).add(new Node(nodeName, 0.5, false, 0));
            }
        }

//      Create relations with each node
        for (Map.Entry<Integer, ArrayList<Node>> entry : binaryTree.entrySet()) {
            ArrayList<Integer> keys = new ArrayList<>(binaryTree.keySet());
            try {
                ArrayList<Node> parentNodes = null;
                if (entry.getKey() != 1) {
                    parentNodes = binaryTree.get(keys.get(keys.indexOf(entry.getKey()) - 1));
                }
                ArrayList<Node> connectionNodes = new ArrayList<>(binaryTree.get(keys.get(entry.getKey())));
                connectionCreator(entry, connectionNodes, parentNodes);
            } catch (IndexOutOfBoundsException e) {
                ArrayList<Node> diceEyes = new ArrayList<>(sides);
                ArrayList<Node> parentNodes = binaryTree.get(keys.get(keys.indexOf(entry.getKey()) - 1));
                connectionCreator(entry, diceEyes, parentNodes);
            }
        }

        return binaryTree.get(1);
    }

    private void connectionCreator(Map.Entry<Integer, ArrayList<Node>> entry, ArrayList<Node> connectionNodes, ArrayList<Node> parentNodes) {
        for(Node node : entry.getValue()) {
            for (Iterator<Node> iterator = connectionNodes.iterator(); iterator.hasNext();) {
                Node connectionNode = iterator.next();
                if (node.getA() == null) {
                    node.setA(connectionNode);
                    iterator.remove();
                } else if (node.getB() == null) {
                    node.setB(connectionNode);
                    iterator.remove();
                }
            }
            if (node.getB() == null && parentNodes != null) {
                for (Node parentNode : parentNodes) {
                    if (parentNode.getA() == node || parentNode.getB() == node) {
                        node.setB(parentNode);
                    }
                }
            }
        }
    }

    public long roundUp(long num, long divisor) {
        return (num + divisor - 1) / divisor;
    }

    public int rollDice(Node node) {
        Node startNode = node;

        while (!startNode.getDice()) {
            int n = new Random().nextInt(2);
            if (n == 0 || startNode.getB() == null) {
                startNode = startNode.getA();
            } else if (n == 1) {
                startNode = startNode.getB();
            }
        }

        return startNode.getEyes();
    }


    public Map<Integer, ArrayList<Node>> getBinaryTree() {
        return binaryTree;
    }
}
