/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class Exercicio03 {
    String nome;
    int idade;
    double salario;
    
    double salarioLiquido;
    double totalContibuicaoFuncionario;
    double totalContribuicaoEmpresa;
    
    public void calculaSalarioLiquido() {
        double salarioNaoImpactado = 0;
        double salario = this.salario;
        if (this.salario > 5000) {
            salarioNaoImpactado = this.salario - 5000;
            salario = 5000;
        }
        
        if ( this.idade <= 30 ) {
            this.totalContibuicaoFuncionario = 0.2 * salario;
            this.totalContribuicaoEmpresa = 0.18 * salario;
        } else if ( this.idade <= 40 ) {
            this.totalContibuicaoFuncionario = 0.18 * salario;
            this.totalContribuicaoEmpresa = 0.15 * salario;
        } else if ( this.idade <= 50 ) {
            this.totalContibuicaoFuncionario = 0.12 * salario;
            this.totalContribuicaoEmpresa = 0.15 * salario;
        } else if ( this.idade <= 60 ) {
            this.totalContibuicaoFuncionario = 0.07 * salario;
            this.totalContribuicaoEmpresa = 0.10 * salario;
        } else {
            this.totalContibuicaoFuncionario = 0.03 * salario;
            this.totalContribuicaoEmpresa = 0.04 * salario;
        }
        
        this.salarioLiquido = this.salario - this.totalContibuicaoFuncionario;
        
    }
    
    public Exercicio03(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        
        this.calculaSalarioLiquido();
    }
    
    @Override
    public String toString() {
	return String.format("Salário do(a) funcionário(a) %s, %d anos: ", this.nome, this.idade)
                + String.format("R$ %.2f", this.salarioLiquido) + "\n"
                + "Contribuição do funcionário: R$ " + String.format("%.2f", this.totalContibuicaoFuncionario) + "\n"
                + "Contribuição da empresa: R$ " + String.format("%.2f", this.totalContribuicaoEmpresa) + "\n"; 
    }
    
    public static void main(String[] args) {
        var funcionario1 = new Exercicio03("Claudio", 25, 8000);
        var funcionario2 = new Exercicio03("Maria", 35, 5000);
        var funcionario3 = new Exercicio03("Francisco", 45, 6000);
        var funcionario4 = new Exercicio03("Lucas", 55, 6500);
        var funcionario5 = new Exercicio03("Luiza", 65, 4000);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);
    }
}
