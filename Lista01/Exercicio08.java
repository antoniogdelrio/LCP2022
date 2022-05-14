/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Exercicio08 {
    
    int x;
    int i;
    
    public Exercicio08 (int x) {
        this.x = x;
        this.obterQuantidadeDigitos();
    }
    
    public void obterQuantidadeDigitos() {
        int qtd = 1;
        int divisor = 10;
        
        while ((this.x / divisor) >= 1) {
            qtd++;
            divisor *= 10;
        }
        
        this.i = qtd;       
    }
    
    public void checaPremissa () {
        int acumulador = 0;
        int dividendo = this.x;
        int digito;
        
        while (dividendo >= 1) {
            digito = (int) dividendo % 10;
            acumulador += Math.pow(digito, this.i);
            dividendo = (int) dividendo / 10;
        }
        
        System.out.printf("Para o numero %d\n", this.x);
        if ( acumulador == this.x ) {
            System.out.println("A premissa é verdadeira\n");
        } else {
            System.out.println("A premissa é falsa\n");
        }
    }
    
    public static void main(String[] args) {
        var tentativa1 = new Exercicio08(153);
        tentativa1.checaPremissa();
        
        var tentativa2 = new Exercicio08(371);
        tentativa2.checaPremissa();
        
        var tentativa3 = new Exercicio08(565);
        tentativa3.checaPremissa();
    }
    
}
