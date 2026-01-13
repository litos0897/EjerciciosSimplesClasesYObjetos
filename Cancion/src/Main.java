public class Main {
    public static void main(String[] args) {

        Cancion cancion1 = new Cancion();
        Cancion cancion2=new Cancion();

        cancion1.setTitulo("Claro de luna");
        cancion1.setArtista("Beethoven");
        cancion1.setDuracion(900);

        cancion2.setTitulo("La Macarena");
        cancion2.setArtista("Los del Río");
        cancion2.setDuracion(248);

        System.out.println("La primera canción es "+cancion1.getTitulo()+", del artista "+cancion1.getArtista()+" y dura "+cancion1.getDuracion()+" segundos");

        System.out.println("La segunda canción es "+cancion2.getTitulo()+", del artista "+cancion2.getArtista()+" y dura "+cancion2.getDuracion()+" segundos");

        cancion2.setDuracion(248);

        Cancion cancionMasLarga;

        if (cancion2.getDuracion()< cancion1.getDuracion()) {
            cancionMasLarga = cancion1;
        } else{
            cancionMasLarga = cancion2;
        }
        System.out.println("La canción "+cancionMasLarga.getTitulo()+" es la más larga");


    }
}