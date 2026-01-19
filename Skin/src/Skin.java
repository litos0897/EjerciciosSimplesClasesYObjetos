public class Skin {
    private String nombre;
    private String videojuego;
    private String rareza;
    private double precio;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }

    public String getVideojuego(){
        return videojuego;
    }

    public void setVideojuego(String videojuegoEntrada){
        videojuego=videojuegoEntrada;
    }

    public String getRareza(){
        return rareza;
    }

    public void setRareza(String rarezaEntrada){
        rareza=rarezaEntrada;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precioEntrada){
        precio=precioEntrada;
    }
}
