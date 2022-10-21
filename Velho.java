package Treinamento;

public class Velho extends Imovel{

    private final static int percent = 8;

    public Velho(String endereco, int preco) {
        super(endereco, preco);
    }

    public void PrecodoImovel() {
        int preimovel ;
        preimovel = this.getPreco()-((this.getPreco()*percent)/100);
        System.out.println("Preco do imovel velho com o desconto de: " + preimovel);
    }


    public void ImprimirDados(){
        int precoadicional =  this.getPreco() - (this.getPreco()-((this.getPreco()*percent)/100));
        System.out.println("O valor do desconto  " + precoadicional);
    }
}

