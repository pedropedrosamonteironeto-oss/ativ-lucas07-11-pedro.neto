import java.util.Scanner;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int respostasPositivas = 0; // contador de respostas "sim"

        System.out.println("Responda as perguntas com 'sim' ou 'nao'.\n");

        System.out.print("1. Telefonou para a vítima? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("2. Esteve no local do crime? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("3. Mora perto da vítima? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("4. Devia para a vítima? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("5. Já trabalhou com a vítima? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("6. Foi vista nas proximidades no dia do crime? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("7. Tentou fugir após o crime? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        System.out.print("8. Mentiu durante o interrogatório? ");
        if (input.next().equalsIgnoreCase("sim")) respostasPositivas++;

        // Classificação de acordo com as respostas
        String classificacao;

        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas >= 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        // Resultado final
        System.out.println("\n---- Resultado da Investigação ----");
        System.out.println("Respostas positivas: " + respostasPositivas);
        System.out.println("Classificação: " + classificacao);

        input.close();
    }
}

