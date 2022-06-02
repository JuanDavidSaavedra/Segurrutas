package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    
    //Identificacion, Nombre, Horastrabajadas.
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbUbicacion;
    private JLabel lbDestino;
    private JTextField tfUbicacion;
    private JTextField tfDestino;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Segurrutas.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas nombre, horas trabajadas, fecha de nacimiento y fecha de ingreso
        lbUbicacion = new JLabel("Ubicación (coordenadas) = ");
        lbUbicacion.setBounds(230,50,200,30);
        add(lbUbicacion);
        
        lbDestino = new JLabel("Destino (coordenadas) =");
        lbDestino.setBounds(230,100,200,30);
        add(lbDestino);
        
        
        //Creación y adición de campos de texto
        tfUbicacion = new JTextField();
        tfUbicacion.setBounds(400, 50, 120, 30);
        tfUbicacion.setBackground(Color.YELLOW);
        add(tfUbicacion);
        
        tfDestino = new JTextField();
        tfDestino.setBounds(400, 100, 120, 30);
        tfDestino.setBackground(Color.YELLOW);
        add(tfDestino);
        
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombre()
    {
        return tfUbicacion.getText();
    }
    
    public String getHorasTrabajadas()
    {
        return tfDestino.getText();
    }
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfUbicacion.setText("");
        tfDestino.setText("");
    }

}