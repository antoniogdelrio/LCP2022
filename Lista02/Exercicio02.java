
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Exercicio02 {
    static String mixStrings(String s1, String s2) {
        
        int tamanhoMenor = Integer.min(s1.length(), s2.length());
        int tamanhoMaior = Integer.max(s1.length(), s2.length());
        String mixed = "";
        int counter = 0;
        
        while ( counter < tamanhoMenor ) {
            mixed += s1.charAt(counter);
            mixed += s2.charAt(counter);
            counter++;
        }
        
        while ( counter < tamanhoMaior ) {
            if (s1.length() == tamanhoMaior) {
                mixed += s1.charAt(counter);
            } else {
                mixed += s2.charAt(counter);
            }
            
            counter++;
        }
                
        return mixed;
        
    }
    
    public static void main(String[] args) {
        
        String s1;
        String s2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string:");
        s1 = scan.nextLine();
        System.out.println("Digite outra string:");
        s2 = scan.nextLine();
        scan.close();
                
        String finalString = mixStrings(s1, s2);
        
        System.out.printf("String final: %s\n", finalString);
        
    }
}
