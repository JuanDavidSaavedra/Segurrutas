package modelo;
public class Segurrutas 
{
    //----------
    // Atributos
    //-----------
    
    private int ubicacion;
    private int destino;
    
    //---------
    // Metodos
    //---------

    //Constructor
    public Segurrutas(int nUbicacion, int pDestino)
    {
        this.ubicacion = nUbicacion;
        this.destino = pDestino;
    }


    public int getUbicacion()
    {
        return this.ubicacion;
    }

    public void setUbicacion(int nUbicacion)
    {
        this.ubicacion = nUbicacion;
    }

    public int getDestino()
    {
        return this.destino;
    }

    public void setDestino(int pDestino)
    {
        this.destino = pDestino;
    }

    /*public int getRuta()
    {

    }

    public void setRuta(int pRuta)
    {
        this.destino = pRuta;
    }
    */

    public String toString()
    {
        return "";
    }

}