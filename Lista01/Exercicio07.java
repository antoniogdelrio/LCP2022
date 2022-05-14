/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Exercicio07 {    
    double result;
    
    public Exercicio07 (double x) {
        this.result = x;
    }
    
    public Exercicio07 (double x, double y) {
        this.result = x + Math.pow(y, 2);
    } 
    
    public Exercicio07 (double x, double y, double z) {
        this.result = x + Math.pow(y, 2) + Math.pow(z, 3);
    }
    
    public Exercicio07 (double x, double y, double z, double w) {
        this.result = x + Math.pow(y, 2) + Math.pow(z, 3) + Math.pow(w, 4);
    }
    
    public static void main(String[] args) {
        var calculo1 = new Exercicio07(3);
        var calculo2 = new Exercicio07(3, 4);
        var calculo3 = new Exercicio07(2, 5, 12);
        var calculo4 = new Exercicio07(3, 6, 8, 20);
        
        System.out.printf("Resultado 1: %.2f\n", calculo1.result);
        System.out.printf("Resultado 2: %.2f\n", calculo2.result);
        System.out.printf("Resultado 3: %.2f\n", calculo3.result);
        System.out.printf("Resultado 4: %.2f\n", calculo4.result);

        
    }
}
