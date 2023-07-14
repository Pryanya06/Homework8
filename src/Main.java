public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weights = new int[3];
        double[] weights2 = {1.57, 7.654, 9.986};
        int[] weights3 = {2, 4, 6, 8, 10};
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        double[] weights2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights2.length; i++) {
            if (i == weights2.length - 1) {
                System.out.println(weights2[i]);
                break;
            }
            System.out.print(weights2[i] + ", ");
        }

        int[] weights3 = {2, 4, 6, 8, 10};
        for (int i = 0; i < weights3.length; i++) {
            if (i == weights3.length - 1) {
                System.out.println(weights3[i]);
                break;
            }
            System.out.print(weights3[i] + ", ");
        }
    }
    public static void task3() {
        System.out.println( "Задача 3");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 2; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
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

