package ejecutable;

import controlador.controlador;
import modelo.Segurrutas;
import vista.VentanaPrincipal;

public class test
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Segurrutas miEmpleados = null;
        controlador miControlador = new controlador(miVentana, miEmpleados);
    }
    
}