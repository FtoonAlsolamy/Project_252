package animalcare;

import animalcare.AboutAbstractFactory;
import animalcare.AboutDecorator;
import animalcare.AboutFactory;
import animalcare.AboutProxy;
import animalcare.AboutSingleton;
import animalcare.AboutStrataegy;
import static animalcare.Animalcare.cart;
import static animalcare.Animalcare.customerService;
import animalcare.BlueRibbon;
import animalcare.CatAccessories;
import animalcare.CatBox;
import animalcare.CatFood;
import animalcare.CatMedicine;
import animalcare.CatSupplies;
import animalcare.CatToys;
import animalcare.DogAccessories;
import animalcare.DogBox;
import animalcare.DogFood;
import animalcare.DogMedicine;
import animalcare.DogSupplies;
import animalcare.DogToys;
import animalcare.Gift;
import animalcare.Payment;
import animalcare.PaymentType;
import animalcare.PinkRibbon;
import animalcare.ProxyPayment;
import animalcare.SuppliesAbstractFactory;
import animalcare.SuppliesFactoryProducer;
import animalcare.paymentFactory;
import java.util.*;
import java.lang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ا
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        jTextField1 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("252PROJECT");
        setBackground(new java.awt.Color(255, 204, 255));
        setResizable(false);

        button1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(204, 0, 102));
        button1.setLabel("Factory");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(204, 0, 102));
        button2.setLabel("Singleton");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(204, 0, 102));
        button3.setLabel("Strategy");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(204, 0, 102));
        button4.setLabel("AbstractFactory");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button5.setForeground(new java.awt.Color(204, 0, 102));
        button5.setLabel("Decorator");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button6.setForeground(new java.awt.Color(204, 0, 102));
        button6.setLabel("Proxy");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 204, 204));
        jTextField1.setText("WELCOME TO ANIMAL CARE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 204, 204));
        label1.setText("click the buttons to show information about each design pattern");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setText("CPIT-252 Group Project");

        StartButton.setText("Click To Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(289, 289, 289))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        AboutFactory n = new AboutFactory();
        n.setVisible(true);

    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        AboutSingleton r = new AboutSingleton();
        r.setVisible(true);

    }//GEN-LAST:event_button2ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        AboutDecorator r1 = new AboutDecorator();
        r1.setVisible(true);

    }//GEN-LAST:event_button5ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        AboutStrataegy f = new AboutStrataegy();
        f.setVisible(true);

    }//GEN-LAST:event_button3ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        AboutProxy f1 = new AboutProxy();
        f1.setVisible(true);

    }//GEN-LAST:event_button6ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        AboutAbstractFactory x = new AboutAbstractFactory();
        x.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_button4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        // TODO add your handling code here:
        start();

    }//GEN-LAST:event_StartButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    public void start() {
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
                    removeFromShoppingCart(user);
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
                    removeFromShoppingCart(user);
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

        if (!cart.isEmpty() || gift.equalsIgnoreCase("yes")) {
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
        }
        
       // after the payment operation we want to display a message to the cutomer
       // using static object thet we initialize it
        customerService.showMessage();
    }

    //methods to display the menus
    public static int CategoryMenu(Scanner s) {
        System.out.println("please select the type of category to view it's menue (write the number of the category):\n"
                + "1- Cat Supplies\n2- Dog Supplies ");
              customerService.showMessage();
        s = new Scanner(System.in);
        int num = s.nextInt();
        return num;

    }

    public static void CatSuppliesMenu() {
        System.out.println("\t-CAT SUPPLIES-\n");
        System.out.println("please select the type of section you want to view (write the name of the section):\n"
                + "- Food\n- Accessories\n- Medicine\n- Toys ");
                  customerService.showMessage();
    }

    public static void DogSuppliesMenu() {
        System.out.println("\t-DOG SUPPLIES-\n");
        System.out.println("please select the type of section you want to view (write the name of the section):\n"
                + "- Food\n- Accessories\n- Medicine\n- Toys ");
               customerService.showMessage();
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
    public static void removeFromShoppingCart(Scanner user) {
        boolean flag = true;

        System.out.println("-------------------");
        System.out.println("Do you want to remove itmes from the cart?? (yes/no)");
        String choice = user.next();
        System.out.println("-------------------");
        if (choice.equalsIgnoreCase("yes")) {
            do {
                System.out.println("wrtie the item you want to remove it: ");
                String itemName = user.next();
                cart.remove(itemName);
                System.out.println("item has been removed from your cart succssfully :)");

                System.out.println("do you want to remove another items ?? (yes/no):");
                choice = user.next();
                if (choice.equalsIgnoreCase("no")) {
                    flag = false;
                }

            } while (flag);

        } else {
            System.out.println("");
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartButton;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
