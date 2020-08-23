package com.java.se;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InputButton implements ActionListener {
    Dbase dbase = new Dbase();
    private JTextField f1, f2;
    public InputButton(JTextField f1, JTextField f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            if(dbase.TestIncludeUser(f1,f2)){
                JOptionPane.showMessageDialog(null, "вы вошли");
            }
            else{
                JOptionPane.showMessageDialog(null, "неверный логин или пароль");
            }
        } catch(NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "неверный ввод");
        }
    }
}