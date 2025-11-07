import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Preço por litro da gasolina e álcool
        double precoAlcool = 1.90;
        double precoGasolina = 2.50;
        double desconto = 0;

        double valorSemDesconto, valorComDesconto;

        // Entradas
        System.out.println("=== POSTO DE GASOLINA ===");
        System.out.print("Digite o tipo de combustível (A-Álcool, G-Gasolina): ");
        String tipo = input.nextLine().trim().toUpperCase();

        System.out.print("Digite a quantidade de litros: ");
        double litros = input.nextDouble();

        // Estrutura de decisão
        if (tipo.equals("A")) {
            // Álcool
            if (litros <= 25) {
                desconto = 0.03; // 3.5%
            } else {
                desconto = 0.05; // 5.3%
            }
            valorSemDesconto = litros * precoAlcool;
            valorComDesconto = valorSemDesconto - (valorSemDesconto * desconto);

            System.out.println("\n=== NOTA DE COMPRA ===");
            System.out.println("Tipo de combustível: Álcool");
            System.out.println("Quantidade de litros: " + litros);
            System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorComDesconto));

        } else if (tipo.equals("G")) {
            // Gasolina
            if (litros <= 35) {
                desconto = 0.04; // 4%
            } else {
                desconto = 0.06; // 6%
            }
            valorSemDesconto = litros * precoGasolina;
            valorComDesconto = valorSemDesconto - (valorSemDesconto * desconto);

            System.out.println("\n=== NOTA DE COMPRA ===");
            System.out.println("Tipo de combustível: Gasolina");
            System.out.println("Quantidade de litros: " + litros);
            System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorComDesconto));

        } else {
            System.out.println("Tipo de combustível inválido!");
        }

        input.close();
    }
}

