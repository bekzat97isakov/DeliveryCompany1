package Service;

import entities.DeliveryCompany;

public class DeliveryCompanyService {
    private String deliveryCompanies;

    public DeliveryCompanyService(String deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public String getDeliveryCompanies() {
        return deliveryCompanies;
    }

    public void setDeliveryCompanies(String deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }


    public void acceptOrder(DeliveryCompany deliveryCompany) {


    }
}
