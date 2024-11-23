public class ForLoops {
    public static void main(String[] args) {

        //Escribe un bucle for que imprima números del 1 al 10
        System.out.println("bucle for para imprimir los números del 1 al 10");
        for (int i = 1; i<11; i++){
            System.out.println(i);
        }
        //Escribe un bucle for que imprima "¡Hola DiscaCoders!" 5 veces
        System.out.println("saludamos 5 veces con un bucle for");
        for (int i = 0; i < 5; i++) {
            System.out.println("¡Hola DiscaCoders!");
        }

        //Escribe un bucle for que imprima la tabla de multiplicar del número 7 (del 1 al 10)
        System.out.println("la tabla del 7");
        for (int i = 1; i <11 ; i++) {
            System.out.println("7 * " + i + " = " + 7*i);
        }
        //Escribe un bucle for que imprima números del 10 al 1 
        System.out.println("bucle for para imprimir los números del 10 al 1");
        for (int i = 10; i>0; i--){
            System.out.println(i);
        }

        //Escribe un bucle for que imprima los 10 primeros números impares
        System.out.println("Los primeros 10 números impares");
        for (int i = 1; i < 20; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }

        //Escribe un bucle for que encuentre el número más pequeño que sea mayor a 20 y que sea divisible para 8, usando 'break'.
        //Imprime: El número más pequeño mayor de 20 que es divisible para 8 es <result>
        System.out.println("El primer número mayor a 20 y divisible entre 8");
        for (int i = 20; i <81 ; i++) {
            if(i % 8 == 0 ){
                System.out.println(i);
                break;
            }
        }

        //Escribe un bucle for que imprima números pares del 1 al 20 saltando los números impares usando 'continue'
        System.out.println("Los números pares del 1 al 20");
        for (int i = 1; i < 21; i++){
            if(i%2 == 0){
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}