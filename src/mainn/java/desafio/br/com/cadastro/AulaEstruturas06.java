package desafio.br.com.cadastro;

public class AulaEstruturas06 {
    public static void main(String[] args) {
        // imprima os valores de 1 a 7, imprima se é a ultil ou final de semana
        // considerando 1 como domingo

        System.out.println("Digite os dia da semana: ");

        byte dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia Util");
                break;

            default:
                System.out.println("Öpcao invalida");
                break;
        }

    }
}
