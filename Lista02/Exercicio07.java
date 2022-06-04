
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
class Aluno {
    String nome;
    String ra;
    int idade;
    String curso;

    public Aluno(String nome, String ra, int idade, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.curso = curso;
    }
}

public class Exercicio07 {
    static public int findAlunoByRA(ArrayList<Aluno> listaAlunos, String ra) {
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (ra.equals(listaAlunos.get(i).ra)) {
                return i;
            }
	}
        
        return -1;
    }
    
    static public ArrayList<Aluno> adicionarAluno (ArrayList<Aluno> listaAlunos, Aluno aluno) {
        
        if (findAlunoByRA(listaAlunos, aluno.ra) != -1) {
            System.out.println("RA ja existente no sistema");
            return listaAlunos;
        }
        
        listaAlunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso");
        
        return listaAlunos;
    }
    
    static public ArrayList<Aluno> removerAluno (ArrayList<Aluno> listaAlunos, String ra) {
        
        int idx = findAlunoByRA(listaAlunos, ra);
        
        if (idx == -1) {
            System.out.println("Sistema nao possui aluno com esse RA cadastrado");
            return listaAlunos;
        }
        
        listaAlunos.remove(idx);
        System.out.println("Aluno removido com sucesso");
        
        return listaAlunos;
    }
    
    public static void main(String[] args) {
        
        boolean exit = false;
        
        String nome = "";
        String ra = "";
        int idade;
        String curso;
        
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
            
        System.out.println("CADASTRO DE ALUNOS");
            
        Scanner scan = new Scanner(System.in);
        int comando;     
        
        do {
            System.out.println("Digite 1 para adicionar aluno");
            System.out.println("Digite 2 para remover aluno");
            System.out.println("Digite 3 para sair");
            
            comando = Integer.parseInt(scan.nextLine());
            
            switch (comando) {
                case 1:
                    System.out.println("ADICIONAR");
                    System.out.println("Digite o RA");
                    ra = scan.nextLine();
                    System.out.println("Digite o Nome");
                    nome = scan.nextLine();
                    System.out.println("Digite a idade");
                    idade = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite o Curso");
                    curso = scan.nextLine();
                    listaAlunos = adicionarAluno(listaAlunos, new Aluno(nome, ra, idade, curso));
                    break;
                case 2:
                    System.out.println("REMOVER");
                    System.out.println("Digite o RA do aluno a ser removido");
                    ra = scan.nextLine();
                    listaAlunos = removerAluno(listaAlunos, ra);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    exit = true;
                    break;
                default:
                    System.out.println("Comando invalido");
            }
            
            if (!listaAlunos.isEmpty()) {
                System.out.println("-------------------------------------------------");
                for(int i = 0; i < listaAlunos.size(); i++) {
                    System.out.printf("RA: %s; Nome: %s; Idade: %d; Curso: %s\n", listaAlunos.get(i).ra, listaAlunos.get(i).nome, listaAlunos.get(i).idade, listaAlunos.get(i).curso);
                }
                System.out.println("-------------------------------------------------");
            }
            
        } while (!exit);
    }
}
