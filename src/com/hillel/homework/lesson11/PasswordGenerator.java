package com.hillel.homework.lesson11;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Generated Password: " + password);
    }
    public static String generatePassword() {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String specialChars = "_";

        String allCharacters = lowercaseLetters + uppercaseLetters + digits + specialChars;
        int passwordLength = 8;

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        // Ensure at least one character from each category
        password.append(randomChar(lowercaseLetters));
        password.append(randomChar(uppercaseLetters));
        password.append(randomChar(digits));
        password.append(randomChar(specialChars));
        // Fill the remaining characters randomly
        for (int i = 4; i < passwordLength; i++) {
            password.append(randomChar(allCharacters));
        }
        // Shuffle the password characters
        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = passwordArray[index];
            passwordArray[index] = passwordArray[i];
            passwordArray[i] = temp;
        }
        return new String(passwordArray);
    }
    public static char randomChar(String characterSet) {
        Random random = new Random();
        int index = random.nextInt(characterSet.length());
        return characterSet.charAt(index);
    }
}

