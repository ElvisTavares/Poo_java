/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

import java.util.Random;

/**
 *
 * @author elvis
 */
public class Aleatorio {
    public static void main(String[] args) {
       
        
        Random valor = new Random();
        int num = 10+valor.nextInt(90);
         
        System.out.println(num);
    }

   
}
