public class Main {

    public static void main(String[] args) {
        Potato miPotato = new Potato(); //Aqui se crea una intancia(yo antenc que es una clase), i declaramos un nuevo obtejo Potato,
        //guardado en la variablo miPotato

        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos); //Asi accedim a miPotato y despres al parametro barzaos, que la
        // funcio li ha cambiat el valor.


    }


}
class Potato{
    public int brazos = 0; // Asi se guarda el valor modificat per la funcio.
    public void QuitarBrazo(){
        this.brazos--; //El this hace que entremos en Potato y despues pasamos a brazos.
    }
}
//Añadimos unos comentarios para testear git.