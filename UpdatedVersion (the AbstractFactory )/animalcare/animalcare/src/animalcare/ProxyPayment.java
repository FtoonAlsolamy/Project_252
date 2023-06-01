package animalcare;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ا
 */
public class ProxyPayment implements Payment {

    private String name;
    private String cardNumber;
    private RealPayment realPayment;

    public ProxyPayment(String name) {
        this.name = name;
    }

    public ProxyPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void PaymentApproval() {
        if (realPayment == null) {
            if (cardNumber == null) {
                realPayment = new RealPayment(name);
            } else {
                realPayment = new RealPayment(name, cardNumber);
            }
        }
        realPayment.PaymentApproval();
    }

    
}
