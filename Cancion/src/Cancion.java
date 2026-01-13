public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String tituloEntrada){
        titulo=tituloEntrada;
    }

    public String getArtista(){
        return artista;
    }

    public void setArtista(String artistaEntrada){
        artista = artistaEntrada;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int duracionEntrada){
        duracion=duracionEntrada;
    }

}
