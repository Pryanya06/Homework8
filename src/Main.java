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


    public static void task4() {
        System.out.println("Задача 4");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i+=1) {
            if (i == weights.length -1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
    }

    }

