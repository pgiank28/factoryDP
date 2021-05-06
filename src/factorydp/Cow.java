/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydp;

public class Cow implements Animal{

    @Override
    public void legs() {
        System.out.println("Cows have 4 legs");
    }

    @Override
    public void height() {
        System.out.println("A 4 year old cow has a height of 172 cm on average");
    }
    
    
}
