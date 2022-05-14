
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
    double firstNumber;
    double secondNumber;
    double thirdNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(double thirdNumber) {
        this.thirdNumber = thirdNumber;
    }
    
    public void sum() {
        double sum = this.getFirstNumber() + this.getSecondNumber() + this.getThirdNumber();
        System.out.printf("Soma: %f\n", sum);
    }
    
    public void product() {
        double product = this.getFirstNumber() * this.getSecondNumber() * this.getThirdNumber();
        System.out.printf("Produto: %f\n", product);
    }
    
    public void sorted() {
        double menor = this.getFirstNumber();
        double maior = this.getFirstNumber();
        double meio = this.getFirstNumber();
      
        if (menor >= this.getSecondNumber()) {
            menor = this.getSecondNumber();
        } 
        if (menor >= this.getThirdNumber()) {
            menor = this.getThirdNumber();
        }
        
        if (maior <= this.getSecondNumber()) {
            maior = this.getSecondNumber();
        }
        if (maior <= this.getThirdNumber()) {
            maior = this.getThirdNumber();
        }
        
        if (this.getSecondNumber() != maior && this.getSecondNumber() != menor) {
            meio = this.getSecondNumber();
        }
        if (this.getThirdNumber() != maior && this.getThirdNumber() != menor) {
            meio = this.getThirdNumber();
        }
        
        System.out.printf("Valores ordenados: %f, %f, %f\n", menor, meio, maior);
    }
    
    public static void main(String[] args) {
        var exercicio02 = new Exercicio02();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        exercicio02.setFirstNumber(scan.nextDouble());
        
        System.out.println("Digite o segundo número: ");
        exercicio02.setSecondNumber(scan.nextDouble());
        
        System.out.println("Digite o terceiro número: ");
        exercicio02.setThirdNumber(scan.nextDouble());
        
        exercicio02.sum();
        exercicio02.product();
        exercicio02.sorted();
    }
    
}
