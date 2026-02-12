package com.example.math;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MathController {

    @GetMapping("/calculate")
    public CalculationResult calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operator) {
        
        double result = 0;
        switch (operator) {
            case "add": result = num1 + num2; break;
            case "sub": result = num1 - num2; break;
            case "mul": result = num1 * num2; break;
            case "div": result = num1 / num2; break;
        }
        return new CalculationResult(result);
    }

    // Simple DTO class for JSON response
    static class CalculationResult {
        public double value;
        public CalculationResult(double value) { this.value = value; }
    }
}