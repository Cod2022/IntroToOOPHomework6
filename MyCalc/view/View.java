package MyCalc.view;

import java.util.Scanner;

public class View {

    public static String userInput() {
        String input;
        System.out.println("Введите выражение для калькуляции: ");
        Scanner sc = new Scanner(System.in, "ibm866");
        input = sc.nextLine();
        return input;
    }

    public void printResult(String result) {
        System.out.println("Результат: " + result);
    }
    
}
