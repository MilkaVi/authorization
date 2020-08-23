package com.java.se;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegistrationButton implements ActionListener {
    Dbase dbase = new Dbase();
    private JTextField f1, f2;
    public RegistrationButton(JTextField f1, JTextField f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            if(f2.getText().equals("") || f1.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "неверный ввод");
                return;
            }
            if(dbase.TestIncludeUser(f1,f2)){
                JOptionPane.showMessageDialog(null, "вы уже зарегистрированы");
            }
            else{
                dbase.users.add(f1.getText());
                dbase.users.add(f2.getText());
                JOptionPane.showMessageDialog(null, "регистрация выполнена");
            }
        } catch(NumberFormatException exception) {

            JOptionPane.showMessageDialog(null, "неверный ввод");
        }
    }
}