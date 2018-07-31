/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooExam;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class PrincipalJog {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int op;
        Jogador j = new Jogador();
        
        while  (true){
            System.out.println("===============");
            System.out.println("1 - Cadastrar Jogador: ");
            System.out.println("2 - Calcular Valor Folha: ");
            System.out.println("3 - Visualizar valor Folha: ");
            System.out.println("4 - Remover Jogador: ");
           op = input.nextInt();
           
           input.nextLine();
           
           switch(op){
               case 1:
                   CadastrarJog();
                   break;
               
               case 2:
                   CalcularFolha();
                   break;
                   
               case 3:
                   VisualizarFolha();
                   break;
                   
               case 4:
                   RemoverJog();
                   break;
                   
               default:
                   System.out.println("Opção Invalida...");
           }
           
        }
    }
    
    public static void CadastrarJog(){
        System.out.println("Insira o nome do jogador: ");
    }
    
    public static void CalcularFolha(){
        
    }
    
    public static void VisualizarFolha(){
        
    }
    
    public static void RemoverJog(){
        
    }
    
    
}
