public class Manga {
    private String titulo;
    private String autor;
    private int numVolumen;
    private boolean leido;

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String tituloEntrada){
        titulo=tituloEntrada;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autorEntrada){
        autor=autorEntrada;
    }

    public int getNumVolumen(){
        return numVolumen;
    }

    public void setNumVolumen(int numVolumenEntrada){
        numVolumen=numVolumenEntrada;
    }

    public boolean getLeido(){
        return leido;
    }

    public void setLeido(boolean leidoEntrada){
        leido=leidoEntrada;
    }
}

