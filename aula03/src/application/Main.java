package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criou o objeto do tipo caneta.
        Caneta bicAzul = new Caneta();

        bicAzul.cor = "Azul";
        bicAzul.setPonta(0.5);
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
        bicPreta.setPonta(1.5);
        bicPreta.carga = 50;
        bicPreta.status();
        bicPreta.rabiscar();

        System.out.println("---------");

        // Exercicio:

        // Instanciando um objeto do tipo CaixaDeSom e passando dados para o construtor:

        CaixaDeSom flip5 = new CaixaDeSom("JBL", "Flip 5", "Cinza", 685.49);
        CaixaDeSom boombox = new CaixaDeSom("JBL", "Boombox", "Preto", 1685.49);

        System.out.println("flip5 name: " + flip5.getName());
        System.out.println("flip5 cor: " + flip5.getCor());
        System.out.println("preco: " + flip5.getPrice());
        flip5.tocarMusica();
        flip5.aumentarVolume();

        System.out.println("boombox name: " + boombox.getName());
        System.out.println("boombox cor: " + boombox.getCor());
        System.out.println("preco: " + boombox.getPrice());
        boombox.abaixarVolume();
        boombox.pausarMusica();

        System.out.println("-----------");

        Teclado huskyBranco = new Teclado();

        huskyBranco.setMarca("Husky Blizard");
        huskyBranco.setCor("Branco");
        huskyBranco.setPrice(300);
        huskyBranco.setLed(true);

        huskyBranco.digitarAlgo("O josué é muito lindo");
        System.out.println("Marca teclado: " + huskyBranco.getMarca());
        System.out.println("Cor teclado: " + huskyBranco.getCor());
        System.out.println("Preço teclado: " + huskyBranco.getPrice());
        System.out.println("Tem led? " + huskyBranco.getLed());

        sc.close();
    }
}