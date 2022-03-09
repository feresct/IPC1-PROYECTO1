
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ferrn
 */
public class Login extends JFrame implements ActionListener{
    
    JButton init = new JButton();
    JButton cancel = new JButton();
    
    JTextField contra = new JTextField();
    JTextField usuario = new JTextField();
    
    Login(){
        
        ImageIcon img = new ImageIcon("account.png");
        JLabel logo = new JLabel();
        logo.setBounds(75, 35, 250, 250);
        logo.setIcon(new ImageIcon(img.getImage().getScaledInstance(250, 250, 20)));
        logo.setVisible(true);
        
        JLabel user = new JLabel();
        user.setBounds(50, 300, 100, 25);
        user.setText("Usuario:");
        user.setVisible(true);

        
        usuario.setBounds(160, 300, 175, 25);
        usuario.setVisible(true);

        JLabel pass = new JLabel();
        pass.setBounds(50, 350, 100, 25);
        pass.setText("Contraseña:");
        pass.setVisible(true);

        
        contra.setBounds(160, 350, 175, 25);
        contra.setVisible(true);
        
        init.setBounds(50, 400, 100, 30);
        init.addActionListener(this);
        init.setText("Ingresar");
        init.setFocusable(false);
        
        cancel.setBounds(235, 400, 100, 30);
        cancel.addActionListener(this);
        cancel.setText("Cancelar");
        cancel.setFocusable(false);

        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400, 500);
        setLocationRelativeTo(null);
        this.setTitle("LOGIN");
        this.setVisible(true);
        this.add(user);
        this.add(pass);
        this.add(logo);
        this.add(contra);
        this.add(usuario);
        this.add(init);
        this.add(cancel);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == init) {
        try
            {
                String us = usuario.getText();
                String pss = contra.getText();
                        
                if (us != "")
                {
                    if (pss != "")
                    {
                        if ( (us.equals("admin")) && (pss.equals("admin")))
                        {
                            Registro reg = new Registro();
                            this.dispose();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña invalido(s)", 
                    "Ingeniería USAC", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Ingrese una contraseña", 
                    "Ingeniería USAC", JOptionPane.PLAIN_MESSAGE);
                    }
                }
                else {
                        JOptionPane.showMessageDialog(null, "Ingrese un nombre de usuario", 
                    "Ingeniería USAC", JOptionPane.WARNING_MESSAGE);
                    }
            }
            catch (Exception ex)
            {
                        JOptionPane.showConfirmDialog(null, "Error: " + ex, 
                    "Ingeniería USAC", JOptionPane.WARNING_MESSAGE);
            }
        
    }
        
        if (e.getSource() == cancel) {
            Inicio in = new Inicio();
            this.dispose();
        }
    }
    
}
