/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Circulo implements Geometria {
    double area;
    double perimetro;
    double raio;
    
    public Circulo (double raio) {
        this.raio = raio;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea () {
        this.area = Math.PI * this.raio * this.raio;
    }
    
    @Override
    public void definePerimetro () {
        this.perimetro = 2 * Math.PI * this.raio;
    }
}
