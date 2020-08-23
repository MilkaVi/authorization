package com.java.se;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Myform extends JFrame {
    public Myform() {
        super("Авторизация");
        setBounds(100, 50, 400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel firstOperandLabel = new JLabel("логин:");
        firstOperandLabel.setBounds(10, 10, 350, 30);
        add(firstOperandLabel);

        JTextField login = new JTextField();
        login.setBounds(10, 50, 350, 30);
        add(login);

        JLabel secondOperandLabel = new JLabel("пароль:");
        secondOperandLabel.setBounds(10, 90, 350, 30);
        add(secondOperandLabel);

        JTextField password = new JTextField();
        password.setBounds(10, 130, 350, 30);
        add(password);

        JButton calculateButton = new JButton("регистрация");
        calculateButton.setBounds(210, 250, 150, 30);
        calculateButton.addActionListener(
                new RegistrationButton(
                        login,
                        password
                )
        );
        add(calculateButton);
        validate();
        setVisible(true);

        JButton calculateButton2 = new JButton("войти");
        calculateButton2.setBounds(10, 250, 150, 30);
        calculateButton2.addActionListener(
                new InputButton(
                        login,
                        password
                )
        );
        add(calculateButton2);
        validate();
        setVisible(true);
    }
}