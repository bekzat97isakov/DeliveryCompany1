package Service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;
import java.util.Optional;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompanies;


    public DeliveryCompanyService(ArrayList deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public ArrayList<DeliveryCompany> getDeliveryCompanies() {
        return deliveryCompanies;
    }

    public void setDeliveryCompanies(ArrayList deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }


    public void acceptOrder(Order order, String company, String customer) {
        Optional<DeliveryCompany> optional = deliveryCompanies.stream().filter(x -> x.getDeliveryCompanyName().equals(company)).findFirst();

        if (order.getLoad().getHeight() * order.getLoad().getWidth() < DeliveryCompany.MAX_CAPACITY_PER_SQUARE_SANTIMETER) {
            optional.ifPresent(x -> x.getCustomers().stream().filter(a -> a.getCustomerName().equals(customer)).findFirst().ifPresent(b -> b.addOrder(order)));
        }
    }

    public void createDeliveryCompany(String deliveryCompanyName ) {
        DeliveryCompany deliveryCompany = new DeliveryCompany(deliveryCompanyName);
        deliveryCompanies.add(deliveryCompany);
    }

    public static int getTotalFee(Customer customer) {
        int totalFee = 0;
        for (Order order : customer.getOrders()) {
            totalFee += order.getOrderFee();
        }
        return totalFee;
    }

    public static int getCompanyProfit(DeliveryCompany deliveryCompany) {
        int totalProfit = 0;
        for (Customer customer : deliveryCompany.getCustomers()) {
            totalProfit += getTotalFee(customer);
        }
        return totalProfit;
    }
}
