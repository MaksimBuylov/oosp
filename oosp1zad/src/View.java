package com.example.mathsystem;

import java.util.Scanner;

public class MathView {
    private Scanner scanner;

    public MathView() {
        scanner = new Scanner(System.in);
    }

    public String getExpression() {
        System.out.print("Введите математическое выражение: ");
        return scanner.nextLine();
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public void displayError(String message) {
        System.out.println("Ошибка: " + message);
    }
}