package br.com.itaubank.exercicios1;

import br.com.itaubank.exercicios1.controller.dadosBancarios;

import java.util.Scanner;

public class exec01 {
    public static void main(String[] args) {
        dadosBancarios dadosBancarios = new dadosBancarios();

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("Itaú Bank");
            System.out.println("=================");
            System.out.println("""
                    Escolha uma opção:
                     1 - Consultar Saldo
                     2 - Consultar Cheque Especial
                     3 - Depositar Dinheiro
                     4 - Sacar Dinheiro
                     5 - Pagar um Boleto
                     6 - Verificar se esta usando cheque especial
                     7 - Sair"""
            );

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu Saldo atual é de: " + dadosBancarios.getSaldo());
                    break;

                case 2:
                    System.out.println("Cheque Especial: 100");
                    break;

                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    float deposito = scanner.nextFloat();
                    System.out.println("O seu saldo total é de: R$" + (dadosBancarios.getSaldo() + deposito));
                    break;

                case 4:
                    System.out.println("Digite o valor a ser sacado: ");
                    float saque = scanner.nextFloat();
                    System.out.println("Saldo: R$ " + (dadosBancarios.getSaldo() - saque));
                    break;

                case 5:
                    System.out.println("Digite o valor do boleto: ");
                    float valorBoleto = scanner.nextFloat();
                    System.out.println("Boleto gerado no valor de R$ " + (valorBoleto));
                    break;
                case 6:
                    System.out.println("Cheque Especial");
                    break;

                case 7:
                    System.out.println("Saindo... Obrigado por usar nossos Serviços");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }
        }
    }
}
