/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydp;


public class Person implements Animal{

    @Override
    public void legs() {
        System.out.println("Humans have 2 legs");
    }

    @Override
    public void height() {
        System.out.println("Adult humans have a height of 170cm on average");
    }
    
}
