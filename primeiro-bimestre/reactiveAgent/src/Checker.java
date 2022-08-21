package reactiveAgent.src;

import java.util.Random;

public class Checker {
    private Random r = new Random();
    private A aRoom = new A(r.nextBoolean());
    private B bRoom = new B(r.nextBoolean());

    public void printCheck(){
        if (aRoom.isDirty() && bRoom.isDirty()) {
            System.out.println("Não encontrado sujeira sala B");
            System.out.println("Indo para a sala A");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Encontrado sujeira sala A");
            aRoom.setDirty(false);
            System.out.println("Limpando sala A...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sala A limpa");
            System.out.println("----------------------------------------------------------------");
        } else if (aRoom.isDirty() && bRoom.isDirty()) {
            System.out.println("Não encontrado sujeira sala A");
            System.out.println("Indo para a sala B...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Encontrado sujeira na sala B");
            bRoom.setDirty(false);
            System.out.println("Limpando Sala B...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sala B limpa");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Indo para a sala A...");
        } else if (aRoom.isDirty() && bRoom.isDirty()) {
            System.out.println("Encontrei sujeira na sala A");
            aRoom.setDirty(false);
            System.out.println("Limpando sala A...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sala A limpa");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Indo para a sala B...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Encontrado sujeira sala B");
            System.out.println("Limapando sala B...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sala B limpa");
            System.out.println("----------------------------------------------------------------");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
