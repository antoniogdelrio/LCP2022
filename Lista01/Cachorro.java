/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Cachorro extends Animal {
    public Cachorro (String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void correr() {
        System.out.printf("%s, o cachorro, esta correndo\n", this.nome);
    }
}
