package com.trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeArrayList {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        String entrada = "";
        int soma = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double desvioPadrao = 0;
        double media = 0;
        int moda = 0;
        int maiorFrequencia = 0;
        double somaQuadrados = 0;

        do {
            System.out.print("Valor: ");
            entrada = scan.nextLine();

            if (!entrada.isBlank()) {
                int valor = Integer.parseInt(entrada);
                lista.add(valor);
            }
        } while (!entrada.isBlank());

        for (int i = 0; i < lista.size(); i++) {
            int valor = lista.get(i);
            soma += valor;

            if (valor < min) {
                min = valor;
            }
            if (valor > max) {
                max = valor;
            }
        }

       media = soma / lista.size();

        moda = lista.get(0);
        maiorFrequencia = 0;

        for (int x = 0; x < lista.size(); x++) {
            int valor = lista.get(x);
            int frequencia = 0;

            for (int y = 0; y < lista.size(); y++) {
                if (lista.get(y) == valor) {
                    frequencia++;
                }
            }

            if (frequencia > maiorFrequencia) {
                maiorFrequencia = frequencia;
                moda = valor;
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            somaQuadrados += Math.pow(lista.get(i) - media, 2);
        }

        desvioPadrao = Math.sqrt(somaQuadrados / lista.size());

        System.out.printf("Média: "+ media);
        System.out.println("Moda: " + moda);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.printf("Desvio Padrão: "+ desvioPadrao);
    }
}