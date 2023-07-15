import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        double[] number1 = {1.57, 7.654, 9.986};
        int[] number2 = {2, 4, 6, 8, 10};
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        double[] number1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number1.length; i++) {
            if (i == number1.length - 1) {
                System.out.println(number1[i]);
                break;
            }
            System.out.print(number1[i] + ", ");
        }

        int[] number2 = {2, 4, 6, 8, 10};
        for (int i = 0; i < number2.length; i++) {
            if (i == number2.length - 1) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = number.length - 1; i >= 0; --i) {
            if (i > 0) {
                System.out.println(number[i] + ", ");
            } else {
                System.out.print(number[i]);
            }
        }
        double[] number1 = {1.57, 7.654, 9.986};
        for (int i = number1.length - 1; i >= 0; --i) {
            if (i > 0) {
                System.out.println(number1[i] + ", ");
            } else {
                System.out.print(number1[i]);
            }
        }

        int[] number2 = {2, 4, 6, 8, 10};
        for (int i = number2.length - 1; i >= 0; --i) {
            if (i > 0) {
                System.out.println(number2[i] + ", ");
            } else {
                System.out.print(number2[i]);
            }
        }
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 3};
            for (int i = 0; i < number.length; i++) {
                if (number[i] % 2 != 0) {
                    number[i]++;
                }
            }
            System.out.println(Arrays.toString(number));
        }
    }


