/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydp;


public class Ant implements Animal{

    @Override
    public void legs() {
        System.out.println("Most ants have 8 legs");
    }

    @Override
    public void height() {
        System.out.println("Ants have a height of 2 cm on average");
    }
    
    
}
