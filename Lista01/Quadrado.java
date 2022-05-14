/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Quadrado implements Geometria {
    
    double area;
    double perimetro;
    double lado;
    
    public Quadrado (double lado) {
        this.lado = lado;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea () {
        this.area = this.lado * this.lado;
    }
    
    @Override
    public void definePerimetro () {
        this.perimetro = this.lado * 4;
    }
}
