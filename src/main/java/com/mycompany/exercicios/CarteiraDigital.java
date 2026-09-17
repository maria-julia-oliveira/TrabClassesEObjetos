
package com.mycompany.exercicios;


public class CarteiraDigital {
    public String titular;
    public Double saldo;
    public Integer numeroTransacoes;
    
    
    public CarteiraDigital(String titular, Double saldo, Integer numeroTransacoes){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroTransacoes = numeroTransacoes;
 
    }
    
    public String receber(double valor){
        this.saldo += valor;
        this.numeroTransacoes += 1;
        return "\n Saldo atualizado!";
    }
    
    public String pagar(double valor){
        if(this.saldo >= 0 && valor <= this.saldo){
            this.saldo -= valor;
            return "\nO valor é positivo!" + "\nSaldo suficiente!";
        }else{
            return "\nO valor é negativo!" + "\nSaldo insuficiente!";
        }
    }
    
    public String consultarSaldo(){
        return "\n Saldo: " + this.saldo;
    }
    
    public String exibirExtrato(){
        return "\nTitular: " + this.titular + "\nSaldo: " + this.saldo +  "\nNúmero de Transações: " + this.numeroTransacoes;
    }
}
