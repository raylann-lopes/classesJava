package br.com.itaubank.exercicios1;

import br.com.itaubank.exercicios1.controller.dadosBancarios;

import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        dadosBancarios bank = new dadosBancarios();
        bank.setSaldo(0);
        bank.getChequeEspecial();

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
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

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1 - Consultar Saldo");
                    System.out.println("Seu Saldo atual é de R$ " + bank.getSaldo());
                    break;

                case 2:
                    System.out.println("2 - Consultar Cheque Especial");
                    System.out.println("Cheque Especial: R$ " + bank.getChequeEspecial());
                    break;

                case 3:
                    System.out.println("3 - Depositar Dinheiro");
                    System.out.println("Digite o valor a ser depositado: ");
                    bank.setDeposito(scanner.nextFloat());
                    System.out.println("Vocë depositou R$ " + bank.getDeposito());
                    break;

                case 4:
                    System.out.println("4 - Sacar Dinheiro");
                    System.out.println("Digite o valor a ser sacado: ");
                    bank.setSaque(scanner.nextFloat());
                    System.out.println("Vocë sacou R$ " + bank.getSaque());
                    break;

                case 5:
                    System.out.println("5 - Pagar um Boleto");
                    System.out.println("Digite o valor do boleto: ");
                    bank.setBoleto(scanner.nextFloat());
                    System.out.println("Boleto pago no valor de R$ " + (bank.getBoleto()));
                    break;

                case 6:
                    System.out.println("6 - Verificar se esta usando cheque especial");
                    System.out.println("Cheque Especial");
                    break;

                case 7:
                    System.out.println("Saindo... Obrigado por usar nossos Serviços");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            if (continuar) {
                System.out.println("\n=================");
                System.out.println("Deseja fazer outra operação?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                System.out.print("Escolha uma opção: ");

                int resposta = scanner.nextInt();

                if (resposta == 2) {
                    System.out.println("Saindo... Obrigado por usar nossos Serviços");
                    continuar = false;
                } else if (resposta != 1) {
                    System.out.println("Opção inválida! Continuando...");
                }

                System.out.println();
            }
        }

        scanner.close();
    }
}
