/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Passaro extends Animal {
    public Passaro (String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Piu");
    }

    public void voar() {
        System.out.printf("%s, o passaro, esta voando\n", this.nome);
    }
}
