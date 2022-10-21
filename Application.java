package Treinamento;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Imovel imovel1 = new Novo("Rua Alfa", 4000);
        Imovel imovel2 = new Velho("Rua Bacupari", 4000);

        imovel1.PrecodoImovel();
        imovel1.ImprimirDados();
        imovel2.PrecodoImovel();
        imovel2.ImprimirDados();
    }
}
