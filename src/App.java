
public class App {

    public static void main(String[] args) throws Exception {

        Recursividad1 rec = new Recursividad1();
        int resultado = rec.factorial(5);
        System.out.println(resultado);
        System.out.println("el resultado de la suma consecutiva es: " + rec.sumaConsecutivos(5));
        System.out.println("el resultado de la potencia es: " + rec.potencia(4, 2));
        System.out.println("el resultado de sumar digitos es: " + rec.sumarDigitos(456));
        System.out.println("metodo fibonacci: " + rec.fibonacci(6));
        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("srs/DIRECTORIOS");

    }
}
