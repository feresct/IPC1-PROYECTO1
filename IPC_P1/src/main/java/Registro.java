
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferrn
 */
public class Registro extends JFrame implements ActionListener{
    
    JTextField id = new JTextField();
    JTextField nombre = new JTextField();
    JTextField apellido = new JTextField();
    JTextField usuario = new JTextField();
    JRadioButton admin = new JRadioButton();
    JRadioButton preadmin = new JRadioButton();
    JTextField contra = new JTextField();
   
    JLabel tittle = new JLabel();
    JLabel idL = new JLabel();
    JLabel nombreL = new JLabel();
    JLabel apellidoL = new JLabel();
    JLabel userL = new JLabel();
    JLabel rolL = new JLabel();
    JLabel contraL = new JLabel();
    
    JButton registrar = new JButton();
    JButton control = new JButton();
    JButton cancel = new JButton();
    
    Registro(){
        
//------Labels---------------------------------------------------------------------------------------------------------------------------

        tittle.setBounds(180, 5, 175, 25);
        tittle.setText("REGISTRO DE USUARIOS");
        tittle.setVisible(true);

        idL.setBounds(115, 40, 75, 25);
        idL.setText("Carnet: ");
        idL.setVisible(true);
        
        nombreL.setBounds(115, 80, 75, 25);
        nombreL.setText("Nombres: ");
        nombreL.setVisible(true);
        
        apellidoL.setBounds(115, 120, 75, 25);
        apellidoL.setText("Apellidos: ");
        apellidoL.setVisible(true);
        
        userL.setBounds(115, 160, 75, 25);
        userL.setText("Usuario: ");
        userL.setVisible(true);
        
        rolL.setBounds(115, 200, 75, 25);
        rolL.setText("Cargo: ");
        rolL.setVisible(true);
        
        contraL.setBounds(115, 240, 75, 25);
        contraL.setText("Contraseña: ");
        contraL.setVisible(true);
        
//------Cajas de Texto---------------------------------------------------------------------------------------------------------------------------

        id.setBounds(175, 40, 200, 25);
        id.setVisible(true);
        
        nombre.setBounds(175, 80, 200, 25);
        nombre.setVisible(true);
        
        apellido.setBounds(175, 120, 200, 25);
        apellido.setVisible(true);
        
        usuario.setBounds(175, 160, 200, 25);
        usuario.setVisible(true);
        
        preadmin.setBounds(187, 200, 100, 25);
        preadmin.addActionListener(this);
        preadmin.setText("Estudiante");
        preadmin.setVisible(true);
        preadmin.setFocusable(false);
        
        admin.setBounds(285, 200, 100, 25);
        admin.addActionListener(this);
        admin.setText("Catedrático");
        admin.setVisible(true);
        admin.setFocusable(false);
        
        contra.setBounds(200, 240, 175, 25);
        contra.setVisible(true);
        
//------Buttons---------------------------------------------------------------------------------------------------------------------------        
        
        registrar.setBounds(100, 285, 285, 25);
        registrar.addActionListener(this);
        registrar.setText("REGISTRAR");
        registrar.setFocusable(false);
        
        control.setBounds(100, 325, 175, 25);
        control.addActionListener(this);
        control.setText("CONTROL DE DATOS");
        control.setFocusable(false);
        
        cancel.setBounds(300, 325, 85, 25);
        cancel.addActionListener(this);
        cancel.setText("SALIR");
        cancel.setFocusable(false);
        
//------Frame---------------------------------------------------------------------------------------------------------------------------
        
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 420);
        setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.add(tittle);
        this.add(idL);
        this.add(nombreL);
        this.add(apellidoL);
        this.add(userL);
        this.add(rolL);
        this.add(contraL);
        
        this.add(id);
        this.add(nombre);
        this.add(apellido);
        this.add(usuario);
        this.add(preadmin);
        this.add(admin);
        this.add(contra);
        
        this.add(registrar);
        this.add(control);
        this.add(cancel);
        
        }
    
//------Eventos---------------------------------------------------------------------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //Radios
        
        if (preadmin.isSelected()) {
            
            admin.setEnabled(false);    
        }
        else{
            
            admin.setEnabled(true);
        }
        
        
        
        if (admin.isSelected()) {
            
            preadmin.setEnabled(false);    
        }
        else{
            
            preadmin.setEnabled(true);
        }
        
        //Botones
        if (e.getSource() == registrar) {
            
            String[] reg = new String[5];
            
            reg[0] = "Admin";
            
            for(String i : reg){
                if (i == null){
                    i = nombre.getText();
                }
                System.out.println(i);
            }
            
        }
        if (e.getSource() == control){
            
            Control control = new Control();
            
        }
        if (e.getSource() == cancel){
            
            int out = JOptionPane.showConfirmDialog(null, "¿Desea perder la información registrada?", 
                    "Ingeniería USAC", JOptionPane.YES_NO_OPTION);
            if (out == 0) {
                Inicio in = new Inicio();
                 this.dispose();
            }
        }
    }
}
