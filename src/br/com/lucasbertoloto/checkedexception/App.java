package br.com.lucasbertoloto.checkedexception;

public class App {
    public static void main(String[] args) {
        try {
            Class<?> temp = Class.forName("DoNotExists");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exceptions always need to be handled!");
        }
    }
}
