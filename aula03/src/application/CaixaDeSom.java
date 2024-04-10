package application;

public class CaixaDeSom {
    private String marca;
    private String name;
    private String cor;
    private double price; // attr privado, metedos gets e sets lá em baixo.

    public CaixaDeSom() {
        this("", "", "", 0);
    }

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

    // GETS:

    public double getPrice() {
        return this.price;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getName() {
        return this.name;
    }

    public String getCor() {
        return this.cor;
    }

    // SETS:

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
