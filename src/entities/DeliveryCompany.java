package entities;

import java.util.List;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private List<Customer> customers;
    public final static double PRICE_PER_KILOGRAM = 35.0;
    public final static double MAX_CAPACITY_PER_SQUARE_SANTIMETER = 50.0;

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public DeliveryCompany(String deliveryCompanyName, List<Customer> customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }
}
