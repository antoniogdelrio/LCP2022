/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class ChamaAnimal {
    public static void main(String[] args) {
        var cachorro = new Cachorro("Bob", 5);
        cachorro.emitirSom();
        cachorro.correr();
        
        var gato = new Gato("Felix", 10);
        gato.emitirSom();
        gato.correr();
        gato.pular();
        
        var passaro = new Passaro("Maria", 3);
        passaro.voar();
    }
}
