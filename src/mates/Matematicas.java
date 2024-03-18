import java.util.Random;
import java.util.stream.LongStream;

public class Matematicas {

    /**
     * Aproxima el valor de pi utilizando el método de Montecarlo y expresiones lambda.
     *
     * @param numIntentos El número de intentos o puntos generados para la aproximación.
     * @return Una aproximación del valor de pi.
     */
    public static double aproximarPILambda(long numIntentos) {
        Random generadorAleatorio = new Random();

        // Contar cuántos puntos aleatorios caen dentro del círculo
        long puntosDentroCirculo = LongStream.range(0, numIntentos)
                .filter(i -> {
                    double coordenadaX = generadorAleatorio.nextDouble();
                    double coordenadaY = generadorAleatorio.nextDouble();
                    return coordenadaX * coordenadaX + coordenadaY * coordenadaY <= 1;
                })
                .count();

        return 4.0 * puntosDentroCirculo / numIntentos;
    }
}
