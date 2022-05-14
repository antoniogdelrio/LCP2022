/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Retangulo implements Geometria {
    double area;
    double perimetro;
    double base;
    double altura;
    
    public Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea () {
        this.area = this.base * this.altura;
    }
    
    @Override
    public void definePerimetro () {
        this.perimetro = this.base * 2 + this.altura * 2;
    }
}
