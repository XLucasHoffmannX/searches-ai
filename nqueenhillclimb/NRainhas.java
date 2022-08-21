package nqueenhillclimb;

import java.util.ArrayList;
import java.util.Random;

public class NRainhas {

    public void hillClimbing(Tabuleiro board) {
        Tabuleiro current = new Tabuleiro(board.getBoard());
        int globalMax = goal(current.getBoard().length);
        boolean localMax = false;
        while (true) {
            if (current.getSafePairs() == globalMax) {
                System.out.println(current.toString());
                break;
            } else {
                for (int i = 0; i < current.getBoard().length; i++) {
                    Tabuleiro nextAdj = exp(current, i);
                    if (nextAdj.getSafePairs() > current.getSafePairs()) {
                        current.setBoard(nextAdj.getBoard());
                        localMax = false;
                    } else {
                        localMax = true;
                    }
                }
                if (localMax) {
                    System.out.println(current.toString());
                    break;
                }
            }
        }
    }

    public Tabuleiro exp(Tabuleiro board, int i) {
        ArrayList<Tabuleiro> children = new ArrayList<Tabuleiro>();
        Tabuleiro child;

        for (int j = 0; j < board.getBoard().length; j++) {
            if (board.getBoard()[i][j] != 1) {
                int child1[][] = new int[board.getBoard().length][board.getBoard().length];
                child1[i][j] = 1;
                for (int k = 0; k < child1.length; k++) {
                    if (k != i) {
                        child1[k] = board.getBoard()[k];
                    }
                }
                children.add(new Tabuleiro(child1));
            }
        }
        child = children.get(0);

        for (int c = 1; c < children.size(); c++) {
            int best = child.getSafePairs();
            int next = children.get(c).getSafePairs();

            if (next > best) {
                child = children.get(c);
            } else if (next == best) {
                Random r = new Random();
                int random = (r.nextInt(2));
                if (random == 1) {
                    child = children.get(c);
                }
            }
        }
        return child;
    }

    public int goal(int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += i;
        }
        return sum;
    }
}
