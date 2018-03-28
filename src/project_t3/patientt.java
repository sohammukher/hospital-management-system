/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_t3;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tushar-PC
 */
public class patientt implements inter_c{
    public static int pat_id=1000;
    private String name,add,e_mail,ph_no;
    Scanner sc=new Scanner(System.in);
    private Component controllingFrame;
    @Override
    public void set_id()
    {
        pat_id++;
    }
    @Override
    public void set_name(String n)
    {
        name=n;
    }
    @Override
    public void set_add(String ad)
    {
        add=ad;
    }
    @Override
    public void set_mail(String em)
    {
        e_mail=em;
    }
    @Override
    public void set_ph_no(String ph)
    {
        ph_no=ph;
    }
    @Override
    public int get_id()
    {
       return pat_id; 
    }
    String get_name()
    {
        return name;
    }
    @Override
    public String get_mail()
    {
        return e_mail;
    }
    @Override
    public String get_ph_no()
    {
        return ph_no;
    }
    
    @Override
    public String get_add() {
        return add;
    }
}
