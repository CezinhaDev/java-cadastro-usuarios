package desafio.br.com.cadastro;

public class SomaImpares {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int i = 1; i <= 1000; i += 2) {
            soma += i;
            contador++;
        }

        System.out.println("Foram somados " + contador + " números ímpares.");
        System.out.println("Soma total: " + soma);
    }
}
