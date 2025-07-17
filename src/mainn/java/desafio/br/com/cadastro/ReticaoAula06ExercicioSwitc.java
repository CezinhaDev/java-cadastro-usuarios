package desafio.br.com.cadastro;

public class ReticaoAula06ExercicioSwitc {
    public static void main(String[] args) {
        int num = 50;

        for (int i = 0; i < num ; i++) {
            if(i > 25){
                break;// break quebra o laço
            }
            System.out.println(i);
        }
    }
}
