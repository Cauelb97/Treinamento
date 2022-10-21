package Treinamento;

public abstract class Imovel implements  CalculoPrecoImovel{
    private String endereco;
    private int preco;

    public Imovel(String address, int price){
        this.endereco = address;
        this.preco = price;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}

