/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; 
/**
 *
 * @author Austi
 */
public class simpleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	System.out.println("Enter a word.");
        String msg = keyboard.nextLine();
        greeting(msg); 
    }
    
    public static void greeting(String msg) { 
	System.out.println(msg); 
    }
    

}
