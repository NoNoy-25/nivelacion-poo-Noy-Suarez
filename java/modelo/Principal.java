
package modelo;

public class Principal {
public static void main(String[] args) {


    Personaje guerrero = new Personaje(

        "Aragorn", "Guerrero", 100, 18, 12);

    Personaje mago = new Personaje(

        "Gandalf", "Mago", 70, 28, 5);

    Personaje arquero = new Personaje(

        "Legolas", "Arquero", 85, 22, 8);

    System.out.println(guerrero);

    System.out.println(mago);

    System.out.println(arquero);

     // Dos objetos del mismo molde son independientes

    guerrero.vida -= 30;

    System.out.println(guerrero.vida); // 70

    System.out.println(mago.vida); // 70 (sin cambio)

    guerrero.mostrarEstado();

  }

} 