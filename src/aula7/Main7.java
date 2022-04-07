package aula7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicio = Integer.parseInt(input.next());
        int fim = Integer.parseInt(input.next());
        Boolean ascending = Boolean.parseBoolean(input.next());

        TesteLacos lacoFor = new TesteLacos();
        // lacoFor.testeFor(inicio, fim, ascending);
        // lacoFor.testeWhile(inicio, fim, ascending);
        lacoFor.testeDoWhile(inicio, fim, ascending);
        input.close();
    }
}
