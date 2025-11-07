import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o valor da sua hora: R$ ");
        double valorHora = input.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();

        // Cálculo do salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Cálculo do IR (Imposto de Renda)
        double percentualIR;
        if (salarioBruto <= 1518) {
            percentualIR = 0;
        } else if (salarioBruto <= 2700) {
            percentualIR = 5;
        } else if (salarioBruto <= 3400) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        double valorIR = salarioBruto * (percentualIR / 100);

        // Cálculo do INSS (10%)
        double valorINSS = salarioBruto * 0.10;

        // Cálculo do FGTS (11%) - não desconta do salário
        double valorFGTS = salarioBruto * 0.11;

        // Cálculo do total de descontos e salário líquido
        double totalDescontos = valorIR + valorINSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        // Exibição dos resultados
        System.out.println("\n---- Folha de Pagamento ----");
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (" + percentualIR + "%): R$ " + valorIR);
        System.out.println("(-) INSS (10%): R$ " + valorINSS);
        System.out.println("FGTS (11%): R$ " + valorFGTS);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        input.close();
    }
}
