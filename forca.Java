package com.mycompany.primeiro_project;

import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        int i = 0, chances = 0;
        String[][] forca;
        char[] palavra2;
        char palavra4;
        String[] confer;
        boolean checar = false;

        // definir a palavra
        System.out.print("Jogador1, defina a palavra: ");
        palavra = scanner.next();
        i = 5 + palavra.length();
        // colocando o número de colunas da matriz
        forca = new String[4][i];
        // definir o tamanho dos vetores
        palavra2 = new char[i - 5];
        confer = new String[i - 5];
        // transformando a String em char e guardando a palavra no vetor
        palavra2 = palavra.toCharArray();
        // colocando a palavra do vetor char e um String
        for (int j = 0; j < confer.length; j++) {
            for (int k = 0; k < palavra2.length; k++) {
                confer[j] = String.valueOf(palavra2[k]);
            }
        }
        // limpando a forca('null')
        for (int j = 0; j < forca.length; j++) {
            for (int k = 0; k < i; k++) {
                forca[j][k] = " ";
            }
        }
        // definimos o desenho da forca
        forca[1][3] = "-|";
        forca[1][2] = "|-";
        forca[2][2] = "|";
        forca[3][2] = "|  ";
        forca[3][i - 1] = "";
        forca[3][i - 2] = "";
        //colocar "_", para o tanto de letras que a palavra tem 
        for (int j = 3; j < forca.length; j++) {
            for (int k = 3; k < i - 2; k++) {
                forca[j][k] = "_ ";
            }
        }
        // imprimindo a matriz inicial 
        for (int k = 0; k < forca.length; k++) {
            System.out.println("");
            for (int l = 0; l < i; l++) {
                System.out.print(forca[k][l]);
            }
        }
        System.out.println("");
        // laço principal
        String palavra3, p;
        for (int j = 0; j < 10; j++) {
            chances++;
            System.out.println();
            System.out.print("Jogador2, digite uma letra: ");
            palavra3 = scanner.next();
            // letra(string) em char
            palavra4 = palavra3.charAt(0);
            //  vefificar a letra digitada
            for (int m = 0; m < palavra2.length; m++) {
                if (palavra2[m] == palavra4) {
                    //tranformar a letra em String
                    p = palavra3;
                    // colocando a letra na forca
                    forca[3][m + 3] = p;
                }
            }
            // imprimindo a matriz atualizada com as letras
            for (int n = 0; n < forca.length; n++) {
                System.out.println();
                for (int o = 0; o < i; o++) {
                    System.out.print(forca[n][o]);
                }
            }
            System.out.println();
            System.out.println("Chances" + chances + "/10");
            //conferindo se o jogador acertou a palavra
            for (int k = 3; k < forca.length; k++) {
                for (int l = 3; l < i - 2; l++) {
                    for (int m = 0; m < confer.length; m++) {
                        if (confer[m].equals(forca[k][l])) {
                            checar = true;
                            if (checar) {
                                break;
                            }
                        }
                        if (checar == true) {
                            break;
                        }
                    }
                    if (checar == true) {
                        break;
                    }
                }
                if (checar == true) {
                    break;
                }
            }
            if (checar == true) {
                break;
            }
        }
        if (checar == true) {
            System.out.println("Parabéns! Acertou a palavra com " + chances + " chances");
        } else {
            System.out.println("Não acertou a palavra. Mais sorte na próxima.");
        }
    }
}
