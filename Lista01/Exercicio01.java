
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
    int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public static void main(String[] args) {
        var exercicio01 = new Exercicio01();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de asteriscos a serem exibidos:");
        exercicio01.setNumber(scan.nextInt());
        
        if (exercicio01.getNumber() < 1 || exercicio01.getNumber() > 20) {
            System.out.println("Número inválido");    
        }
        
        for (int i = 1; i <= exercicio01.getNumber(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
