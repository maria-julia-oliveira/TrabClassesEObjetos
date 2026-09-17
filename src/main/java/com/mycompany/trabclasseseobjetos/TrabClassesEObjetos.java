
package com.mycompany.trabclasseseobjetos;
import com.mycompany.exercicios.Pessoa;
import com.mycompany.exercicios.Produto;
import com.mycompany.exercicios.Livros;
import com.mycompany.exercicios.Veiculo;
import com.mycompany.exercicios.CarteiraDigital;

public class TrabClassesEObjetos {

    public static void main(String[] args) {
      // Pessoa lucas = new Pessoa("Lucas de Souza", 24, (float) 1.74);
       
        //System.out.printf("%s", lucas.exibirDados());
        //System.out.printf("%s", lucas.fazerAniversario());
        //System.out.printf("%s", lucas.exibirDados());
       
        //Produto morango = new Produto("Morango", (float) 4.50, 500);
        //System.out.printf("%s", morango.exibirResumo());;
        //System.out.printf("%s", morango.adicionarEstoque(20));
        //System.out.printf("%s", morango.adicionarEstoque(30));
        //System.out.printf("%s", morango.adicionarEstoque(100));
        //System.out.printf("%s", morango.vender(8));
        //System.out.printf("%s", morango.vender(10));
        //System.out.printf("%s", morango.vender(6));
       
        //Livros rainha_vermelha = new Livros ("Crepúsculo ", "Stephenie Meyer", 384, (float) 55.90);
        //System.out.printf("%s", rainha_vermelha.exibirDetalhes());
        //System.out.printf("%s", rainha_vermelha.aplicarDesconto(-20.00));
        
       
        //Veiculo porsche = new Veiculo("Porsche", "911 Carrera S (2025)", 2025, 7.1);
        //Veiculo lamborghini = new Veiculo("Lamborghini", "Miura SV at 55", 1971, 9.1);
        //System.out.printf("%s", porsche.exibirDados());
        //System.out.printf("%s", porsche.registrarViagem((double)400));
        //System.out.printf("%s", porsche.calcularTempo());
        //System.out.printf("%s", lamborghini.exibirDados());
        //System.out.printf("%s", lamborghini.registrarViagem((double)500));
        //System.out.printf("%s", lamborghini.calcularTempo());
        
        
        CarteiraDigital ana = new CarteiraDigital("Ana Barramas claro", 5000.00, 10);
        CarteiraDigital joana = new CarteiraDigital("joana Pitágoras", 200000.00, 3);
        CarteiraDigital hanna = new CarteiraDigital("Hanna Montana", 20.00, 3);
        
        
        System.out.printf("%s", ana.receber(400));
        System.out.printf("%s", ana.pagar(300.00));
        System.out.printf("%s", ana.consultarSaldo());
        System.out.printf("%s", ana.exibirExtrato());
        System.out.printf("%s", joana.receber(100000));
        System.out.printf("%s", joana.pagar(400.00));
        System.out.printf("%s", joana.consultarSaldo());
        System.out.printf("%s", joana.exibirExtrato());
         System.out.printf("%s",hanna.receber(1));
        System.out.printf("%s", hanna.pagar(400.00));
        System.out.printf("%s", hanna.consultarSaldo());
        System.out.printf("%s", hanna.exibirExtrato());
        
    }
}




       
 
