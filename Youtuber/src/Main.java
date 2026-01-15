
public class Main {
    public static void main(String[] args) {

    Youtuber youtuber1=new Youtuber();
    Youtuber youtuber2=new Youtuber();
    Youtuber youtuber3=new Youtuber();

    youtuber1.setNombre("Jaime Altozano");
    youtuber1.setCategoria("Música");
    youtuber1.setSubs(3.54);

    youtuber2.setNombre("Clavero");
    youtuber2.setCategoria("Vlogs");
    youtuber2.setSubs(2.79);

    youtuber3.setNombre("Alvaro Wasabi");
    youtuber3.setCategoria("Cine");
    youtuber3.setSubs(434000);

        System.out.println("El youtuber "+youtuber1.getNombre()+" hace contenido de la categoría: "+youtuber1.getCategoria()+" y tiene "+youtuber1.getSubs()+" millones de subs");
        System.out.println("El youtuber "+youtuber2.getNombre()+" hace contenido de la categoría: "+youtuber2.getCategoria()+" y tiene "+youtuber2.getSubs()+" millones subs");
        System.out.println("El youtuber "+youtuber3.getNombre()+" hace contenido de la categoría: "+youtuber3.getCategoria()+" y tiene "+(int)youtuber3.getSubs()+" subs");

    youtuber2.setSubs(3);

    }
}