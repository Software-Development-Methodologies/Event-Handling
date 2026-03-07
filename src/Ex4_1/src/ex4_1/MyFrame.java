/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Tiger
 */
public class MyFrame extends JFrame {
    
    private JTextField input1Tf, input2Tf;
    private JButton addBtn, subBtn, clearBtn;
    private JLabel answerLbl;
    
    public MyFrame() {
        this.setSize(400, 400);
        this.setTitle("Swing Add App");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLayout(null);
        
        input1Tf = new JTextField();
        input2Tf = new JTextField();
        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        clearBtn = new JButton("Clear");
        answerLbl = new JLabel("Answer goes here.");
        
        input1Tf.setBounds(20, 20, 150, 30);
        input2Tf.setBounds(180, 20, 150, 30);
        addBtn.setBounds(30, 60, 80, 30);
        subBtn.setBounds(120, 60, 100, 30);
        clearBtn.setBounds(230, 60, 80, 30);
        answerLbl.setBounds(110, 90, 130, 30);
        
        this.add(input1Tf);
        this.add(input2Tf);
        this.add(addBtn);
        this.add(subBtn);
        this.add(clearBtn);
        this.add(answerLbl);
        
        addBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(input1Tf.getText());
                    double num2 = Double.parseDouble(input2Tf.getText());
                    double result;
                    String resultLbl;
                    result = num1 + num2;
                    resultLbl = String.valueOf(result);
                    answerLbl.setText(num1 + "+" + num2 + "=" + resultLbl);
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Wrong number format");
                    answerLbl.setText("ERR");
                }  
            }
        });
        
        subBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(input1Tf.getText());
                    double num2 = Double.parseDouble(input2Tf.getText());
                    double result;
                    String resultLbl;
                    result = num2 - num1;
                    resultLbl = String.valueOf(result);
                    answerLbl.setText(num2 + "-" + num1 + "=" + resultLbl);
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Wrong number format");
                    answerLbl.setText("ERR");
                }  
            }
        });
        
        clearBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input1Tf.setText("");
                input2Tf.setText("");
                answerLbl.setText("Answer goes here.");
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
             public void windowClosing(WindowEvent e) {
                int i = JOptionPane.showConfirmDialog(null, "Do you want to exit the app?");
                if (i == JOptionPane.YES_OPTION) 
                    System.exit(0);
                else if (i == JOptionPane.CANCEL_OPTION)
                    answerLbl.setText("CANCEL");
                else if (i == JOptionPane.NO_OPTION)
                   answerLbl.setText("NO");               
            }
        });
        
        this.setVisible(true);
    }
}
