package C04_Comando_Condicional_IF_E_Expressões_Booleanas;

import java.util.Scanner;
public class Valor_PPV {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cidade;
        int pacote;
        double dias_ppv, valorExtra, contaTotal, valor_ppv;
        System.out.println("Informe o código do seu pacote: ");
        pacote = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Informe sua cidade (Sem abreviações): ");
        cidade = teclado.nextLine();
        System.out.println("Informe o valor dos serviços extras: ");
        valorExtra = teclado.nextDouble();
        System.out.println("Informe a quantidade de dias que o pay-per-view foi utilizado: ");
        dias_ppv = teclado.nextDouble();

        if (pacote == 1) {
            valor_ppv = (dias_ppv * 1.20);
            if (valor_ppv > 65) {
                valor_ppv = 65;
            }
            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                contaTotal = (65.0 + valor_ppv + valorExtra);
            } else {
                if (cidade.equalsIgnoreCase("São Paulo")) {
                    contaTotal = (65.0 + valor_ppv + valorExtra);
                    contaTotal = (contaTotal+(contaTotal * 0.01));
                } else {
                    if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                        contaTotal = (65.0 + valor_ppv + valorExtra);
                        contaTotal = (contaTotal+ (contaTotal * 0.015));
                    } else {
                        contaTotal = (65 + valor_ppv + valorExtra);
                        contaTotal = (contaTotal+(contaTotal * 0.02));
                    }
                }
            }
        } else {
            if (pacote == 2) {
                valor_ppv = (dias_ppv * 2.10);
                if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                    contaTotal = (104.0 + valor_ppv + valorExtra);
                } else {
                    if (cidade.equalsIgnoreCase("São Paulo")) {
                        contaTotal = (104.0 + valor_ppv + valorExtra);
                        contaTotal = (contaTotal+(contaTotal * 0.01));
                    } else {
                        if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                            contaTotal = (104.0 + valor_ppv + valorExtra);
                            contaTotal = (contaTotal+ (contaTotal * 0.015));
                        } else {
                            contaTotal = (104.0 + valor_ppv + valorExtra);
                            contaTotal = (contaTotal+(contaTotal * 0.02));
                        }
                    }
                }
            } else {
                valor_ppv = (dias_ppv * 0.0);
                if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                    contaTotal = (137.0 + valor_ppv + valorExtra);
                } else {
                    if (cidade.equalsIgnoreCase("São Paulo")) {
                        contaTotal = (137.0 + valor_ppv + valorExtra);
                        contaTotal = (contaTotal+(contaTotal * 0.01));
                    } else {
                        if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                            contaTotal = (137.0 + valor_ppv + valorExtra);
                            contaTotal = (contaTotal+ (contaTotal * 0.015));
                        } else {
                            contaTotal = (137.0 + valor_ppv + valorExtra);
                            contaTotal = (contaTotal+(contaTotal * 0.02));
                        }
                    }
                }
            }
        }
        teclado.close();
        System.out.printf("Valor da conta = %.2f",contaTotal);
    }
}