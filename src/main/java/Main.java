public class Main {
    public static boolean within10and20(int x, int y) {
        return  x + y >= 10 && x + y <= 20;

    }

    public static void isPositiveOrNegative(int x) {
        if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isNegative ( int x){
        return (x < 0);
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}
