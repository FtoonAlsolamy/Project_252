package animalcare;

import java.util.Scanner;

import java.util.*;

//                      MAIN TO RUN WITHOUT CLICKING THE GUI BUTTON (just for testing)
public class Animalcare {

    static ArrayList<String> cart = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("-_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_-");
        System.out.println("\t\tWelcome to Animal Care Online Shop");
        System.out.println("-_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_--_-\n");

        System.out.println("\tPlease login with your acoount\n");
        System.out.print("\tusername: ");
        String username = user.next();
        System.out.println("");
        System.out.print("\tpassword: ");
        int password = user.nextInt();

        boolean flag = true;
        String choice = "";
        int userCategoryChoice = CategoryMenu(user);
        do {

            //-------------------------------------ABSTRACT FACTORY WITH STRATGEY --------------------------------------//
//        calling the type of factory the user want to display (type of category of the supplies)
            SuppliesAbstractFactory SuppliesFactoryType = SuppliesFactoryProducer.getFactorySupplies(userCategoryChoice);

            if (userCategoryChoice == 1) {
                CatSuppliesMenu();
                String userSectionChoiceC = user.next();
                CatSupplies cSupplies = SuppliesFactoryType.getCatSupplies(userSectionChoiceC);
                cSupplies.displayCatSupplies();

                //if- statments to call the sorting method that is inside the abstarct factory classes 
                if (cSupplies instanceof CatFood) {
                    CatFood cat = new CatFood();
                    cat.displayCatFood();
                } else if (cSupplies instanceof CatToys) {
                    CatToys cattoy = new CatToys();
                    cattoy.displayCatToys();
                } else if (cSupplies instanceof CatMedicine) {
                    CatMedicine catMedicine = new CatMedicine();
                    catMedicine.displayCatMedicine();
                } else if (cSupplies instanceof CatAccessories) {
                    CatAccessories catAccessories = new CatAccessories();
                    catAccessories.displayCatAccessories();

                }

                System.out.println("do you want to view another manu?? (yes/no)");
                choice = user.next();
                if (choice.equalsIgnoreCase("yes")) {
                    userCategoryChoice = CategoryMenu(user);

                } else if (choice.equalsIgnoreCase("no")) {
                    addToShoppingCart(user);
                    flag = false;
                }

            } else if (userCategoryChoice == 2) {

                DogSuppliesMenu();
                String userSectionChoiceD = user.next();
                DogSupplies dSupplies = SuppliesFactoryType.getDogSupplies(userSectionChoiceD);
                dSupplies.displayDogSupplies();

                //if- statments to call the sorting method that is inside the abstarct factory classes 
                if (dSupplies instanceof DogFood) {
                    DogFood dog = new DogFood();
                    dog.displayDogFood();
                } else if (dSupplies instanceof DogToys) {
                    DogToys toy = new DogToys();
                    toy.displayDogToys();
                } else if (dSupplies instanceof DogMedicine) {
                    DogMedicine dogMedicine = new DogMedicine();
                    dogMedicine.displaydogMedicine();
                } else if (dSupplies instanceof DogAccessories) {
                    DogAccessories dogAccessories = new DogAccessories();
                    dogAccessories.displayDogAccessories();

                }
                System.out.println("do you want to view another manu?? (yes/no)");
                choice = user.next();
                if (choice.equalsIgnoreCase("yes")) {
                    userCategoryChoice = CategoryMenu(user);

                } else if (choice.equalsIgnoreCase("no")) {
                    addToShoppingCart(user);
                    flag = false;

                }

            }
        } while (flag);

        //displaying the items in the cart
        System.out.println("------------------------");
        System.out.println("--ITEMS IN THE CART--");
        System.out.println("------------------------");
        for (int i = 0; i < cart.size(); i++) {

            System.out.println("-" + cart.get(i) + "\n");
        }
        System.out.println("");
        

