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
public class RealPayment implements Payment {

    private String name;
    private String cardNumber;

    public RealPayment(String name) {
        this.name = name;
        ValidateCashPayment(name);
    }

    public RealPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        ValidateCreditPayment(name, cardNumber);
    }

    private void ValidateCashPayment(String Name) {
        System.out.println("\nWaiting for payment verification for " + Name + " order...");

    }

    private void ValidateCreditPayment(String Name, String card) {
        System.out.println("\nWaiting for payment verification for " + Name + " order, With the card number: " + card + "...");
    }

    @Override
    public void PaymentApproval() {
        System.out.println("\nYour payment has been approved and your order placed successfully");
    }

    
}
