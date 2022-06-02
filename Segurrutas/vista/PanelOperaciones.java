package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton btMostrarRuta;
    public JButton btBorrar;
    public JButton btSalir;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        btMostrarRuta = new JButton("Mostrar Ruta");
        btMostrarRuta.setFont(new Font("Arial", BOLD, 12));
        btMostrarRuta.setBounds(50,20,200,30);
        btMostrarRuta.setBackground(Color.MAGENTA);
        add(btMostrarRuta);
        btMostrarRuta.setActionCommand("Mostrar Ruta");

        //Crear y agrear boton Borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setFont(new Font("Arial", BOLD, 12));
        btBorrar.setBounds(300, 20, 80, 30);
        btBorrar.setBackground(Color.CYAN);
        this.add(btBorrar);
        btBorrar.setActionCommand("borrar");

        //Crear y agrear boton Salir
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Arial", BOLD, 12));
        btSalir.setBounds(430, 20, 80, 30);
        btSalir.setBackground(Color.RED);
        this.add(btSalir);
        btSalir.setActionCommand("salir");
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btMostrarRuta.addActionListener(pAL);
        btBorrar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }
    
    public void activarBotones()
    {
        btMostrarRuta.setEnabled(true);;
        btBorrar.setEnabled(true);
        btSalir.setEnabled(true);
    }
}