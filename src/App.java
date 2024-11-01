
public class App {

    public static void main(String[] args) throws Exception {
                Recursividad1 rec = new Recursividad1();
                int resultado = rec.factorial(5);
                System.out.println("Resultado del factorial de 5: " + resultado);
                
                System.out.println("Resultado de la suma consecutiva: " + rec.sumaConsecutivos(5));
                System.out.println("Resultado de la potencia: " + rec.potencia(4, 2));
                System.out.println("Suma de dígitos: " + rec.sumarDigitos(456));
                System.out.println("Método Fibonacci: " + rec.fibonacci(6));
                GenerarDirectorios generador = new GenerarDirectorios();
                String pathBase = "srs/DIRECTORIOS";
                generador.crearEstructuraDirectorios(pathBase);
                // Renombrado de directorios con prefijo "nuevoNombre_"
                RenombrarDirectorios rd = new RenombrarDirectorios();
                rd.renombrarDirectorios(pathBase, "nuevoNombre_");
            }
        }
        