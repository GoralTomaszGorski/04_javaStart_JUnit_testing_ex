package goral;

import java.util.Scanner;

public class NumberCompare {
    int a;
    int b;

    Scanner scanner = new Scanner(System.in);

    public void compareWriter(){
        System.out.println("Podaj 1 liczbę: ");
        a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        b = scanner.nextInt();

        if (a>b){
            System.out.println("1 liczba jest wieksza od 2");
        } else if (a<b){
            System.out.println("1 liczba jest mniejsza niż 2");
        } else {
            System.out.println("1 liczba jest równa 2");
        }
    }
}
