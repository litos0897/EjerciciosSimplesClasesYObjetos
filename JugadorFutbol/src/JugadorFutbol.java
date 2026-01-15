public class JugadorFutbol {

    private String nombre;
    private String equipo;
    private int dorsal;
    private String posicion;

    public String getNombre(){
        return nombre;

    }
    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }

    public String getEquipo(){
        return equipo;
    }

    public void setEquipo(String equipoEntrada){
        equipo=equipoEntrada;
    }

    public int getDorsal(){
        return dorsal;
    }
    public void setDorsal(int dorsalEntrada){
        dorsal=dorsalEntrada;
    }
    public String getPosicion(){
        return posicion;
    }
    public void setPosicion(String posicionEntrada){
        posicion=posicionEntrada;
    }


}
