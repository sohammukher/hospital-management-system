/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_t3;

import java.util.Scanner;

/**
 *
 * @author Tushar-PC
 */
public class doctorr implements inter_c{
    private static int doc_id=1000;
    private String name,add,e_mail,ph_no,timings;
    Scanner sc=new Scanner(System.in);
    @Override
    public void set_id()
    {
        doc_id++;
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
    void set_timings()
    {
        timings=sc.next();
    }
    @Override
    public int get_id()
    {
       return doc_id; 
    }
    public String get_name()
    {
        return name;
    }
    @Override
    public String get_add()
    {
        return add;
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
    String get_timings()
    {
        return timings;
    }
}
