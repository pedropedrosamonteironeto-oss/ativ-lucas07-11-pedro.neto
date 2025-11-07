
import java.util.Scanner;;
public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada do salário
        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salario = input.nextDouble();

        double percentual = 0;  // variável para armazenar o percentual de aumento

        // Verifica em qual faixa o salário se encontra
        if (salario <= 280.00) {
            percentual = 20;
        } else if (salario <= 700.00) {
            percentual = 15;
        } else if (salario <= 1500.00) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        // Calcula o valor do aumento e o novo salário
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;

        // Saída dos resultados
        System.out.println("\n---- Resultado do Reajuste ----");
        System.out.println("Salário antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);

        input.close();
    }
}

