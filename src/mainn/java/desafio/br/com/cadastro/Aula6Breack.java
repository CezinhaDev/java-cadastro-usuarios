package desafio.br.com.cadastro;

public class Aula6Breack {
    //dado um valor de um carro descubra quantas vezes ele pode ser pacelado
    // VALOR DA PARCELA >=1000
    public static void main(String[] args) {
        double price = 30000.00;
        for (int parcela = 1; parcela <= price; parcela++) {
            double valorParcela = price / parcela;
            if (valorParcela >= 1000) {
                System.out.println("PARCELA: " + parcela + "R$: " + valorParcela);

            } else {
                break;
            }

        }
    }
}