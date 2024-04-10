package application;

public class CaixaDeSom {
    public String marca;
    public String name;
    public String cor;
    public double price;

    public CaixaDeSom(String marca, String name, String cor, double price) {
        this.marca = marca;
        this.name = name;
        this.cor = cor;
        this.price = price;
    }

    public void tocarMusica() {
        System.out.println("Tocando a musica...");
    }

    public void pausarMusica() {
        System.out.println("Pausando a musica...");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volueme...");
    }

    public void abaixarVolume() {
        System.out.println("Abaixando o valume...");
    }

}
