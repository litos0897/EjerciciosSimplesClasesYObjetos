
public class Main {
    public static void main(String[] args) {
    Manga manga1=new Manga();

    manga1.setTitulo("One Piece");
    manga1.setAutor("Eichiro Oda");
    manga1.setNumVolumen(45);
    manga1.setLeido(true);

        System.out.println("El manga "+manga1.getTitulo()+", escrito por "+manga1.getAutor()+", va por el volumen número "+manga1.getNumVolumen()+" y ha sido leído? "+manga1.getLeido());
        }
}
