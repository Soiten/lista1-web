import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // q01();
        // q02();
        // q03();
        // q04();
        // q05();
        // q06();
        // q07();
        // q08();
        // q09();
        // q10();
        // q11();
        // q12();
        // q13();
        // q14();
        // q15();
        // q16();
        // q17();
        q18();
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
        // Faça um programa na linguagem Java que receba três números pelo teclado e
        // mostre, no console, o
        // maior deles.
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
        // Faça um programa na linguagem Java que receba um número inteiro pelo teclado
        // e mostre, no console,
        // se o número inteiro é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par");
        } else {
            System.out.println("O número " + n + " é ímpar");
        }
        scanner.close();
    }

    private static void q11() {
        // Faça um programa na linguagem Java que receba um número inteiro pelo teclado
        // e mostre, no console,
        // se o número inteiro é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par");
        } else {
            System.out.println("O número " + n + " é ímpar");
        }
        scanner.close();
    }

    private static void q12() {
        // Faça um programa na linguagem Java que peça uma nota pelo teclado de 0 a 10.
        // Mostre uma
        // mensagem, no console, caso o valor seja inválido (nota menor que 0 ou maior
        // 10) e continue pedindo
        // notas até que o usuário informe um valor válido.
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

    private static void q13() {
        // Numa eleição existem três candidatos. Faça um programa na linguagem Java que
        // peça o número total de
        // eleitores pelo teclado. Peça para cada eleitor vota pelo teclado e, ao final,
        // mostre no console o número
        // de votos de cada candidato.
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;

        System.out.print("Digite o número de eleitores: ");
        Scanner scanner = new Scanner(System.in);
        int totalEleitores = scanner.nextInt();

        for (int i = 0; i < totalEleitores; i++) {
            System.out.print("Eleitor " + (i + 1) + ", escolha seu candidato (1, 2 ou 3): ");
            int voto = scanner.nextInt();
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
                    i--;
            }
        }

        System.out.println("Resultados da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        scanner.close();
    }

    private static void q14() {
        // Faça um programa na linguagem Java que receba, pelo teclado, 10 números
        // inteiros maior que 1,
        // verifique se cada número fornecido é primo ou não e mostre no console uma
        // mensagem de número
        // primo ou de número não primo. Um número é primo quando é divisível apenas por
        // 1 e por ele mesmo.
        int[] numeros = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro maior que 1: ");
            int n = scanner.nextInt();
            if (n <= 1) {
                System.out.println("Número inválido. Tente novamente.");
                i--;
                continue;
            } else {
                numeros[i] = n;
            }
        }

        for (int n : numeros) {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println(n + " não é primo.");
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(n + " é primo.");
            }
        }

        scanner.close();
    }

    private static void q15() {
        // Faça um programa na linguagem Java que mostre, no console, os primeiros 10
        // termos da sequência de Fibonacci: 0-1-1-2-3-5-8-13-21-34-...
        int anterior = 0;
        int atual = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(atual);
            int temp = atual;
            atual += anterior;
            anterior = temp;
            if (atual == 0)
                atual++;
        }
    }

    private static void q16() {
        // Faça um programa na linguagem Java que dado um número inteiro positivo lido
        // pelo teclado, calcule o
        // fatorial do número e mostre o resultado no console.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);
        scanner.close();
    }

    private static void q17() {
        // Faça um programa na linguagem Java que preencha, por meio do teclado, um
        // vetor de 5 números
        // inteiros e mostre-os no console.

        int[] numeros = new int[5];

        System.out.print("Digite 5 inteiros: ");

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Os números foram: ");
        for(int n : numeros){
            System.out.print(n + " ");
        }
        scanner.close();
    }

    private static void q18() {
        // Faça um programa na linguagem Java que preencha, por meio do teclado, um
        // vetor de 10 números reais
        // e mostre-os no console na ordem inversa.

        float[] numeros = new float[10];

        System.out.print("Digite 10 números: ");

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            numeros[i] = scanner.nextFloat();
        }

        System.out.print("Os números na ordem inversa: ");

        for(int i = 9; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
        scanner.close();
    }

    private static void q19() {
        // Faça um programa na linguagem Java que preencha por meio do teclado um vetor de 5 números inteiros
        // e, depois, mostre no console a soma dos 5 números, a multiplicação entre os 5 números e os 5 números

    }

    private static void q20() {
        // Faça um programa na linguagem Java que receba, pelo teclado, 20 números
        // inteiros e armazene-os em um vetor.
        // Armazene os números pares no vetor denominado “par” e os números
        // ímpares no vetor “ímpar”. Mostre no console os três vetores.

    }

    private static void q21() {
        // Faça um programa na linguagem Java que receba, pelo teclado, 2 Strings e
        // informe, pelo console, o conteúdo delas seguido do seu comprimento. Mostre
        // também, no console, se as
        // duas Strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.
    }

    private static void q22() {
        // Reverso do número. Faça um programa na linguagem Java que mostre, no console,
        // o reverso de um número inteiro informado pelo teclado. Por exemplo: 127 <-> 721

    }

    private static void q23() {
        // Calculadora básica. Faça um programa na linguagem Java que, recebidos pelo teclado dois valores
        // numéricos e a operação desejada (soma, subtração, multiplicação ou divisão)
        // mostre, no console, o resultado do cálculo.

    }

}