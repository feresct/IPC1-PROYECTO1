
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
public class Control extends JFrame implements ActionListener{
    
    JTextField id = new JTextField();
    JTextField nombre = new JTextField();
    JTextField apellido = new JTextField();
    JTextField usuario = new JTextField();
    JTextField rol = new JTextField();
    JTextField contra = new JTextField();
   
    JLabel tittle = new JLabel();
    JLabel idL = new JLabel();
    JLabel nombreL = new JLabel();
    JLabel apellidoL = new JLabel();
    JLabel userL = new JLabel();
    JLabel rolL = new JLabel();
    JLabel contraL = new JLabel();
    
    JButton buscar = new JButton();
    JButton update = new JButton();
    JButton del = new JButton();
    JButton back = new JButton();
    
    Control(){
        
//------Labels---------------------------------------------------------------------------------------------------------------------------

        tittle.setBounds(170, 5, 175, 25);
        tittle.setText("CONTROL DE USUARIOS");
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

        id.setBounds(165, 40, 115, 25);
        id.setVisible(true);
        
        nombre.setBounds(175, 80, 200, 25);
        nombre.setVisible(true);
        
        apellido.setBounds(175, 120, 200, 25);
        apellido.setVisible(true);
        
        usuario.setBounds(175, 160, 200, 25);
        usuario.setVisible(true);
        
        rol.setBounds(175, 200, 200, 25);
        rol.setVisible(true);
        
        contra.setBounds(200, 240, 175, 25);
        contra.setVisible(true);

//------Buttons---------------------------------------------------------------------------------------------------------------------------        
        
        buscar.setBounds(290, 41, 90, 22);
        buscar.addActionListener(this);
        buscar.setText("BUSCAR");
        buscar.setFocusable(false);
        
        update.setBounds(100, 285, 125, 25);
        update.addActionListener(this);
        update.setText("ACTUALIZAR");
        update.setFocusable(false);
        
        del.setBounds(250, 285, 135, 25);
        del.addActionListener(this);
        del.setText("ELIMINAR");
        del.setFocusable(false);
        
        back.setBounds(100, 325, 285, 25);
        back.addActionListener(this);
        back.setText("REGRESAR");
        back.setFocusable(false);
        
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
        this.add(rol);
        this.add(contra);
        
        this.add(buscar);
        this.add(update);
        this.add(del);
        this.add(back);
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Borrar registro
        if (e.getSource() == del){
            JOptionPane.showConfirmDialog(null, "Usuario removido exitosamente", 
                    "Ingeniería USAC", JOptionPane.PLAIN_MESSAGE);
            
            }

        //Boton buscar    
        if (e.getSource() == buscar){
            
            }
        
        //Boton actualizar
        if (e.getSource() == update){
            
        }
        //Boton regresar
        if (e.getSource() == back) {
            
            int out = JOptionPane.showConfirmDialog(null, "¿Desea perder la información registrada?", 
                    "Ingeniería USAC", JOptionPane.YES_NO_OPTION);
            if (out == 0) {
                Registro reg = new Registro();
                this.dispose();
        }
        }
    }
}
