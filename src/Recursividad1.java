
public class Recursividad1 {
    
    public int factorial(int n) {
        System.out.println("calculando el factorial de " + n);
        //caso base: n sea 0! y 1! son iguales a 1
        if (n == 0 || n == 1) {
            System.out.println("caso base alcanzado el factorial de : " + n + " es 1 ");
            return 1;

        }
        int resultado = n * factorial(n - 1);
        System.out.println("resultado parcial para " + n + "* factorial (" + (n - 1) + ") = " + resultado);
        return resultado;
        //  return n * factorial(n-1);

    }
    //calcular la suma de los numeros conscutivos
    // n = 5 resultado 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        }
        //caso recursivo: sumar la n a la suma de los numero 1 a n-1
        return n + sumaConsecutivos(n - 1);  // Llamada recursiva
    }
    //calcular la potencia de un numero
    public int potencia(int base, int exponente) {
        if (exponente == 0) {

            return 1;
        }
        //caso recursivo: multiplicar la base por la potencia de base^(exponente-1)
        return base * potencia(base, exponente - 1);
    }


    //crear un metodo que sume los diguitos de un numero 
    // si mando 456 = 15
    //4+5+6=5
    //pista se usa % mob
    public int sumarDigitos(int numero) {
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma = suma + digito;
            numero = numero / 10;
        }
        return suma;
    }
    /****************************************************************FIBONACCI******************************************************************/
    public int fibonacci(int n){
        // Caso base: si n es 0 o 1, devolver n
        if (n == 0 || n == 1) {
            return n;
        }
        // Caso recursivo: sumar los dos números de Fibonacci anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
