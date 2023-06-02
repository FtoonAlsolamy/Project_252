package animalcare;

import java.util.Scanner;

//Proxy
public class ProxyPayment implements Payment {

    private String name;
    private int phone;
    private int cardNumber;
    private int paymentMethod;
    private RealPayment realPayment;

    public ProxyPayment(int paymentMethod) {
        this.paymentMethod = paymentMethod;
        PaymentMethod();
    }

    @Override
    public void UserInfo() {
        Scanner user = new Scanner(System.in);
        System.out.print("\nPlease enter your name: ");
        name = user.nextLine();
        System.out.print("Please enter your phone number: ");
        phone = user.nextInt();
    }

    @Override
    public void PaymentMethod() {

        UserInfo();

        if (paymentMethod == 1 || paymentMethod == 3) {
            //getting the identity of the real credit of qitaf info 
            realPayment = new RealPayment();
        } 
        else if (paymentMethod == 2) {
            System.out.println("\nYour order placed successfully!"
                             + "\nThank you for choosing AnimalCare\n");
        }

    }

}