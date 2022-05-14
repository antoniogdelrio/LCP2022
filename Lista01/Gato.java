/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Gato extends Animal {
    public Gato (String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void correr() {
        System.out.printf("%s, o gato, esta correndo\n", this.nome);
    }
    
    public void pular() {
        System.out.printf("%s, o gato, esta pulando\n", this.nome);
    }
}
