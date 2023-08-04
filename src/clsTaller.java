import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class clsTaller {

    public static Scanner varScanner = new Scanner(System.in);


    public static void operacionesBasicas(){
        /*1.Realiza un programa que solicite al usuario dos números enteros y muestre
        su suma, resta, multiplicación y división.*/

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
    public static void determinarParidad(){
        /*2. Escribe un programa que pida al usuario un número entero y determine si es
        par o impar.*/

        System.out.println("Digite el numero: ");
        int varNumerOne = varScanner.nextInt();
        String vResultado = (varNumerOne%2==0)?"El numero es par.":"El numero es impar";
        System.out.println(vResultado);
    }
    public static void operacionesCirculo(){
        /*3. Crea un programa que calcule y muestre el área y el perímetro de un círculo.
         El usuario debe proporcionar el radio del círculo.
        */

        System.out.println("Digite el radio del circulo: ");
        float varRadioCirculo = varScanner.nextInt();
        double varPerimetro = 2*Math.PI*varRadioCirculo;
        double varArea = Math.PI*Math.pow(varRadioCirculo,2);
        System.out.println("El radio del circulo es: " + varRadioCirculo);
        System.out.println("El perimetro del circulo es: " + varPerimetro);
        System.out.println("El area del circulo es: " + varArea);
    }
    public static void siEsMayorEdad(){
        /*4.Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
        o menor de edad.
        */

        System.out.println("Digite la edad: ");
        int varEdad = varScanner.nextInt();
        String varResultado = (varEdad>=18)?"Es mayor de edad.":"Es menor de edad.";
        System.out.println(varResultado);
    }
    public static void numeroMayor(){
        /*5. Realiza un programa que solicite al usuario dos números enteros y determine
         cuál es el mayor de ellos.
        */

        System.out.println("Digite el primer numero: ");
        float varNumberOne = varScanner.nextFloat();
        System.out.println("Digite el segundo numero: ");
        float varNumberTwo = varScanner.nextFloat();
        String vResultado = (varNumberOne>varNumberTwo)?varNumberOne+" Es mayor.":varNumberTwo+" Es mayor.";
        System.out.println(vResultado);
    }
    public static void siEsPositivo(){
        /*6. Escribe un programa que pida al usuario un número y verifique si es positivo,
         negativo o cero */

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
    public static void tablaHastaDiez(){
        /*7. Crea un programa que pida al usuario un número entero positivo y muestre
        su tabla de multiplicar hasta el 10.
        */

        System.out.println("Digite el numero: ");
        int varNumberOne = varScanner.nextInt();
        for(int i = 1; i<=10;i++){
            int vResultado = varNumberOne*i;
            System.out.println(vResultado);
        }
    }
    public static void adivinarNumero(){
        /*8. Realiza un programa que simule un juego de adivinar un número. El
        programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
        adivinarlo. El programa debe indicar si el número ingresado es mayor o
        menor que el número a adivinar */

        Random random = new Random();
        int varNumero = random.nextInt(100)+1;
        int varNumUsuario;

        while(true){
            System.out.println("Digite el numero: ");
            varNumUsuario = varScanner.nextInt();
            if(varNumUsuario == varNumero)break;
            String vPista = (varNumUsuario>varNumero)?"El numero es mayor al que intentas adivinar.":"El numero es menor al que intentas adivinar.";
            System.out.println(vPista);
        }
        System.out.println("Felicidades, adivinaste el numero!");
    }
    public static void numeroFactorial(){
        /*9. Escribe un programa que solicite al usuario un número entero positivo y
         calcule su factorial*/
        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        int varResultado = functionFactorial(varNumUsuario);
        System.out.println("El factorial de: " + varNumUsuario + " es: " + varResultado);

    }
    public static int functionFactorial(int prmNumero){
        /*9. Escribe un programa que solicite al usuario un número entero positivo y
         calcule su factorial*/
        if(prmNumero>0){
            return prmNumero * functionFactorial(prmNumero-1);
        }
        return 1;
    }
    public static void serieFibonacci(){
        /*10. Crea un programa que muestre los primeros 20 números de la
          serie Fibonacci. La serie Fibonacci se forma sumando los dos números
          anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
        */
        int varNumero = 20;
        for(int i = 0; i<varNumero;i++){
            System.out.println(calcularSF(i));
        }
    }
    public static int calcularSF(int prmNumero){
        /*10. Crea un programa que muestre los primeros 20 números de la
          serie Fibonacci. La serie Fibonacci se forma sumando los dos números
          anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
        */
        if(prmNumero == 0 || prmNumero == 1){
            return prmNumero;
        }
        else{
            return calcularSF(prmNumero-1)+calcularSF(prmNumero-2);
        }
    }
    public static void formulaHeron(){
        /*11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula
        de Herón. El usuario debe ingresar las longitudes de los tres lados.*/
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
    public static void siEsPrimo(){
        /*12. Realiza un programa que pida al usuario un número entero y determine si es
        un número primo o no*/
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
    public static void redondearDecimal(){
        /*13.Pide al usuario un número decimal y muestra su valor redondeado a un
        número específico de decimales*/

        System.out.println("Digite el numero: ");
        double varNumUsuario = varScanner.nextDouble();
        System.out.println("Digite la cantidad a redondear: ");
        int varNumRedondeo = varScanner.nextInt();

        double varFactorRedondeo = Math.pow(10,varNumRedondeo);
        double varResultado = Math.round(varNumUsuario*varFactorRedondeo)/varFactorRedondeo;
        System.out.println(varResultado);
    }
    public static void siEsPerfecto(){
        /*14. Escribe un programa que solicite al usuario un número entero positivo y
          verifique si es un número perfecto. Un número perfecto es aquel cuya suma
          de sus divisores propios (excluyendo al propio número) es igual al número*/

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
    public static void siEsCapicua(){
        /*15. Crea un programa que pida al usuario un número entero y determine si es un
          número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
          derecha que de derecha a izquierda.*/

        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        StringBuilder varSB = new StringBuilder();
        varSB.append(varNumUsuario).reverse();
        String varResultado = (String.valueOf(varNumUsuario).contentEquals(varSB))?"El numero es capicua.":"El numero no es capicua.";
        System.out.println(varResultado);

    }
    public static void serieFibonacciHasta(){
        /*16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
          número dado ingresado por el usuario.*/

        System.out.println("Digite el numero: ");
        int varNumUsuario = varScanner.nextInt();
        for(int i = 0; i<varNumUsuario;i++){
            System.out.println(calcularSF(i));
        }
    }
    public static void siEsPrimoRango(){
         /*17. Pide al usuario dos números enteros y muestra todos los números primos
         que se encuentran en ese rango.
        */

        System.out.println("Digite el primer numero: ");
        int varNumberOne = varScanner.nextInt();
        System.out.println("Digite el segundo numero: ");
        int varNumberTwo = varScanner.nextInt();
        for (int i = varNumberOne; i<=varNumberTwo;i++){
            if(siEsPrimo(i)){
                System.out.println("El numero primo es: " + i);
            }
        }
    }
    private static boolean siEsPrimo(int prmNumero){
         /*17.Pide al usuario dos números enteros y muestra todos los números primos
         que se encuentran en ese rango.
        */

        for (int i = 2; i <= Math.sqrt(prmNumero); i++) {
            if (prmNumero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void generarContrasenia(){

        /*18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que
          contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
          clase Math para generar números aleatorios y la clase String para manipular
          la contraseña.
        */

        String varAlphabetic = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String varNumbers = "0123456789";
        char [] varArrayAlphabetic = varAlphabetic.toCharArray();
        char [] varArrayNumbers = varNumbers.toCharArray();
        StringBuilder varSB = new StringBuilder();
        Random varRandom = new Random();


        for(int i = 0; i<4;i++){
            varSB.append(varArrayAlphabetic[varRandom.nextInt(52)]);
            varSB.append(varArrayNumbers[varRandom.nextInt(10)]);
            System.out.println(varSB);
        }
        System.out.println("La contraseña es:" + varSB);

    }
    public static void nombreMayusMinus(){
        /*19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en
        mayúsculas y minúsculas
        */
        System.out.println("Digite su nombre: ");
        String varNombre = varScanner.nextLine();
        System.out.println("Su nombre en minusculas es: " +varNombre.toLowerCase()+ " y en mayusculas es: "+varNombre.toUpperCase());


    }
    public static void reverseCadena(){
        /*20. Realiza un programa que solicite al usuario una cadena y luego invierta su
        orden*/

        System.out.println("Digite su palabra : ");
        StringBuilder varCadenaSB = new StringBuilder(varScanner.next());
        System.out.println(varCadenaSB.reverse());

    }
    public static void countCadena(){
        /*21. Pide al usuario una cadena y muestra cuántas veces aparece una letra
          específica en ella*/
        System.out.println("Digite su palabra/frase : ");
        String varFrase = varScanner.nextLine().toLowerCase();
        System.out.println(varFrase);

        HashMap<Character,Integer> varHashContador = new HashMap<>();

        for (char vLetra : varFrase.toCharArray()) {
            if (varHashContador.containsKey(vLetra)) {
                varHashContador.put(vLetra, varHashContador.get(vLetra) + 1);
            } else {
                varHashContador.put(vLetra, 1);
            }
        }

        for (char vLetra: varHashContador.keySet()){
            int varContador = varHashContador.get(vLetra);
            System.out.println("La letra: [" + vLetra + "] se repite: " + varContador);
        }






    }
    public static void siEsPalindromo(){
        /*22. Escribe un programa que solicite al usuario una frase y verifique si es un
              palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)*/
        System.out.println("Digite el frase: ");
        String varFraseUsuario = varScanner.nextLine().toLowerCase().replaceAll("\\s+", "");
        StringBuilder varSB = new StringBuilder();
        varSB.append(varFraseUsuario).reverse();
        String varResultado = (varFraseUsuario.contentEquals(varSB))?"La frase es palindroma.":"La frase no es palindroma.";
        System.out.println(varResultado);
    }
}
