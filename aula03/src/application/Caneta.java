package application;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro, a caneta está tampada!");
        } else {
            System.out.println("Rabiscou");
        }
    }

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }
}
