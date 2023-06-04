/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalcare;

public class SortContext {
    SortProducts sortproducts;

    public SortContext() {
       
    }
    
    public void SortInt(ItemsPrice[] list){
        sortproducts.Sort(list);
    }
    
    public SortProducts getSortProducts(){
        return sortproducts;
    }
    
    public void SetSortProducts(SortProducts sortproducts){
        this.sortproducts = sortproducts;
    }
    
    
}
