public class EquipoEsports {
    private String nombre;
    private String juego;
    private String pais;
    private int rankingMundial;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }

    public String getJuego(){
        return juego;
    }

    public void setJuego(String juegoEntrada){
        juego=juegoEntrada;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String paisEntrada){
        pais=paisEntrada;
    }

    public int getRankingMundial(){
        return rankingMundial;
    }

    public void setRankingMundial(int rankingMundialEntrada){rankingMundial=rankingMundialEntrada;
    }
}
