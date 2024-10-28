import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BancoGui extends JFrame {
    
    public BancoGui() {
        // Configuración de la ventana principal
        setTitle("Banco - Menú Principal");
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10)); // Grid para organizar los botones
        
        // Crear botones para cada acción
        JButton btnAgregarCuenta = new JButton("Agregar Cuenta");
        JButton btnBuscarCuenta = new JButton("Buscar Cuenta");
        JButton btnConsignar = new JButton("Consignar");
        JButton btnRetirar = new JButton("Retirar Dinero");
        JButton btnConsultarTotal = new JButton("Consultar Total del Banco");
        JButton btnConsultarClienteMayor = new JButton("Consultar Cliente con Mayor Dinero");

        // Agregar botones a la ventana
        add(btnAgregarCuenta);
        add(btnBuscarCuenta);
        add(btnConsignar);
        add(btnRetirar);
        add(btnConsultarTotal);
        add(btnConsultarClienteMayor);

        // Configuración de fuentes y colores (opcional, para hacerlo "chevere")
        Font font = new Font("Arial", Font.BOLD, 14);
        btnAgregarCuenta.setFont(font);
        btnBuscarCuenta.setFont(font);
        btnConsignar.setFont(font);
        btnRetirar.setFont(font);
        btnConsultarTotal.setFont(font);
        btnConsultarClienteMayor.setFont(font);
        
        // Agregar funcionalidad a los botones usando ActionListener
        btnAgregarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes llamar al método para agregar cuenta
                JOptionPane.showMessageDialog(null, "Agregar Cuenta seleccionado");
            }
        });
        
        btnBuscarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes llamar al método para buscar cuenta
                JOptionPane.showMessageDialog(null, "Buscar Cuenta seleccionado");
            }
        });
        
        btnConsignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes llamar al método para consignar dinero
                JOptionPane.showMessageDialog(null, "Consignar seleccionado");
            }
        });
        
        btnRetirar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes llamar al método para retirar dinero
                JOptionPane.showMessageDialog(null, "Retirar Dinero seleccionado");
            }
        });
        
        btnConsultarTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes llamar al método para consultar total del banco
                JOptionPane.showMessageDialog(null, "Consultar Total del Banco seleccionado");
            }
        });
        
        btnConsultarClienteMayor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes llamar al método para consultar cliente con mayor dinero
                JOptionPane.showMessageDialog(null, "Consultar Cliente con Mayor Dinero seleccionado");
            }
        });
    }
    
    
}
