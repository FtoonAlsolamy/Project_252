/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

import java.util.ArrayList;

/**
 *
 * @author AlReffaie
 */
public class CustomerService {

    // this is a singleton desgin pattern 
    private static CustomerService instance = null;

    private CustomerService() {

    }

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerService();
        }
        return instance;
    }
    
    public void showMessage(){
        System.out.println("For help contact us via chat, email, or phone.");
        
        
    }
    

}
