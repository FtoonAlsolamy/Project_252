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
      List<String> itemsDes;
	
	public ShoppingCart(){
		
                this.itemsDes=new ArrayList<String>();
	}
	
	public void addItem(String itemsDes){
		;
                this.itemsDes.add(itemsDes);
                System.out.println("");
                System.out.println("@item has been added to your cart succssfully@\n ");
	}
        
        public void removeItem(String itemsDes){
		
                this.itemsDes.remove(itemsDes);
                System.out.println("");
                 System.out.println("@item has been removed from your cart succssfully@\n ");
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
//            if(this.itemsDes.isEmpty()){
//           System.out.println("nothing is in the cart ");
//            }else
                 for(int i=0;i<this.itemsDes.size();i++){
                System.out.println("\n"+this.itemsDes.get(i)+"\n");
            }
                
            //System.out.println("Total Amount is: "+calculateTotal());
        }
}
