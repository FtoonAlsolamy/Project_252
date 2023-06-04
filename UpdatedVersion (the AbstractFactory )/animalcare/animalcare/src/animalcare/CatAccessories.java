/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

import java.util.Scanner;

/**
 *
 * @author Surface
 */
public class CatAccessories extends ItemsPrice implements CatSupplies{

    public CatAccessories() {
        super(0, "", "");
    }
     public ItemsPrice [] getCatAccessories(){
            ItemsPrice[] Items = new ItemsPrice[4];
         
            Items[0] = new ItemsPrice(10, "Leashes", "OnSale");
            Items[1] = new ItemsPrice(25, "Colorful Bowls", "NoSale");
            Items[2] = new ItemsPrice(45, "Collar with Tag", "OnSale");
            Items[3] = new ItemsPrice(7, " Brushes", "NoSale");
        
             return Items;
    }
    
    @Override 
    public void displayCatSupplies(){
        System.out.println("--CAT ACCESSORIES--\n");
        //displaying the menu 
         for (ItemsPrice item : getCatAccessories()) {
            System.out.println(item);
        }
        System.out.println("--ITEM ON SALE--\n");
        ItemsPrice[] items = getCatAccessories();
        Discounted discounted = new Discounted();
        ItemsPrice[] onSaleItems = discounted.Sort(items);
        //displaying the sales manu (default)
        for (ItemsPrice item : onSaleItems) {
            System.out.println(item);
        }
    }
    
    
    public void displayCatAccessories(){
        Scanner user = new Scanner(System.in);
        System.out.println("Do you want to sort the Items ? (yes/no) ");
        String userchoice = user.next();
        if (userchoice.equalsIgnoreCase("yes")) {

            System.out.println("Choose sort options: \n1. sort from high to low   \n2. sort low to high ");
            ItemsPrice[] Items = getCatAccessories();

            String usersort  = user.next();
            SortContext sc = new SortContext();
           
            if (usersort.equalsIgnoreCase("1")) {
                sc.SetSortProducts(new HighestPrice());
                sc.SortInt(Items);
            } else if (usersort.equalsIgnoreCase("2")) {
                sc.SetSortProducts(new LowestPrice());
                sc.SortInt(Items);
            } else {
                System.out.println("  ");
            }
    }
    
}
    

}
