/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Animal {
    String nome;
    int idade;
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void emitirSom() {
        System.out.printf("Animal desconhecido esta emitindo som");
    }
}
