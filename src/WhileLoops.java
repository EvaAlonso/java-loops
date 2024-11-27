import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int i = 0;
        while (i < 100){
            if(getRandomNumber(i) == 7){
                System.out.println("Ha salido 7");
                break;
            } else{
                i++;
            }
        }


        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int j = 0;
        while (j < 100){
            if(getRandomNumber(j) > 70){
                System.out.println("El número aleatorio " + j + " es mayor a 70");
                break;
            } else{
                j++;
            }
        }


        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        Scanner scanner = new Scanner(System.in);

        int numberGenerated = getRandomNumber(100);
        System.out.println("Adivina un número entre 1 y 100, tienes 10 intentos:");
        int loops = 0;
        int maxLoops = 10;
        do {

            int numberGuess = scanner.nextInt();
            if (numberGuess == numberGenerated){
                System.out.println("¡Felicidades, has adivinado el número! " + numberGenerated);
                break;
            }else if (numberGenerated < numberGuess){
                System.out.println("El número que tienes que adivinar es más pequeño");
                System.out.println("Adivina otra vez, tienes " + (maxLoops - loops));
            } else {
                System.out.println("El número que tienes que adivinar es mayor");
                System.out.println("Adivina otra vez, tienes " + (maxLoops - loops) + " intentos");
            }
            loops++;

        }while (maxLoops >= loops);

        scanner.close();
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
