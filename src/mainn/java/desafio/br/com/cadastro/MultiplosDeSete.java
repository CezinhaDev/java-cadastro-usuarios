package desafio.br.com.cadastro;

public class MultiplosDeSete {
    public static void main(String[] args) {
        int numero = 1;
        int contador = 0;

        System.out.println("Múltiplos de 7 entre 1 e 500:");

        while (numero <= 500) {
            if (numero % 7 == 0) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }

        System.out.println("\nTotal de múltiplos de 7 encontrados: " + contador);
    }
}
