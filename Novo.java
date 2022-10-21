package Treinamento;

public class Novo extends  Imovel {

    private final static int percent = 15;

    public Novo(String endereco, int preco) {
        super(endereco, preco);
    }


    public void PrecodoImovel() {
        int preimovel;
        preimovel = this.getPreco()+((this.getPreco()*percent)/100);
        System.out.println("Preco do imovel novo com o valor adicional de: " + preimovel);
    }


    public void ImprimirDados(){
        int x = this.getPreco()+((this.getPreco()*percent)/100) - this.getPreco();
        System.out.println("O valor adicional de " + x);
    }
}
