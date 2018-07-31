/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class PrincFuncionario {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Funcionario fun = new Funcionario();
        //int escolha = 0;
         System.out.println(fun.solicitarAumento());
      /*  switch(escolha){
            case 1:
                fun.tomarCafe();
                break;
            
            case 2:
                System.out.println("Digite o numero de horas: ");
                int h = input.nextInt();
                fun.trabalhar(h);
                break;
        }

*/
      
    }
}
