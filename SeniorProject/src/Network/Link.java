package Network;

public class Link {
    private int ID;
    private Node firstNode;
    private Node secondNode;
    private int capacity; // in Mbps
    private double cost;

    public Link(int ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
        this.cost = 100/capacity;
    }


    public Link(int ID, Node firstNode, Node secondNode, int capacity) {
        this.ID = ID;
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.capacity = capacity;
        this.cost = 100/capacity;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Node getFirstNode(){
        return this.firstNode;
    }

    public Node getSecondNode(){
        return this.secondNode;
    }
}
