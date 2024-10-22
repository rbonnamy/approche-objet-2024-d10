package fr.diginamic.graphes;

import java.util.Comparator;

class Node implements Comparator<Node> {
    public int index;
    public double cost;

    public Node() {
    }

    public Node(int index, double cost) {
        this.index = index;
        this.cost = cost;
    }

    @Override
    public int compare(Node node1, Node node2) {
        return Double.compare(node1.cost, node2.cost);
    }
}