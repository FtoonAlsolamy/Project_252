/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

/**
 *
 * @author ا
 */
public class paymentFactory {
 public PaymentType userPay ( String PaymentType ) {

     if (PaymentType.equalsIgnoreCase("credit")) {
      return new payCreditCard();
     } 
     
     else if (PaymentType.equalsIgnoreCase("cash")) {
      return new payCash();
     } 
     
     else if(PaymentType.equalsIgnoreCase("qitaf")){ 
         return new payQitaf();
     }
     else return null;
 }}
