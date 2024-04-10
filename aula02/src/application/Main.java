package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criou o objeto do tipo caneta.
        Caneta bicAzul = new Caneta();

        bicAzul.cor = "Azul";
        bicAzul.ponta = 0.5;
        bicAzul.destampar();
        bicAzul.carga = 90;
        bicAzul.modelo = "Tradicional";
        bicAzul.status();
        bicAzul.rabiscar();

        System.out.println("----------");

        // criei um outro objeto caneta com propriedades/dados diferentes.
        Caneta bicPreta = new Caneta();

        bicPreta.cor = "Preto";
        bicPreta.modelo = "Tradicional";
        bicPreta.tampar();
        bicPreta.ponta = 1.5;
        bicPreta.carga = 50;
        bicPreta.status();
        bicPreta.rabiscar();

        System.out.println("------");

        // Exercicio:

        CaixaDeSom flip5 = new CaixaDeSom("JBL", "Flip 5", "Cinza", 685.49);
        CaixaDeSom boombox = new CaixaDeSom("JBL", "Boombox", "Preto", 1685.49);

        System.out.println("flip5 name: " + flip5.name);
        System.out.println("flip5 cor: " + flip5.cor);
        flip5.tocarMusica();
        flip5.aumentarVolume();

        System.out.println("boombox name: " + boombox.name);
        System.out.println("boombox cor: " + boombox.cor);
        boombox.abaixarVolume();
        boombox.pausarMusica();

        sc.close();
    }
}