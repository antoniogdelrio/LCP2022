/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Triangulo implements Geometria {
    double area;
    double perimetro;
    double base;
    double altura;
    
    public Triangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea () {
        this.area = (this.base * this.altura) / 2;
    }
    
    @Override
    public void definePerimetro () {
        this.perimetro = this.base + this.altura + Math.sqrt(this.base*this.base + this.altura*this.altura);
    }
}
