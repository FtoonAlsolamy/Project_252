/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
      List<ItemsPrice> items;
      List<String> itemsName;
	
	public ShoppingCart(){
		this.items=new ArrayList<ItemsPrice>();
                this.itemsName=new ArrayList<String>();
	}
	
	public void addItem(ItemsPrice item,String itemName){
		this.items.add(item);
                this.itemsName.add(itemName);
                System.out.println("item has been added to your cart succssfully ");
	}
        
        public void removeItem(ItemsPrice item,String itemName){
		this.items.remove(item);
                this.itemsName.remove(itemName);
                 System.out.println("item has been removed from your cart succssfully ");
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(ItemsPrice item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentType paymentMethod){
		int amount = calculateTotal();
}
        public void displayInvoice(){
            System.out.println("---RECIPT---");
            if(!this.itemsName.isEmpty()){
            for(int i=0;i<this.itemsName.size();i++){
                System.out.println("\n"+this.itemsName.get(i)+"\n");
            }
            }else
                System.out.println("nothing is in the cart ");
            System.out.println("Total Amount is: "+calculateTotal());
        }
}
