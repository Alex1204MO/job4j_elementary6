package ru.job4j.condition;

public class AlertDivZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        else if (number < 0) {
            System.out.println("This is negative number");
        }
    }

    public static void main(String[] args) {
        AlertDivZero.possibleDiv(-4);

        AlertDivZero.possibleDiv(0);
    }
}
