import java.util.Scanner;

public class Main {

    public static int enunciado(Scanner scanner){
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Numero Seguinte");
        System.out.println("2 - Juntar Nomes");
        System.out.println("3 - Maior Número");
        System.out.println("4 - Soma de Números");
        System.out.println("5 - Média de Números");
        System.out.println("0 - Sair");
        int opcao = scanner.nextInt();
        return opcao;
    }

    public static int[] pedirNums(int[] numeros, Scanner scanner){
        System.out.println("Insira os números: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    public static double[] pedirNumsV(double[] numerosV, Scanner scanner){
        System.out.println("Insira os números: ");
        for (int i = 0; i < numerosV.length; i++) {
            numerosV[i] = scanner.nextInt();
        }
        return numerosV;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathHelper helper = new MathHelper();


        do {
            int opcao = enunciado(scanner);
            switch(opcao){
                case 0:
                    System.out.println("A sair...");
                    break;
                case 1:
                    System.out.println("Insira um número: ");
                    int numero = scanner.nextInt();
                    System.out.println("O número seguinte é " + helper.numeroSeguinte(numero));
                    break;
                case 2:
                    System.out.println("Insira o seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Insira o seu apelido: ");
                    String apelido = scanner.nextLine();
                    System.out.println("O seu nome completo é: " + helper.juntarNomes(nome, apelido));
                    break;
                case 3:
                    System.out.println("Quantos números deseja inserir: ");
                    int quantidade = scanner.nextInt();
                    int[] numeros = new int[quantidade];
                    numeros = pedirNums(numeros, scanner);
                    System.out.println("O maior número é o " + helper.maior(numeros));
                    break;
                case 4:
                    System.out.println("Quantos números deseja inserir: ");
                    int quantidadeSoma = scanner.nextInt();
                    numeros = new int[quantidadeSoma];
                    numeros = pedirNums(numeros, scanner);
                    System.out.println("O maior número é o " + helper.soma(numeros));
                    break;
                case 5:
                    System.out.println("Quantos números deseja inserir: ");
                    int quantidadeMedia = scanner.nextInt();
                    double[] numerosV = new double[quantidadeMedia];
                    numerosV = pedirNumsV(numerosV, scanner);
                    System.out.println("A média dos números é: " + helper.media(numerosV));
                    break;
                default:
                    System.out.println("Opção inválida, insira novamente");
                    break;
            }
        } while(opcao != 0);


    }
}