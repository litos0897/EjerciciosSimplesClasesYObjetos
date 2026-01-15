public class Pelicula {
    private String titulo;
    private String director;
    private int anhoEstreno;
    private int duracion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo (String tituloEntrada){
        titulo=tituloEntrada;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String directorEntrada){
        director=directorEntrada;
    }

    public int getAnhoEstreno() {
        return anhoEstreno;
    }

    public void setAnhoEstreno(int anhoEstrenoEntrada){
        anhoEstreno=anhoEstrenoEntrada;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int duracionEntrada){
        duracion=duracionEntrada;
    }

}
