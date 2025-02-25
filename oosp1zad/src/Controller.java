package com.example.mathsystem;

public class MathController {
    private MathModel model;
    private MathView view;

    public MathController(MathModel model, MathView view) {
        this.model = model;
        this.view = view;
    }

    public void processExpression() {
        String expression = view.getExpression();
        try {
            double result = model.evaluateExpression(expression);
            view.displayResult(result);
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }
}