        //-------------------------------------DECORATOR--------------------------------------//
        System.out.println(" Do you want to add a gift boxes? (yes/no) ");
        String gift = user.next();
        if (gift.equalsIgnoreCase("yes")) {
            System.out.println(" Select which gift box you want? "
                    + "1- Dog box "
                    + "2- Cat box ");
            int giftSelection = user.nextInt();

            if (giftSelection == 1) {
                System.out.println(" Do you want to add a ribbon ? (yes/no) ");
                String giftRibbon = user.next();
                if (giftRibbon.equalsIgnoreCase("yes")) {
                    System.out.println(" what color do you want? (1-blue/2-pink) ");
                    int giftRibbonColor = user.nextInt();

                    if (giftRibbonColor == 1) {
                        Gift customerG1 = new BlueRibbon(new DogBox());
                        System.out.println(customerG1.GiftType());
                    } else if (giftRibbonColor == 2) {
                        Gift customerG1 = new PinkRibbon(new DogBox());
                        System.out.println(customerG1.GiftType());
                    }
                }

            } else {

                System.out.println(" Do you want to add ribbon ? (yes/ no ) ");
                String giftRibbon = user.next();
                if (giftRibbon.equalsIgnoreCase("yes")) {
                    System.out.println(" what color you want? (1-blue/ 2-pink) ");
                    int giftRibbonColor = user.nextInt();

                    if (giftRibbonColor == 1) {
                        Gift customerG1 = new BlueRibbon(new CatBox());
                        System.out.println(customerG1.GiftType());
                    } else if (giftRibbonColor == 2) {
                        Gift customerG1 = new PinkRibbon(new CatBox());
                        System.out.println(customerG1.GiftType());
                    }
                }
            }

        }

//
//          //-------------------------------------FACTORY & PROXY--------------------------------------//
        System.out.println("------------------check out------------------");

        System.out.println("Choose your payment method :"
                + " 1-Credit "
                + " 2-Cash "
                + " 3-Qitaf ");

        int payment = user.nextInt();
        paymentFactory anyType = new paymentFactory();
        if (payment == 1) {
            //declaring the paying method to the user 
            PaymentType process2 = anyType.userPay("credit");
            process2.pay();
            // checking the payment method (making sure of the credit card info)            
            Payment paymentChecking = new ProxyPayment(payment);

        } else if (payment == 2) {
            //declaring the paying method to the user 
            PaymentType process3 = anyType.userPay("cash");
            process3.pay();
            // checking the payment method               
            Payment paymentChecking = new ProxyPayment(payment);

        } else if (payment == 3) {
            //declaring the paying method to the user 
            PaymentType process1 = anyType.userPay("qitaf");
            process1.pay();
            // checking the payment method (making sure of the qitaf info)            
            Payment paymentChecking = new ProxyPayment(payment);

        } else {
            System.out.println("please select again");
        }
//

        //-------------------------------------SINGLETON--------------------------------------//
        CallCenterSingleton number = CallCenterSingleton.getInstance();
        number.showMessage();
    }

    //methods to display the menus
    public static int CategoryMenu(Scanner s) {
        System.out.println("please select the type of category to view it's menue (write the number of the category):\n"
                + "1- Cat Supplies\n2- Dog Supplies ");
        s = new Scanner(System.in);
        int num = s.nextInt();
        return num;

    }

    public static void CatSuppliesMenu() {
        System.out.println("\t-CAT SUPPLIES-\n");
        System.out.println("please select the type of section you want to view (write the name of the section):\n"
                + "- Food\n- Accessories\n- Medicine\n- Toys ");
    }

    public static void DogSuppliesMenu() {
        System.out.println("\t-DOG SUPPLIES-\n");
        System.out.println("please select the type of section you want to view (write the name of the section):\n"
                + "- Food\n- Accessories\n- Medicine\n- Toys ");
    }

    public static void addToShoppingCart(Scanner user) {
        boolean flag = true;

        System.out.println("-------------------");
        System.out.println("Do you want to add itmes into the cart?? (yes/no)");
        String choice = user.next();
        System.out.println("-------------------");
        if (choice.equalsIgnoreCase("yes")) {
            do {
                System.out.println("wrtie the item you wish to add to cart: ");
                String itemName = user.next();
                cart.add(itemName);
                System.out.println("item has been added to your cart succssfully :)");

                System.out.println("do you want to add more items to the cart?? (yes/no):");
                choice = user.next();
                if (choice.equalsIgnoreCase("no")) {
                    flag = false;
                }

            } while (flag);

        } else {
            System.out.println("");
        }

    }
}
