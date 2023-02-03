package com.example.calculatorapp;

import java.util.ArrayList;
import java.util.List;
public class CalculatorBrain {
    private List<String> nums = new ArrayList<>();

    void push(String value) {
        nums.add(value);
    }
    boolean isOperator(String value) {
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
    }
    
    int calculate() {
        int FN = 0;
        int i = 0;

        while (i < nums.size() && !isOperator(nums.get(i))) {
            FN = FN * 10 + Integer.parseInt(nums.get(i));
            i++;
        }
        int result = FN;
        while (i < nums.size()) {
            String opt = nums.get(i);
            i++;

            int SN = 0;
            while (i < nums.size() && !isOperator(nums.get(i))) {
                SN = SN * 10 + Integer.parseInt(nums.get(i));
                i++;
            }

            if (opt.equals("+")) {
                result += SN;
            } else if (opt.equals("-")) {
                result -= SN;
            }
            else if (opt.equals("/")) {
                result /= SN;
            }
            else if (opt.equals("*")) {
                result *= SN;
            }

        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String value : nums) {
            sb.append(value);
        }
        return sb.toString();
    }

    boolean validate() {
        if (nums.get(nums.size() - 1).equals("+") || nums.get(nums.size() - 1).equals("-") || nums.get(nums.size() - 1).equals("*") || nums.get(nums.size() - 1).equals("/")) {
            return false;
        }
        if (nums.get(0).equals("+") || nums.get(0).equals("-") || nums.get(0).equals("*") || nums.get(0).equals("/")) {
            return false;
        }
        int c = 0;
        for (int i = 0; i < nums.size(); i++) {
            String v = nums.get(i);
            if (v.equals("+") || v.equals("-") || v.equals("*") || v.equals("/")) {
                c++;
            }
        }
        if (c > 1) {
            return false;
        }
        return true;
    }
    
    public String totalnum() {
        return String.valueOf(calculate());
    }
    
    void reset() {
        nums.clear();
    }
    
}
