
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */

public class Telefones {    
    static boolean checaEntradaValida (String telefone){
        if (telefone.matches("\\([0-9]{2}\\) ([0-9]{5})-[0-9]{4}")) {
            return true;
        }
        
        if (telefone.matches("\\([0-9]{2}\\) ([0-9]{4})-[0-9]{4}")) {
            return true;
        }
        
        if (telefone.matches("([0-9]{10})|([0-9]{11})")) {
            return true;
        }
        
        return false;
    }
    
    static void exibeTipoTelefone (String telefone) {
        if (telefone.matches("\\([0-9]{2}\\) ([0-9]{5})-[0-9]{4}")) {
            System.out.println("Este eh um numero de telefone celular");
            return;
        }
        
        if (telefone.matches("\\([0-9]{2}\\) ([0-9]{4})-[0-9]{4}")) {
            System.out.println("Este eh um numero de telefone residencial");
            return;
        }
    }
    
    static String formatar (String telefone) {
        String ddd;
        String numeroParte1 = "";
        String numeroParte2 = "";
        
        if (telefone.matches("\\([0-9]{2}\\) ([0-9]{5})-[0-9]{4}") || telefone.matches("\\([0-9]{2}\\) ([0-9]{4})-[0-9]{4}")){
            return telefone;
        }
        
        ddd = telefone.substring(0, 2);
                
        if (telefone.substring(2).length() == 8) {
            numeroParte1 = telefone.substring(2, 6);
            numeroParte2 = telefone.substring(6);
        }
        
        if (telefone.substring(2).length() == 9) {
            numeroParte1 = telefone.substring(2, 7);
            numeroParte2 = telefone.substring(7);
        }
                
        return String.format("(%s) %s-%s", ddd, numeroParte1, numeroParte2);
    }
    
    static String[] splitTelefone (String telefone) {
        
        String[] splitted = telefone.split(" ");
        String ddd;
        String numero;
        String[] retorno = new String[2];
        
        ddd = splitted[0].substring(1, 3);
        numero = splitted[1].split("-")[0] + splitted[1].split("-")[1];
        
        retorno[0] = ddd;
        retorno[1] = numero;
        
        return retorno;
    }
    
    public static void main(String[] args) {
        /*
        Usuario pode inserir no formato "apenas numeros" (10 digitos ou 11 digitos)
        ou pode inserir já formatado com parênteses e hífen, por ex "(15) 1234-5698"
        Obs: foi implementado dessa forma pois não ficou claro para mim no enunciado se haveria
        formatação para o padrão com parenteses via código ou o usuario ja entraria com 
        o numero formatado corretamente, então o programa lida tanto com a entrada ja formatada 
        como tambem com a entrada sem formatação
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de telefone:");
        String telefone = scan.nextLine();
        String[] splitted;
        scan.close();
        
        if (!checaEntradaValida(telefone)) {
            System.out.println("Telefone inserido invalido");
            return;
        }
        
        telefone = formatar(telefone);
                
        exibeTipoTelefone(telefone);
        
        splitted = splitTelefone(telefone);
        
        System.out.printf("O DDD eh %s e o telefone eh %s\n", splitted[0], splitted[1]);
        
        return;
    }
}
