/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

import static java.util.Collections.list;

public interface SortProducts {
    public ItemsPrice[] Sort(ItemsPrice[] sort);
}
class LowestPrice implements SortProducts{

    @Override
    public ItemsPrice[] Sort(ItemsPrice[] sort) {
     int tempP; 
     String tempD;
     String tempDis;
     ItemsPrice [] newlist = new ItemsPrice[sort.length];
     newlist = sort;
    
     for(int i = 0; i < newlist.length ;i++){
         for(int j = i; j < newlist.length ;j++){
             if(newlist[i].price > newlist[j].price){
              
               tempD = newlist[i].desc;
               newlist[i].desc = newlist[j].desc;
               newlist[j].desc = tempD;
               
               
               tempP = newlist[i].price;
               newlist[i].price = newlist[j].price;
               newlist[j].price = tempP;
               
               tempDis = newlist[i].sale;
               newlist[i].sale = newlist[j].sale;
               newlist[j].sale = tempDis;
               
                
             }
         }
         
      System.out.println(sort[i].desc + " price: " + sort[i].price + " ");    
 
         
     } return newlist;
      
    }
    
}

class HighestPrice implements SortProducts{

    @Override
    public ItemsPrice[] Sort(ItemsPrice[] sort) {
         int tempP; 
     String tempD;
     String tempDis;
     ItemsPrice [] newlist = new ItemsPrice[sort.length];
     newlist = sort;
    
     for(int i = 0; i < newlist.length ;i++){
         for(int j = i; j < newlist.length ;j++){
             if(newlist[i].price < newlist[j].price){
              
               tempD = newlist[i].desc;
               newlist[i].desc = newlist[j].desc;
               newlist[j].desc = tempD;
               
               
               tempP = newlist[i].price;
               newlist[i].price = newlist[j].price;
               newlist[j].price = tempP;
               
               tempDis = newlist[i].sale;
               newlist[i].sale = newlist[j].sale;
               newlist[j].sale = tempDis;
               
                
             }
         }
         
      System.out.println(sort[i].desc + " price: " + sort[i].price + " ");    
 
         
     } return newlist;
      
    } 
    
    }
    

class Discounted implements SortProducts{

    @Override
    public ItemsPrice[] Sort(ItemsPrice[] sort){
    for (ItemsPrice item : sort) {
        if (item.sale.equalsIgnoreCase("On Sale")) {
            System.out.println(item.desc + " is On Sale, Price: " + item.price);
        }
    }
    return sort;
}
    
}