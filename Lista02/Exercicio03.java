
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Exercicio03 {
    static boolean isPalyndrom (String s) {
        StringBuilder palyndrom = new StringBuilder(s);
        String reverse = palyndrom.reverse().toString();
        
        boolean isPalyndrom = true;
                
        for ( int i = 0; i < reverse.length(); i++ ) {
            
            if ( s.toLowerCase().charAt(i) != reverse.toLowerCase().charAt(i) ) {
                isPalyndrom = false;
            }
            
        }
        
        return isPalyndrom;
    }
    
    public static void main(String[] args) {
        
        
        String s;
                
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        s = scan.nextLine();
        scan.close();
        
        if (isPalyndrom(s)) {
            System.out.printf("Eh palindromo");
        } else {
            System.out.printf("Nao eh palindromo");
        }
        
    }
}
