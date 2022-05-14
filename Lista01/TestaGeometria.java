/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class TestaGeometria {
    
    public static void main(String[] args) {
        var quadrado1 = new Quadrado(3);
        var quadrado2 = new Quadrado(12);
        
        var retangulo1 = new Retangulo(3, 7);
        var retangulo2 = new Retangulo(5, 5);
        
        var triangulo1 = new Triangulo(3, 10);
        var triangulo2 = new Triangulo(4, 4);
        
        var circulo1 = new Circulo(1);
        var circulo2 = new Circulo(8);
        
        System.out.printf("Quadrado 1: Área %.2f; Perimetro %.2f\n", quadrado1.area, quadrado1.perimetro);
        System.out.printf("Quadrado 2: Área %.2f; Perimetro %.2f\n", quadrado2.area, quadrado2.perimetro);
        System.out.printf("Retangulo 1: Área %.2f; Perimetro %.2f\n", retangulo1.area, retangulo1.perimetro);
        System.out.printf("Retangulo 2: Área %.2f; Perimetro %.2f\n", retangulo2.area, retangulo2.perimetro);
        System.out.printf("Triangulo 1: Área %.2f; Perimetro %.2f\n", triangulo1.area, triangulo1.perimetro);
        System.out.printf("Triangulo 2: Área %.2f; Perimetro %.2f\n", triangulo2.area, triangulo2.perimetro);
        System.out.printf("Circulo 1: Área %.2f; Perimetro %.2f\n", circulo1.area, circulo1.perimetro);
        System.out.printf("Circulo 2: Área %.2f; Perimetro %.2f\n", circulo2.area, circulo2.perimetro);

    }
    
}
