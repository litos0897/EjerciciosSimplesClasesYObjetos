public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private int vida;


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipoEntrada){
        tipo=tipoEntrada;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivelEntrada){
        nivel=nivelEntrada;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vidaEntrada){
        vida=vidaEntrada;
    }
}
