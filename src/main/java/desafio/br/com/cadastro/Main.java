package desafio.br.com.cadastro;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linguagem = "java";

        LocalDate dataEvento = LocalDate.of(2025, 9, 4);

        System.out.println("Desafio Java: Gerenciador de Cadastro de Usuários com Datas e Strings");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senhaStr = scanner.nextLine();

        System.out.println("Nome completo: " + nome);
        System.out.println("Nome em minúsculas: " + nome.toLowerCase());
        System.out.println("Nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("Primeira letra do nome: " + nome.charAt(0));
        System.out.println("Última letra do nome: " + nome.charAt(nome.length() - 1));

        if (linguagem.contains("java") && email.equalsIgnoreCase("cesar@gmail.com") && senhaStr.contains("123")) {
            System.out.println("Contém \"Java\"?: true");
            System.out.println("E-mail válido? true");
            System.out.println("Senha confirmada? true");
        } else {
            System.out.println("Opss!! tem, alguma coisa errada");
        }

        System.out.println("Última posição da letra 'a': " + nome.lastIndexOf("a"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        LocalDate hoje = LocalDate.now();

        // Verifica se hoje é o aniversário
        LocalDate dataAniversarioEsteAno = dataNascimento.withYear(hoje.getYear());
        if (hoje.isEqual(dataAniversarioEsteAno)) {
            System.out.println("🎉 A data do aniversário é hoje!!!");
        } else if (hoje.isBefore(dataAniversarioEsteAno)) {
            System.out.println("🎂 A data do aniversário ainda vai chegar este ano.");
        } else {
            System.out.println("📅 A data do aniversário já passou este ano.");
        }

        // Idade atual
        int idade = Period.between(dataNascimento, hoje).getYears();
        System.out.println("Idade atual: " + idade + " anos");

        // Data de nascimento formatada
        System.out.println("Data de nascimento formatada: " + dataNascimento.format(formatter));

        // Data daqui a 10 anos
        LocalDate dataMais10Anos = dataNascimento.plusYears(10);
        System.out.println("Data daqui a 10 anos: " + dataMais10Anos.format(formatter));

        // Dias até o próximo aniversário
        LocalDate proximoAniversario = dataNascimento.withYear(hoje.getYear());
        if (proximoAniversario.isBefore(hoje)) {
            proximoAniversario = proximoAniversario.plusYears(1);
        }
        long diasAteAniversario = ChronoUnit.DAYS.between(hoje, proximoAniversario);
        System.out.println("Dias até o próximo aniversário: " + diasAteAniversario + " dias");

        scanner.close();
    }
}
