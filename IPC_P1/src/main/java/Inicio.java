
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
public class Inicio extends JFrame implements ActionListener{
    
    JButton login = new JButton();
    JButton about = new JButton();
    
    Inicio(){
        
        ImageIcon img = new ImageIcon("logo.png");
        JLabel logo = new JLabel();
        logo.setBounds(15, 75, 500, 300);
        logo.setIcon(new ImageIcon(img.getImage().getScaledInstance(500, 300, 50)));
        logo.setVisible(true);
        
        JLabel vision = new JLabel();
        vision.setBounds(530, 150, 50, 25);
        vision.setText("Visión:");
        vision.setVisible(true);
        
        JLabel exp = new JLabel();
        exp.setBounds(530, 180, 300, 75);
        exp.setText("<html>Ser la unidad de información especializada<p>"
                + " y técnica con estándares de Biblioteca <p>"
                + "Universitaria en beneficio del desarrollo <p>"
                + "de la ciencia y la tecnología del país</html>");
        exp.setVisible(true);
        
        
        login.setBounds(650, 50, 125, 30);
        login.addActionListener(this);
        login.setText("Inicio de sesión");
        login.setFocusable(false);
        
        
        about.setBounds(25, 400, 75, 30);
        about.addActionListener(this);
        about.setText("About");
        about.setFocusable(false);
        
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(850, 500);
        setLocationRelativeTo(null);
        this.setTitle("BIBLIOTECA FACULTAD DE INGENIERIA USAC");
        this.setVisible(true);
        this.add(logo);
        this.add(vision);
        this.add(exp);
        this.add(login);
        this.add(about);
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            Login log = new Login();
                this.dispose();
        }
    }
}
