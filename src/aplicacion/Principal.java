package aplicacion;

public class Principal {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Principal <numero_de_intentos>");
            System.exit(1);
        }

        long numIntentos = Long.parseLong(args[0]);

        System.out.println("Aproximación de pi: " + Matematicas.aproximarPILambda(numIntentos));
    }
