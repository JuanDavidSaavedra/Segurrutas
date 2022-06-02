package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Segurrutas;
import vista.VentanaPrincipal;

public class controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Segurrutas model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public controlador(VentanaPrincipal pVenPrin, Segurrutas pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        
        /*if(comando.equals("Mostrar Ruta"))
        {

        }
        */

        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        if(comando.equals("borrar"))
        {
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }
    }
}   