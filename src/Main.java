public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println(sum(2, 3));
        System.out.println(sum(4.5, 3.2));
        System.out.println(sum(4, 3, 7));
    }
    // 1
    static int sum(int x, int y){
        return x + y;
    }

    static double sum(double x, double y){
        return x + y;
    }

    static int sum(int x, int y, int z){
        return x + y + z;
    }
}