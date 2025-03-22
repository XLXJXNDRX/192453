import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner o = new Scanner(System.in);

        int bucle = 1;
        int sumaMultiplosDe3 = 0;
        int multiploDe5 = 0;
        int sumaDelResto = 0;

        System.out.println("Ingrese un número límite:");
        int Limite = o.nextInt();

        while (bucle <= Limite)
         
          {if (bucle % 3 == 0) {
                sumaMultiplosDe3 = sumaMultiplosDe3 + bucle;
                System.out.println(bucle + " es múltiplo de 3");

            }if (bucle % 5 == 0) {
                multiploDe5 = multiploDe5 + bucle;
                System.out.println(bucle + " es múltiplo de 5");
            
            }if (bucle % 3 != 0 && bucle % 5 != 0) {
                sumaDelResto = sumaDelResto + bucle;
                System.out.println(bucle + " no es múltiplo de 3 ni 5");
            
            }bucle = bucle + 1;
        }

        System.out.println("Suma de múltiplos de 3: " + sumaMultiplosDe3);
        System.out.println("Suma de múltiplos de 5: " + multiploDe5);
        System.out.println("Suma del resto: " + sumaDelResto);
    }
}
