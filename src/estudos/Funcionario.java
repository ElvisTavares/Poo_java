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
public class Funcionario {
    String nome;
    String cpf;
    //LocalDate dataDeNascimento;
    double salario;
    
    String cargo;
    int energia;
    int credibilidade;
    
    
    String trabalhar(int horas){
        int energiaNecessaria = horas * 5;
        
        if (energia >= energiaNecessaria) {
            salario = salario+15.50;
            energia = energia-50;
            
            credibilidade = (int) (credibilidade*0.1);
            
            if (credibilidade >100) {
                credibilidade = 100;
            }
            return "Trabalho realizado com sucesso";
            
        }else{
            return "Energia insuficiente";
        }
    }
    
    String tomarCafe(){
       Random valor = new Random();
       
        energia = energia +valor.nextInt(16);
        
        if (energia > 100) {
            
            energia = 100;
            return "Sua energia esta carregada";
        }else{
            return "energia insuficiente, se alimente mais";
        }
            
        }
    
    
   String fofocar(){
        Random fo = new Random();
        
        credibilidade =credibilidade + fo.nextInt(10);
        
        if (credibilidade >= 5) {
            
            return  "Cuidado fofoqueiro";
        }else{
            return "OK sem fofocas...";
        }
        
    }
    
    String solicitarAumento(){
        Random rand = new Random();
        
        int fator = rand.nextInt(120);
        
        if (fator <= credibilidade) {
           
            
            int aumento = 5 + rand.nextInt(11);
            
            
            salario = salario+ (salario*(aumento /100));
            return "Aumneto de "+ aumento + "%";
        }else{
            return "Melhorar";
        }
      
    }
   
}
