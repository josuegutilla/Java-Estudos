package application;

public class Teclado {
    private String marca;
    private String cor;
    private double price;
    private boolean led;

    public Teclado() {
        this("", "", 0, false);
    }

    public Teclado(String marca, String cor, double price, boolean led) {
        this.marca = marca;
        this.cor = cor;
        this.price = price;
        this.led = led;
    }

    public void digitarAlgo(String frase) {
        System.out.println("Digitando... " + frase);
    }


    // ---- MODIFICADORES DE ACESSO dos atributos ----

    //gets:
    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getLed() {
        return this.led;
    }

    // sets:
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

}
