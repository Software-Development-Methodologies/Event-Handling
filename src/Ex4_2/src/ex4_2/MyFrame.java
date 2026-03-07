/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tiger
 */
public class MyFrame extends JFrame {
    
    private JButton button;
    private JTextField inputF;
    private String currentInput;
    private double result;
    private char operator;
    
    public MyFrame(){
        this.setSize(400, 400);
        this.setTitle("Testing Form[Calculator]");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        inputF = new JTextField();
        inputF.setHorizontalAlignment(JTextField.RIGHT);
        inputF.setEditable(false);
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        
        String[] operations = {"7", "8", "9", "+", 
                               "4", "5", "6", "-",
                               "1", "2", "3", "*",
                               "0", ".", "=", "/"};
        
        for (String btnLabel : operations) {
            button = new JButton(btnLabel);
            buttonPanel.add(button);
        }
        this.add(inputF, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);
        
        currentInput = "";
        result = 0.0;
        operator = ' ';
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonLabel = ((JButton) e.getSource()).getText();
                if (buttonLabel.equals("=")) {
                    if (!currentInput.isEmpty()) {
                        double num = Double.parseDouble(currentInput);
                        calculateResult(num);
                    }
                } else {
                    if (buttonLabel.equals("-")) {
                        if (currentInput.isEmpty()) {
                            currentInput += "-";
                            inputF.setText(currentInput);
                        } else {
                            double num = Double.parseDouble(currentInput);
                            calculateResult(num);
                            operator = '-';
                        }
                    } else {
                        currentInput += buttonLabel;
                        inputF.setText(currentInput);
                    }
                }
               
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
             public void windowClosing(WindowEvent e) {
                int i = JOptionPane.showConfirmDialog(null, "Do you want to exit the app?");
                if (i == JOptionPane.YES_OPTION) 
                    System.exit(0);
                              
            }
        });
        
        this.setVisible(true);
        
    }
    
    private void calculateResult(double number) {
        if (!currentInput.isEmpty()) {
            String exp = result + " " + operator + " " + currentInput;
            try {
                result = evaluateExpression(exp);
                inputF.setText(Double.toString(result));
            } catch (Exception e) {
                inputF.setText("Error: " + e.getMessage());
            }
        } else {
            result = number;
            inputF.setText(Double.toString(result));
        }
        
        currentInput = "";
    }
    
    private void clearCalculator() {
        currentInput = "";
        result = 0.0;
        operator = ' ';
        inputF.setText("");
    }
    
    private double evaluateExpression(String expression) {
        String[] tokens = expression.split("\\s+");
        double num1 = Double.parseDouble(tokens[0]);
        char operator = tokens[1].charAt(0);
        double num2 = Double.parseDouble(tokens[2]);
        
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Divsion by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}