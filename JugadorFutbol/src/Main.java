//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JugadorFutbol jugador1=new JugadorFutbol();

        jugador1.setNombre("Raúl");
        jugador1.setEquipo("Real Madrid");
        jugador1.setDorsal(7);
        jugador1.setPosicion("delantero");

        System.out.println("El jugador: "+jugador1.getNombre()+" tiene el dorsal: "+jugador1.getDorsal()+" juega en el "+jugador1.getEquipo()+" y juega como "+jugador1.getPosicion());

        jugador1.setEquipo("Schalke 04");

        System.out.println("El jugador: "+jugador1.getNombre()+" tiene el dorsal: "+jugador1.getDorsal()+" juega en el "+jugador1.getEquipo()+" y juega como "+jugador1.getPosicion());


    }
}