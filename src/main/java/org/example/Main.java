package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Hello, World";
        checkIfSheSaidHallo(text);
    }

    public static int calcSum(int a, int b) {
        return a+b;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int productTwoNumbers(int a, int b) {
        return a * b;
    }

    public static String convertStringToUpperCase(String text) {
        return text.toUpperCase();
    }

    public static boolean checkIfNumberIsPositive(int a) {
        if (a > 0) {
            return true;
        }

        return false;
    }

    public static boolean checkIfSheSaidHallo(String text) {
        String insensitiveText = text.toLowerCase();
        String ignoreForeignCharacters = insensitiveText.replaceAll("[^a-zA-Z\\d\\s:]", " ");
        System.out.println(ignoreForeignCharacters);
        String[] convertedTextToArray = ignoreForeignCharacters.split(" ");

        String[] possiblePeopleHelloes = {"hello","ciao", "salut", "hallo", "hola", "ahoj", "czesc"};

        for (String arrayText : convertedTextToArray) {
            for (String possibleHello : possiblePeopleHelloes) {
                if (arrayText.equals(possibleHello)) {
                    return true;
                }
            }
        }

        return false;
    }
}