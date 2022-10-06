package entities;

public class Order {
    private double orderFee;
    private Load Load;

    public double getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(double orderFee) {
        this.orderFee = orderFee;
    }

    public entities.Load getLoad() {
        return Load;
    }

    public void setLoad(entities.Load load) {
        Load = load;
    }

    public Order(double orderFee, entities.Load load) {
        this.orderFee = orderFee;
        Load = load;
    }
}
