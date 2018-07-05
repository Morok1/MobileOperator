package model;

public class Option {
    private String name;
    private double cost;
    private double costOfConnection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCostOfConnection() {
        return costOfConnection;
    }

    public void setCostOfConnection(double costOfConnection) {
        this.costOfConnection = costOfConnection;
    }
}
