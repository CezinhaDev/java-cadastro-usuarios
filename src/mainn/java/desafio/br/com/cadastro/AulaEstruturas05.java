package desafio.br.com.cadastro;

public class AulaEstruturas05 {
    public static void main(String[] args) {
        // imprima o dia considerando o domingo

        byte dia = 5;
        //char, int, byte, short, enum, String

        switch (dia){
            case 1:{
                System.out.println("Domingo");
            }
            case 2: {
                System.out.println("Segunda-feira");
                break;
            }
            case 3: {
                System.out.println("Terça-feira");
                break;
            }
            case 4: {
                System.out.println("Quarta-feira");
                break; // depois de todos os casos usamos o break para ele para
            }
            case 5: {
                System.out.println("Quinta-feira");
                break;
            }
            case 6: {
                System.out.println("Sexta-feira");
                break;
            }
            case 7: {
                System.out.println("Sábado");
                break;
            }
            default:
                System.out.println("Invalido!! Tente novamente");
                break;
        }

        char sexo = 'm';
        switch (sexo){
            case 'm':{
                System.out.println("ele é homem");
                break;
            }
            case 'f':{
                System.out.println("Ela é feminino");
                break;
            }
            default:
                System.out.println("Validamos seu caso!!");
        }
    }
}
