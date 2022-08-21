package nqueentemperasimulada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NRainhas n = new NRainhas();
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de rainhas (4 a 16) ");
        int queens = sc.nextInt();

        while (queens < 4 || queens > 16) {
            System.out.println("Informe um número válido de rainhas!");
            System.out.print("Informe o número de rainhas (4 a 16) ");
            queens = sc.nextInt();
        }

        Tabuleiro board = new Tabuleiro(queens);
        System.out.println("Tabuleiro gerado: \n" + board.toString());

        System.out.println("Melhor Solução encontrada: ");
        n.tempera(board);
        
        sc.close();
    }
}
