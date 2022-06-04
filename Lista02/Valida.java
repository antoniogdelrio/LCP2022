
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Valida {
    static boolean verificaRG (String rg) {
        if (rg.matches("[0-9]{1,2}.[0-9]{3}.[0-9]{3}-(X|[0-9]{1})")) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do RG:");
        String rg = scan.nextLine();
        scan.close();
        
        if (verificaRG(rg)) {
            System.out.println("RG valido");
        } else {
            System.out.println("RG invalido");
        }
        
    }
}
