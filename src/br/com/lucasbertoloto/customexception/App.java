package br.com.lucasbertoloto.customexception;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Insert a positive number: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            double d = scanner.nextDouble();
                try {
                    if(d < 0)
                        throw new NegativeNumberException();
                    else
                        System.out.println("Thanks!");
                } catch (NegativeNumberException e) {
                    e.printStackTrace();
                }
        }
    }

    public static class NegativeNumberException extends Exception {
        private final String message;

        public NegativeNumberException() {
            this.message = "Negative number";
        }

        @Override
        public String getMessage() {
            return message;
        }
    }
}
