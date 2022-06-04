
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Antonio
 */
public class JogoVelha {
    int jogador;
    int vencedor;
    int[][] tabuleiro;
    
    public char retornaSimbolo(int posicao) {
        if (posicao == 1) {
            return 'X';
        } else if (posicao == 2) {
            return 'O';
        } else {
            return '_';
        }
    }
    
    void trocaVezDeJogar () {
        if (jogador == 1) {
            jogador = 2;
        } else {
            jogador = 1;
        }
    }
    
    boolean posicaoValida (int posicao) {
        return (posicao >= 0 && posicao <= 2);
    }
    
    public boolean temJogada (int jogada) {
        if (jogada == 1 || jogada == 2) {
            return true;
        }
        return false;
    }
    
    public boolean checaVencedor () {
        for (int i = 0; i < tabuleiro.length; i++) {
            if ( temJogada(tabuleiro[i][0]) && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1]  == tabuleiro[i][2] ) {
                vencedor = tabuleiro[i][0];
                return true;
            }
        }
        
        for (int j = 0; j < tabuleiro.length; j++) {
            if ( temJogada(tabuleiro[0][j]) && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j]  == tabuleiro[2][j] ) {
                vencedor = tabuleiro[0][j];
                return true;
            }
        }
        
        if (temJogada(tabuleiro[0][0]) && tabuleiro[0][0] == tabuleiro [1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            vencedor = tabuleiro[0][0];
            return true;
        }
        
        if (temJogada(tabuleiro[0][2]) && tabuleiro[0][2] == tabuleiro [1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            vencedor = tabuleiro[0][2];
            return true;
        }
        
        return false;
    }
    
    boolean checaFim() {
        
        boolean fim = true;
        boolean temVencedor = false;
        
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (!temJogada(tabuleiro[i][j])){
                    fim = false;
                    break;
                }
            }
            if (!fim) break;
        }
        
        temVencedor = checaVencedor();
        
        if (temVencedor) {
            System.out.printf("Jogador %d venceu o jogo!\n", vencedor);
        }
        
        if (!temVencedor && fim) {
            System.out.printf("Fim de jogo. Ninguem ganhou.\n");
        }
        
        return temVencedor || fim;
    }

    public JogoVelha(){
        tabuleiro = new int[3][3];
        jogador = 1;
    }
    
    void renderizarTabuleiro () {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
               System.out.printf("%c ", retornaSimbolo(tabuleiro[i][j]));
            }
            System.out.println();
        }
    }
    
    void jogada () {
        
        int jogadaLinha;
        int jogadaColuna;
        boolean jogadaInvalida = true;
        boolean posicaoInvalida = false;
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Vez do Jogador %d\n", jogador);
        
        do {
            System.out.print("Digite a linha em que voce quer fazer a jogada: ");
            jogadaLinha = Integer.parseInt(scan.nextLine());
            if (!posicaoValida(jogadaLinha)) {
                System.out.print("Posicao de jogo invalida!\n");
                posicaoInvalida = true;
            }
            System.out.print("Digite a coluna em que voce quer fazer a jogada: ");
            jogadaColuna = Integer.parseInt(scan.nextLine());
            if (!posicaoValida(jogadaColuna)) {
                System.out.print("Posicao de jogo invalida!\n");
                posicaoInvalida = true;
            }
            
            if (posicaoInvalida) {
                posicaoInvalida = false;
                continue;
            }
                        
            if (temJogada(tabuleiro[jogadaLinha][jogadaColuna])) {
                System.out.print("Voce nao pode jogar nessa posicao do tabuleiro, pois alguem ja jogou!\n");
            } else {
                jogadaInvalida = false;
            }
            
        } while(jogadaInvalida);
        
        tabuleiro[jogadaLinha][jogadaColuna] = jogador;
        
        renderizarTabuleiro();
        
        trocaVezDeJogar();
        System.out.println("");
        
    }
    
    public static void main(String[] args) {
        
        JogoVelha game = new JogoVelha();
        
        while (!game.checaFim()) {
            game.jogada();
        }
        
    }
    
}
