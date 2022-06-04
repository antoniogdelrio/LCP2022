
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Exercicio01 {
    static boolean isPreposition (String s) {
        return s.toLowerCase().matches("da|de|do");
    }
    
    static String formatName (String s) {
        String[] splittedName = s.split(" ");
        
        String formatted = "";
        
        for (String word: splittedName) {
            if ( isPreposition(word) ) {
                formatted += word.toLowerCase();
            } else {
                formatted +=  word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
            
            formatted += " ";
        }
        
        return formatted.trim();
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome:");
        String name = scan.nextLine();
        scan.close();        
        
        System.out.printf("Nome formatado: %s\n", formatName(name));
        
    }
}
