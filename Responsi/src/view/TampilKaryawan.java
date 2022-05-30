/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import karyawan.Karyawan;
import koneksi.Koneksi;

/**
 *
 * @author Ardya
 */

public class TampilKaryawan extends JFrame{

    
    JFrame frame = new JFrame("JDBC");
    public JTable tabel;
     DefaultTableModel model;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID", "Nama", "Usia", "Gaji"};
    
    public JButton bKembali = new JButton("KEMBALI");
    
    
    public TampilKaryawan(){
        model = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Karyawan");
        setSize(750, 300);
        setVisible(true);
        setLayout(null);
        add(scrollPane);
        
        scrollPane.setBounds(15, 15, 700, 100);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(bKembali);
        bKembali.setBounds(20, 200,700, 20);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

    
}
