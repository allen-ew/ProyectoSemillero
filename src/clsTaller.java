import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class clsTaller {

    public static Scanner varScanner = new Scanner(System.in);

    /*1.Realiza un programa que solicite al usuario dos números enteros y muestre
    su suma, resta, multiplicación y división.*/
    public static void operacionesBasicas(){
        System.out.println("Digite el primer numero: ");
        float varNumberOne = varScanner.nextFloat();
        System.out.println("Digite el segundo numero: ");
        float varNumberTwo = varScanner.nextFloat();
        float vSuma = varNumberOne + varNumberTwo;
        float vResta = varNumberOne - varNumberTwo;
        float vMultiplicacion = varNumberOne * varNumberTwo;
        String vDivision = (varNumberTwo!=0)?String.valueOf(varNumberOne/varNumberTwo):"No se puede dividir entre cero!";
        System.out.println("Suma: " + vSuma + ", Resta: " + vResta + ", Multiplicacion: " + vMultiplicacion + ", Division: " + vDivision);

    }

    /*2. Escribe un programa que pida al usuario un número entero y determine si es
    par o impar.*/

    public static void determinarParidad(){
        System.out.println("Digite el numero: ");
        int varNumerOne = varScanner.nextInt();
        String vResultado = (varNumerOne%2==0)?"El numero es par.":"El numero es impar";
        System.out.println(vResultado);
    }

    /*3. Crea un programa que calcule y muestre el área y el perímetro de un círculo.
         El usuario debe proporcionar el radio del círculo.
    */
    public static void operacionesCirculo(){
        System.out.println("Digite el radio del circulo: ");
        float varRadioCirculo = varScanner.nextInt();
        double varPerimetro = 2*Math.PI*varRadioCirculo;
        double varArea = Math.PI*Math.pow(varRadioCirculo,2);
        System.out.println("El radio del circulo es: " + varRadioCirculo);
        System.out.println("El perimetro del circulo es: " + varPerimetro);
        System.out.println("El area del circulo es: " + varArea);
    }

    /*4.Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
        o menor de edad.
    */

    public static void siEsMayorEdad(){
        System.out.println("Digite la edad: ");
        int varEdad = varScanner.nextInt();
        String varResultado = (varEdad>=18)?"Es mayor de edad.":"Es menor de edad.";
        System.out.println(varResultado);
    }

    /*5. Realiza un programa que solicite al usuario dos números enteros y determine
         cuál es el mayor de ellos.
    */
    public static void numeroMayor(){
        System.out.println("Digite el primer numero: ");
        float varNumberOne = varScanner.nextFloat();
        System.out.println("Digite el segundo numero: ");
        float varNumberTwo = varScanner.nextFloat();
        String vResultado = (varNumberOne>varNumberTwo)?String.valueOf(varNumberOne)+" Es mayor.":String.valueOf(varNumberTwo)+" Es mayor.";
        System.out.println(vResultado);
    }

    /*6. Escribe un programa que pida al usuario un número y verifique si es positivo,
         negativo o cero */

    public static void siEsPositivo(){
        System.out.println("Digite el numero: ");
        float varNumberOne = varScanner.nextFloat();
        if(varNumberOne==0){
            System.out.println("El numero es cero.");
        } else if (varNumberOne>0) {
            System.out.println("El numero es positivo.");
        }else {
            System.out.println("El numero es negativo.");
        }
    }

    /*7. Crea un programa que pida al usuario un número entero positivo y muestre
      su tabla de multiplicar hasta el 10.
    */
    public static void tablaHastaDiez(){
        System.out.println("Digite el numero: ");
        int varNumberOne = varScanner.nextInt();
        for(int i = 1; i<=10;i++){
            int vResultado = varNumberOne*i;
            System.out.println(vResultado);
        }
    }

    /*8. Realiza un programa que simule un juego de adivinar un número. El
    programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
    adivinarlo. El programa debe indicar si el número ingresado es mayor o
    menor que el número a adivinar */

    public static void adivinarNumero(){
        Random random = new Random();
        int varNumero = random.nextInt(100)+1;
        int varNumUsuario = 0;

        while(true){
            System.out.println("Digite el numero: ");
            varNumUsuario = varScanner.nextInt();
            if(varNumUsuario == varNumero)break;
            String vPista = (varNumUsuario>varNumero)?"El numero es mayor al que intentas adivinar.":"El numero es menor al que intentas adivinar.";
            System.out.println(vPista);
        }
        System.out.println("Felicidades, adivinaste el numero!");
    }

    /*9. Escribe un programa que solicite al usuario un número entero positivo y
         calcule su factorial*/

    public static void numeroFactorial(){
        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        int varResultado = functionFactorial(varNumUsuario);
        System.out.println("El factorial de: " + varNumUsuario + " es: " + varResultado);

    }
    public static int functionFactorial(int prmNumero){
        if(prmNumero>0){
            return prmNumero * functionFactorial(prmNumero-1);
        }
        return 1;
    }

    /*10. Crea un programa que muestre los primeros 20 números de la
          serie Fibonacci. La serie Fibonacci se forma sumando los dos números
          anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
    */

    public static void serieFibonacci(){
        int varNumero = 20;
        for(int i = 0; i<varNumero;i++){
            System.out.println(calcularSF(i));
        }
    }
    public static int calcularSF(int prmNumero){
        if(prmNumero == 0 || prmNumero == 1){
            return prmNumero;
        }
        else{
            return calcularSF(prmNumero-1)+calcularSF(prmNumero-2);
        }
    }

    /*11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula
        de Herón. El usuario debe ingresar las longitudes de los tres lados.*/

    public static void formulaHeron(){
        System.out.println("Digite el primer lado: ");
        double varSideOne = varScanner.nextInt();
        System.out.println("Digite el segundo lado: ");
        double varSideTwo = varScanner.nextInt();
        System.out.println("Digite el tercer lado: ");
        double varSideThree = varScanner.nextInt();
        double varSemiPerimetro = (varSideOne+varSideTwo+varSideThree)/2;
        double varArea = Math.sqrt(varSemiPerimetro*(varSemiPerimetro-varSideOne)*(varSemiPerimetro-varSideTwo)*(varSemiPerimetro-varSideThree));
        System.out.println("El area del triangulo con los lados : " + varSideOne + ", " + varSideTwo + ", " + varSideThree + " es: " + varArea + " Metros Cuadrados.");

    }
    /*12. Realiza un programa que pida al usuario un número entero y determine si es
    un número primo o no*/
    public static void siEsPrimo(){
        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        int varContador = 0;

        for (int i = 2; i <= Math.sqrt(varNumUsuario); i++) {
            if (varNumUsuario % i == 0) {
                varContador++;
                break;
            }
        }

        String varResultado = (varContador==0) ? "El numero es primo." : "El numero no es primo.";
        System.out.println(varResultado);
    }
    /*13.Pide al usuario un número decimal y muestra su valor redondeado a un
        número específico de decimales*/
    public static void redondearDecimal(){
        System.out.println("Digite el numero: ");
        double varNumUsuario = varScanner.nextDouble();
        System.out.println("Digite la cantidad a redondear: ");
        int varNumRedondeo = varScanner.nextInt();

        double varFactorRedondeo = Math.pow(10,varNumRedondeo);
        double varResultado = Math.round(varNumUsuario*varFactorRedondeo)/varFactorRedondeo;
        System.out.println(varResultado);
    }
    /*14. Escribe un programa que solicite al usuario un número entero positivo y
          verifique si es un número perfecto. Un número perfecto es aquel cuya suma
          de sus divisores propios (excluyendo al propio número) es igual al número*/

    public static void siEsPerfecto(){
        //El metodo solo sirve para numeros en el rango del tipo long.

        System.out.println("Digite el numero: ");
        long varNumUsuario = varScanner.nextInt();
        long varSumaDivisores = 0;
        for(int i = 1; i<varNumUsuario;i++){
            if(varNumUsuario%i == 0){
                varSumaDivisores+=i;
            }
        }
        String varResultado = (varSumaDivisores == varNumUsuario)?"El numero es perfecto.":"El numero no es perfecto.";
        System.out.println(varResultado);
    }

    /*15. Crea un programa que pida al usuario un número entero y determine si es un
          número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
          derecha que de derecha a izquierda.*/
    public static void siEsCapicua(){
        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        StringBuilder varSB = new StringBuilder();
        varSB.append(String.valueOf(varNumUsuario)).reverse();
        String varResultado = (String.valueOf(varNumUsuario).contentEquals(varSB))?"El numero es capicua.":"El numero no es capicua.";
        System.out.println(varResultado);

    }

    /*16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
          número dado ingresado por el usuario.*/
    public static void serieFibonacciHasta(){
        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        for(int i = 0; i<varNumUsuario;i++){
            System.out.println(calcularSF(i));
        }
    }
}
