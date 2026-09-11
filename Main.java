import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //q01();
        //q02();
        //q03();
        //q04();
        //q05();
        //q06();
        //q07();
        //q08();
        //q09();
        //q10();
        //q11();
        q12();
    }

    private static void q01() {
        // Faça um programa na linguagem Java que mostre a mensagem “Alô mundo!” na
        // tela.
        System.out.println("Alô mundo!");
    }

    private static void q02() {
        // Faça um programa na linguagem Java que peça um número pelo teclado
        // e então mostre a mensagem no console “O número informado foi [número].”
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        float numero = scanner.nextFloat();
        System.out.println("O número informado foi: " + numero);
        scanner.close();
    }

    private static void q03() {
        // Faça um programa na linguagem Java que receba 3 notas pelo teclado,
        // calcule e mostre a média aritmética no console.
        float soma = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            float numero = scanner.nextFloat();
            soma += numero;
        }
        scanner.close();

        System.out.println("A média foi " + Math.round(soma / 3 * 100) / 100.0);
    }

    private static void q04() {
        // Faça um programa na linguagem Java que receba um número em metros pelo
        // teclado,
        // converta em centímetros e mostre o resultado no console.
        System.out.print("Digite o número de metros: ");
        Scanner scanner = new Scanner(System.in);
        float numero = scanner.nextFloat();
        scanner.close();
        System.out.println("O número em centímetros é: " + Math.round(numero * 100));
    }

    private static void q05() {
        // Faça um programa na linguagem Java que calcule e mostre, no console, a área
        // de um círculo.
        // Sabe-se que a fórmula da área de um círculo é A = πr².
        System.out.print("Digite o raio do círculo: ");
        Scanner scanner = new Scanner(System.in);
        float raio = scanner.nextFloat();
        scanner.close();
        System.out.println("Area: " + Math.PI * Math.pow(raio, 2) + " m²");
    }

    private static void q06() {
        // Faça um programa na linguagem Java que pergunte, pelo teclado, o preço de
        // três produtos e informe, no console, qual
        // produto você deve comprar, sabendo que a decisão de comprar um produto é
        // sempre pelo mais barato.
        float menor = -1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o preço " + (i + 1) + ": ");
            float preco = scanner.nextFloat();
            if (i == 0 || preco < menor) {
                menor = preco;
            }
        }
        scanner.close();
        System.out.println("O produto mais barato custa: R$ " + menor);
    }

    private static void q07() {
        // Faça um programa na linguagem Java que receba N notas de um discente pelo
        // teclado, calcule e mostre
        // no console a média aritmética. Informe também no console se o discente foi
        // aprovado (média superior
        // ou igual a 7) ou reprovado.

        int n = 3;
        float soma = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            float numero = scanner.nextFloat();
            soma += numero;
        }
        scanner.close();

        double media = Math.round(soma / n * 100) / 100.0;
        System.out.println("A média foi: " + media);

        if (media >= 7) {
            System.out.println("O discente foi aprovado.");
        } else {
            System.out.println("O discente foi reprovado.");
        }
    }

    private static void q08() {
        // Faça um programa na linguagem Java que para calcular a média final (MF) de um
        // discente entre duas
        // notas, recebidas pelo teclado, de um discente e mostrar sua situação, que
        // pode ser:
        // a. aprovado (MF >= 7), se (MF >= 4) e (MF < 7) o discente fará uma AF;
        // b. aprovado também se (AF >= 4) e ((MF + AF) / 2 >= 5); e
        // c. reprovado nos demais casos.
        // Se o discente precisar da AF, informe pelo teclado a nota da AF e mostre
        // também, no console, a MF com
        // ou sem AF e o resultado final. A MF quando o discente precisar de AF é
        // calculada pela fórmula ((MF + AF)/ 2).

        float soma = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            float numero = scanner.nextFloat();
            soma += numero;
        }

        double media = Math.round(soma / 2 * 100) / 100.0;
        System.out.println("A média foi: " + media);

        if (media >= 7) {
            System.out.println("O discente foi aprovado.");
        } else if (media >= 4) {
            System.out.print("Digite a nota da AF: ");
            float af = scanner.nextFloat();
            double mediaFinal = Math.round((media + af) / 2 * 100) / 100.0;
            System.out.println("A média final foi: " + mediaFinal);
            if (mediaFinal >= 5) {
                System.out.println("O discente foi aprovado.");
            } else {
                System.out.println("O discente foi reprovado.");
            }
        } else {
            System.out.println("O discente foi reprovado.");
        }

        scanner.close();
    }

    private static void q09() {
        //Faça um programa na linguagem Java que receba três números pelo teclado e mostre, no console, o
        //maior deles.
        float maior = -1;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            float n = scanner.nextFloat();
            if (i == 0 || n > maior) {
                maior = n;
            }
        }
        scanner.close();
        System.out.println("O maior número foi o " + maior);
    }
    
    private static void q10() {
        //Faça um programa na linguagem Java que receba um número inteiro pelo teclado e mostre, no console,
        //se o número inteiro é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        if(n%2==0){
            System.out.println("O número " + n + " é par");
        } else {
            System.out.println("O número " + n + " é ímpar");
        }
        scanner.close();
    }

    private static void q11() {
        //Faça um programa na linguagem Java que receba um número inteiro pelo teclado e mostre, no console,
        //se o número inteiro é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        if(n%2==0){
            System.out.println("O número " + n + " é par");
        } else {
            System.out.println("O número " + n + " é ímpar");
        }
        scanner.close();
    }

    private static void q12() {
        //Faça um programa na linguagem Java que peça uma nota pelo teclado de 0 a 10. Mostre uma
        //mensagem, no console, caso o valor seja inválido (nota menor que 0 ou maior 10) e continue pedindo
        //notas até que o usuário informe um valor válido.
        Scanner scanner = new Scanner(System.in);
        int nota = -1;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Tente novamente.");
            } else {
                System.out.println("Nota válida: " + nota);
                break;
            }
        } while (true);

        scanner.close();
    }

}