/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Biblioteca {
    
    public static void main(String[] args) {
        var livroGratuito = new LivroGratuito();
        var livroGratuito2 = new LivroGratuito();
        var livroPago = new LivroPago();
        var livroPago2 = new LivroPago();
        
        livroGratuito.setTitulo("Iracema");
        livroGratuito2.setTitulo("Harry Potter e a Pedra Filosofal");
        
        livroPago.setTitulo("O Senhor dos Aneis");
        livroPago.setValor(35.00);
        
        livroPago2.setTitulo("O Código da Vinci");
        livroPago2.setValor(25.00);
        
        System.out.print("Livros disponíveis:\n\n");
        System.out.println("Livros Gratuitos:");
        System.out.printf("%s\n", livroGratuito.titulo);
        System.out.printf("%s\n\n", livroGratuito2.titulo);
        System.out.println("Livros Pagos:");
        System.out.printf("%s -> R$ %.2f\n", livroPago.titulo, livroPago.valor);
        System.out.printf("%s -> R$ %.2f\n", livroPago2.titulo, livroPago2.valor);
    }
    
}
