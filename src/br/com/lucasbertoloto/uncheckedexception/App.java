package br.com.lucasbertoloto.uncheckedexception;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        //A simple operation to divide a number by another could cause Unchecked Exceptions
        //We'll do an example to visualize and handle these Exceptions
        double a;
        double b;
        double result;
        int i = 0;

        while (i == 0) {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog("Insert a number"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Insert a number to divide the last number"));
                if (b == 0)
                    throw new ArithmeticException();
                result = divide(a,b);
                JOptionPane.showMessageDialog(null,"The result is: " + result);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Please just insert numbers.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,"It's impossible to divide by 0.");
            } finally {
                //this is a block that will run even if an exception is thrown
                i = JOptionPane.showInternalConfirmDialog(null, "Wanna try again?");
            }
        }
        System.exit(0);
    }

    private static double divide(double a, double b) {
        return a/b;
    }
}
