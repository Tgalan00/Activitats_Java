import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activitats {

        public static void main(String[] args) {


        }

        public static void ejercicio1() {


            System.out.println("Ingresa el nombre de usuario: ");
            Scanner read = new Scanner(System.in);

            String name = read.nextLine();

            System.out.println("El nombre de usuario es:  " + name);

            System.out.println("Ingresa el nombre de un artista mi pana: ");


            String artist = read.next();

            System.out.print("El nombre del artista es:  " + artist);


            System.out.println("Un hobby loquete: ");

            String hobby = read.next();

            System.out.print("El Hobby es:  " + hobby);


        }

        public static void ejercicio2() {


            System.out.print("Ingresa el número: ");
            Scanner number = new Scanner(System.in);

            int n = number.nextInt();
            for (int i = 0; i <= n; i++) {
                System.out.print(i);
            }


        }

        public static Boolean ejercicio5(Integer n) {

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void ejercicio5_b(Integer k) {

            for (int i = 1; i <= k; i++) {

                if (ejercicio5(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean ejercicio6(List<Integer> marcel, List<Integer> marcel2) {


            for (int i = 0; i < marcel.size(); i++) {
                if (!marcel.get(i).equals(marcel2.get(i))) {
                    return false;
                }

            }
            return true;

        }

        public static <T> List<T> ejercicio7(List<T> elements, List<Integer> indices) { //Exercici 2 Excepcions
            List<T> result = new ArrayList<>();

            for (Integer index : indices) {
                if (index >= 0 && index < elements.size()) {
                    result.add(elements.get(index));
                }
            }

            return result;
        }


        public static void ejercicio8(List<Integer> numbers) {      //Exercici 4 de Nullability
            for (Integer number : numbers) {
                if (number != null && number % 2 != 0) {
                    System.out.println(number);
                }
            }
        }


        public static void ejercicio9(int n, int a, int b) {        //Exercici 7 Recursivitat
            int c = a + b;
            if (c > n) {
                return;
            }
            System.out.println(c);
            ejercicio9(n, b, c);
        }



        public static void ejercicio10() {      // Exercici 9 Loops

            System.out.print("Introduce numero:");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int i = 1;
            boolean ok = false;

            while (!ok) {

                num = num / 10;

                if (num > 0) {

                    i = i + 1;
                }

                if (num == 0) {

                    System.out.println("En total hay " + i + " digitos");
                    ok = true;
                }
            }
        }


    }


