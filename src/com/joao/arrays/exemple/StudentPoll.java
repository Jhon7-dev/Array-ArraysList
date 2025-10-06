package com.joao.arrays.exemple;

public class StudentPoll {

    public static void main(String[] args) {

        // Vetor com as respostas dos alunos (notas de 1 a 10)
        int responses[] = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};
        
        // Vetor de frequência (índice representa a nota)
        int frequency[] = new int[11];
        
        // Conta quantas vezes cada nota apareceu
        for (int resposta = 0; resposta < responses.length; resposta++) {
            ++frequency[responses[resposta]];
        }

        // Exibe o resultado da contagem
        System.out.printf("%s%10s\n", "Rating", "Frequency");

        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d\n", rating, frequency[rating]);
        }
    }
}
