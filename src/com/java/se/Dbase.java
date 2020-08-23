package com.java.se;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Dbase {
    public static List users = new ArrayList();

    public boolean TestIncludeUser(JTextField f1, JTextField f2){
        if(users.contains(f1.getText())){
            if(users.get(users.indexOf(f1.getText())+1).equals(f2.getText()))
                return true;
        }
        return false;
    }
}