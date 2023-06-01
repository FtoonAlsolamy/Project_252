/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

/**
 *
 * PRODUCER CLASS OF THE ABSTRACT FACTORY
 */
public class SuppliesFactoryProducer {

    public static SuppliesAbstractFactory getFactorySupplies(int choice) {
        if (choice==1) {
            return new CatSuppliesFactory();
        } else if (choice==2) {
            return new DogSuppliesFactory();
        }
        return null;
    }

}
