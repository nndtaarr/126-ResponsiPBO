/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ardya
 */

public class EditKaryawan extends JFrame{
    JLabel ljudul = new JLabel("UPDATE KARYAWAN");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fcek = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
    JLabel llembur = new JLabel("Lembur");
    public final JTextField flembur = new JTextField(10);
    
    public JButton bupdate = new JButton("UPDATE");
    public JButton bhapus = new JButton("HAPUS");
    public JButton btotal = new JButton("TOTAL GAJI");
    public JButton bkembali = new JButton("KEMBALI");
    
     public EditKaryawan(){
        setTitle("Update Karyawan");
        setSize(300,280);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji); 
        add(llembur);
        add(flembur);
        add(btotal);
        add(bupdate);
        add(bhapus); 
        add(bkembali);
        
        ljudul.setBounds(92,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(60,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(60,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(60,90,200,20);
        
        llembur.setBounds(15,120,120,20);
        flembur.setBounds(60,120,200,20);
        
        btotal.setBounds(15,160,250,20);
        btotal.setBackground(Color.yellow);
        btotal.setForeground(Color.white);
        
        bupdate.setBounds(55,185,90,20);
        bupdate.setBackground(Color.green);
        bupdate.setForeground(Color.white);
        
        bhapus.setBounds(155,185,90,20);
        bhapus.setBackground(Color.red);
        bhapus.setForeground(Color.white);
        
        bkembali.setBounds(15,210,250,20);
        bkembali.setBackground(Color.blue);
        bkembali.setForeground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return fnama.getText();
    }
    public String getCek(){
        return fcek.getText();
    }
    
    public String getUsia(){
        return fusia.getText();
    }
    
    public String getGaji(){
        return fgaji.getText();
    }
}
