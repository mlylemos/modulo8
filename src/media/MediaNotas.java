package media; 

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        leitor.close();

    }

}