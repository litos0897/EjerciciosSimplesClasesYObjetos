//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1=new Pelicula();
        Pelicula pelicula2=new Pelicula();

        pelicula1.setTitulo("Titanic");
        pelicula1.setDirector("James Cameron");
        pelicula1.setAnhoEstreno(1997);
        pelicula1.setDuracion(195);

        pelicula2.setTitulo("Nosferatu");
        pelicula2.setDirector("Robert Eggers");
        pelicula2.setAnhoEstreno(2024);
        pelicula2.setDuracion(132);

        System.out.println("La primera película es "+pelicula1.getTitulo()+", del director "+pelicula1.getDirector()+", del año "+pelicula1.getAnhoEstreno()+" y dura "+pelicula1.getDuracion()+" minutos");
        System.out.println("La segunda película es "+pelicula2.getTitulo()+", del director "+pelicula2.getDirector()+", del año "+pelicula2.getAnhoEstreno()+" y dura "+pelicula2.getDuracion()+" minutos");

        pelicula1.setDirector ("Steven Spielberg".toUpperCase());

    }
    }
