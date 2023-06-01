package animalcare;

import java.util.Scanner;

import java.util.*;

public class Animalcare {

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

        System.out.println("please select the type of category to view it's menue (write the number of the category):\n"
                + "1- Cat Supplies\n2- Dog Supplies ");

        //-------------------------------------ABSTRACT FACTORY WITH STRATGEY --------------------------------------//
        int userCategoryChoice = user.nextInt();

//        calling the type of factory the user want to display (type of category of the supplies)
        SuppliesAbstractFactory SuppliesFactoryType = SuppliesFactoryProducer.getFactorySupplies(userCategoryChoice);

        if (userCategoryChoice == 1) {
            System.out.println("\t-CAT SUPPLIES-\n");
            System.out.println("please select the type of section you want to view (write the name of the section):\n"
                    + "- Food\n- Accessories\n- Medicine\n- Toys ");
            String userSectionChoiceC = user.next();
            CatSupplies cSupplies = SuppliesFactoryType.getCatSupplies(userSectionChoiceC);
            cSupplies.displayCatSupplies();
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

        } else if (userCategoryChoice == 2) {
            System.out.println("\t-DOG SUPPLIES-\n");
            System.out.println("please select the type of section you want to view (write the name of the section):\n"
                    + "- Food\n- Accessories\n- Medicine\n- Toys ");
            String userSectionChoiceD = user.next();
            DogSupplies dSupplies = SuppliesFactoryType.getDogSupplies(userSectionChoiceD);
            dSupplies.displayDogSupplies();
            if (dSupplies instanceof  DogFood){
                DogFood dog = new DogFood();
                dog.displayDogFood();
            } else if (dSupplies instanceof  DogToys){
                DogToys toy = new DogToys();
                toy.displayDogToys();
            }else if (dSupplies instanceof  DogMedicine){
                DogMedicine dogMedicine = new DogMedicine();
                dogMedicine.displaydogMedicine();
            }else if (dSupplies instanceof  DogAccessories){
                DogAccessories dogAccessories = new DogAccessories();
                dogAccessories.displayDogAccessories();
                
            }
                
            }
    }
}

     

        
        
        
          //-------------------------------------DECORATOR--------------------------------------//
//        System.out.println(" Do you want to add gift boxes? (yes or no ) ");
//        String gift = user.next();
//        if (gift.equalsIgnoreCase("yes")) {
//            System.out.println(" Select which gift box you want? "
//                    + "1- Dog box "
//                    + "2- Cat box ");
//            int giftSelection = user.nextInt();
//            if (giftSelection == 1) {
//                System.out.println(" Do you want to add ribbon ? (yes or no ) ");
//                String giftRibbon = user.next();
//                if (giftRibbon.equalsIgnoreCase("yes")) {
//                    System.out.println(" what color you want? (1-blue 2-pink) ");
//                    int giftRibbonColor = user.nextInt();
//
//                    if (giftRibbonColor == 1) {
//                        Gift customerG1 = new BlueRibbon(new DogBox());
//                        System.out.println(customerG1.GiftType());
//                    } else if (giftRibbonColor == 2) {
//                        Gift customerG1 = new PinkRibbon(new DogBox());
//                        System.out.println(customerG1.GiftType());
//                    }
//                }
//
//            } else {
//
//                System.out.println(" Do you want to add ribbon ? (yes or no ) ");
//                String giftRibbon = user.next();
//                if (giftRibbon.equalsIgnoreCase("yes")) {
//                    System.out.println(" what color you want? (1-blue 2-pink) ");
//                    int giftRibbonColor = user.nextInt();
//
//                    if (giftRibbonColor == 1) {
//                        Gift customerG1 = new BlueRibbon(new CatBox());
//                        System.out.println(customerG1.GiftType());
//                    } else if (giftRibbonColor == 2) {
//                        Gift customerG1 = new PinkRibbon(new CatBox());
//                        System.out.println(customerG1.GiftType());
//                    }
//                }
//            }
//
//        } else {
//
//        }
//
//          //-------------------------------------FACTORY--------------------------------------//
//        System.out.println("------------------check out------------------");
//
//        System.out.println("Choose your payment method :"
//                + " 1-Credit "
//                + " 2-Cash "
//                + " 3-Qitaf ");
//
//        int payment = user.nextInt();
//        paymentFactory anyType = new paymentFactory();
//        if (payment == 1) {
//
//            System.out.println(" enter Your card number : ");
//            int card = user.nextInt();
//            System.out.println(" enter Your card pin : ");
//            int pin = user.nextInt();
//
//            PaymentType process2 = anyType.userPay("credit");
//            process2.pay();
//        } else if (payment == 2) {
//            PaymentType process3 = anyType.userPay("cash");
//            process3.pay();
//
//        } else {
//            PaymentType process1 = anyType.userPay("qitaf");
//            System.out.println(" enter Your phone number : ");
//            int phone = user.nextInt();
//            process1.pay();
//
//        }
//
//  //-------------------------------------PROXY--------------------------------------//
//  
//  
//  //-------------------------------------SINGLETON--------------------------------------//
//        CallCenterSingleton number = CallCenterSingleton.getInstance();
//        number.showMessage();
//
//    }

//}
