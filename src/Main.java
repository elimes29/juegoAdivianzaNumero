import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    ¡Ahora te toca a ti!
    Practica los conceptos que se enseñaron durante esta clase con el siguiente desafío:
    Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir
    al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el
    número ingresado por el usuario es mayor o menor que el número generado.

    Consejos:
    Para generar un número aleatorio en Java: new Random().nextInt(100);
    Utiliza el Scanner para obtener los datos del usuario.
    Utiliza una variable para contar los intentos.
    Utiliza un bucle para controlar los intentos.
    Utiliza la instrucción ‘break;’ para salir del bucle.

¡Buena suerte!
     */


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numumeroEnMente = new Random().nextInt(100);
        int numeroUsuario;

        System.out.println("Bienvenido al Juego de Adivinanzas. Avivina el número que tengo en mente (0-100), tienes 5 intentos");

        for (int i = 0; i < 5; i++) {

            System.out.println("Indica el número.");
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario == numumeroEnMente){
                System.out.println("Eres un crack adivinaste");
            } else if (numeroUsuario > numumeroEnMente) {
                System.out.println("lo siento el número en mi mente en MENOR, te quedan "+ (4-i) +" intentos");
                if (i == 4){
                    System.out.println("Perdiste");
                }
            } else{
                System.out.println("lo siento el número en mi mente en MAYOR, te quedan "+ (4-i) +" intentos");
                if (i == 4){
                    System.out.println("Perdiste");
                }
            }

        }


    }
}