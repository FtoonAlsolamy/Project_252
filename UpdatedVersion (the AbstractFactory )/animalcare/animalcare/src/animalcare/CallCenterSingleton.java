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
public class CallCenterSingleton {

    // this is a singleton desgin pattern 
    private static CallCenterSingleton instance = null;

    private CallCenterSingleton() {

    }

    public static CallCenterSingleton getInstance() {
        if (instance == null) {
            instance = new CallCenterSingleton();
        }
        return instance;
    }
    
    public void showMessage(){
        System.out.println("for more help contact our call center at : 20019001");
        
        
    }
    

}
