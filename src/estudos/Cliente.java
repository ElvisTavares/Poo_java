/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

/**
 *
 * @author elvis
 */
public class Cliente {
    private String nome;
    private String cpf;
    private double dinheiro;
    
    public Cliente(String cpf, double dinheiro){
        this.cpf = cpf;
        this.dinheiro = dinheiro;
        
    }
    
    
    String trabalhar(int horas){
        double valorHora = 50.0;
        if (horas > 0) {
            dinheiro = dinheiro*valorHora;
            
            return "Sucess";
        }else{
            return "fail";
        }
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome.length() >=3 && nome.length()<=20 ? nome:"Invalido";
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf.length() == 14?cpf:"000.000.000-00";
    }
    
    public double getDinheiro(){
        return dinheiro;
    }
    
    public void setDinheiro(double dinheiro){
        if (dinheiro>0) {
            this.dinheiro = dinheiro;
        }
    }
    
    
    @Override
    public String toString(){
        return ("Cliente cpf:"+cpf+" R$:"+dinheiro);
    }
}
