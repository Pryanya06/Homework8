public class Main {
    public static void main(String[] args) {


        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + " ");
        }
        double[] weights2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights2.length; i++) {
            if (i == weights2.length - 1) {
                System.out.println(weights2[i]);
                break;
            }
            System.out.print(weights2[i] + " ");
        }


            int[] weights3 = {2, 4, 6, 8, 10};
        for (int i = 0;  i < weights3.length; i++) {
            if (i == weights3.length - 1) {
                System.out.println(weights3[i]);
                break;
            }
            System.out.print(weights3[i] + " ");
        }

    }
}
