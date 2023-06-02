package animalcare;

import animalcare.Payment;
import java.util.Scanner;

//Real Subject
public class RealPayment implements Payment {

    private String cardNumber;

    public RealPayment() {
        this.PaymentMethod();
    }

    @Override
    public void PaymentMethod() {
        Scanner user = new Scanner(System.in);
        System.out.print("Please enter your credit card number: ");
        String cardNumber = user.next();
        System.out.print("Please enter CVV: ");
        String CVV = user.next();
        System.out.println("\nYour payment has been approved and your order placed successfully!"
                         + "\nThank you for choosing AnimalCare\n");
    }

    @Override
    public void UserInfo() {

    }

}