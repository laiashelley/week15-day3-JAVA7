
// 1- FIESTA EN TU CASA!  (JAVA VERSION)

// Montas una fiesta este finde en tu casa!
// Tienes una lista de 10 invitados en un arraylist OK

// – Michael, que estaba el primero de la lista, resulta que está de viaje y no puede venir OK
// – Te llama la Pepi que se apunta con su novio Silvester OK
// – Te encuentras a Eva, que dice que le cueles la tercera OK
// – Resulta que hay otra fiesta al lado la misma noche, con 10 personas más,  y toda esa gente dicen que les gusta vuestra música que se apuntan a tu fiesta! OK
// – Mostrar la lista definitiva de invitados en orden alfabético. OK
// -En un momento dado, tienes curiosidad por saber quién es el último de la lista (mostrarlo) OK
// – Además, con tanto lío, te entra la duda de si tu amigo Pedro está incluído en la lista o no. Si está, decir en qué posición está. Si no, decir que no está. OK

// A cada paso debe ir actualizándose la la lista de invitados en tu casa y qué proceso has hecho.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java7ejercicio1 {
    public static void main(String[] args) throws Exception {

    // CREATE: Creamos lista de la casa 1:
        
    ArrayList <String> listaCasa1 = new ArrayList <String> (Arrays.asList("Michael","Eric","Laia","Guille","Martí","Pol","Iman","Souhalia","Pepi","Eva"));

    System.out.println(listaCasa1);

    // DELETE: borramos a Michael:

    listaCasa1.remove(0);
    System.out.println(listaCasa1);

    // ADD: añadimos a Silvester:

    listaCasa1.add("Silvester");
    System.out.println(listaCasa1);

    // MODIFY: Eva dice que quiere estar en índice 2 (la tercera de la lista):

    listaCasa1.remove(8);
    System.out.println(listaCasa1);

    listaCasa1.set(2, "Eva");
    System.out.println(listaCasa1);

    // CREATE: Creamos lista de la casa 2:

    ArrayList <String> listaCasa2 = new ArrayList <String> (Arrays.asList("Gerard","Pedro","Nuria","Sigrid","Jordi","Paula","Oliver","Corey","Chester","Erica"));

    System.out.println(listaCasa2);

    // UNION: unimos las dos arrays: 

    ArrayList <String> listaTotalFiesta = new ArrayList<>();
    listaTotalFiesta.addAll(listaCasa1);
    listaTotalFiesta.addAll(listaCasa2);
    Collections.sort(listaTotalFiesta);

    // CONTROL: controlamos que se ha echo OK:

    System.out.println(listaTotalFiesta);

    // CONTROL: miramos quien es el último de la lista:

    String ultimoInvitado = listaTotalFiesta.get(listaTotalFiesta.size() - 1);
    System.out.println(ultimoInvitado);

    // CONTROL: controlamos que nuestro amigo Pedro está en la lista o no:

    if (listaTotalFiesta.contains("Pedro")){
        System.out.println("Pedro está en la lista");
        int posicionPedro = listaTotalFiesta.indexOf("Pedro");
        System.out.println("Pedro se encuentra en la posición: " + posicionPedro);
    } else {
        System.out.println("Pedro no está en la lista");
    }
    
    }
}
