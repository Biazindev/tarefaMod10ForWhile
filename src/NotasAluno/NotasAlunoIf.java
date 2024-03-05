package NotasAluno;

import java.util.Scanner;

public class NotasAlunoIf {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resposta;
        
        String[] materias = {"Portugues", "Matematica", "Ingles", "Ciencia"};

        do {
            int totalNotas = 0;

            for (String materia : materias) {
                System.out.println("Digite a nota de " + materia + ":");
                int nota = s.nextInt();
                totalNotas += nota;
            }

            double media = (double) totalNotas / materias.length;

            if (media >= 7) {
                System.out.println("Você está aprovado!");
            } else if (media >= 5) {
                System.out.println("Você ficou de recuperação!");
            } else {
                System.out.println("Você está reprovado!");
            } 

            System.out.println("Deseja reescrever as notas? (Sim/Não)");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Obrigado");
    }
}