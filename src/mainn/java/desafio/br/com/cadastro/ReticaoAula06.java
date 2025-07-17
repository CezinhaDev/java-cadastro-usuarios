package desafio.br.com.cadastro;

import javax.swing.plaf.IconUIResource;

public class ReticaoAula06 {
    public static void main(String[] args) {
        //while, do while, for
        int cont = 0; // ele so exeuta se tudo for true
        while(cont < 10){ // ele executa ate 10
            System.out.println(cont);
            cont += 2; // pode usar dessa forma, ou atrinuir o cont = cont +1
        }

        do {
            System.out.println("Lendo o do while");// do while ele executa pelo menos umas vez se for verdadeiro
        }while (cont < 10);

        for (int i = 0; i < 10; i++) { // mais utilizado para contar, usando para lista
            System.out.println("soma mais: "+ i);
        }

    }
}
