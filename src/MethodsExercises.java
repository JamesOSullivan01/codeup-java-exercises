public class MethodsExercises {
    public static int addThis (int n1, int n2) {
        int result;
        result = n1 + n2;
        return result;
    }

    public static int subtractThis (int n1, int n2) {
        int result;
        result = n1 - n2;
        return result;
    }

    public static int multiplyThis (int n1, int n2) {
        int result;
        result = n1 * n2;
        return result;
    }

    public static int divideThis (int n1, int n2) {
        int result;
        result = n1 / n2;
        return result;
    }

    public static int remainderOf (int n1, int n2) {
        int result;
        result = n1 % n2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("addThis(2,4) = " + addThis(2, 4));
        System.out.println("subtractThis(20,13) = " + subtractThis(20, 13));
        System.out.println("multiplyThis(3,4) = " + multiplyThis(3, 4));
        System.out.println("divideThis(12,3) = " + divideThis(12, 3));
        System.out.println("remainderOf(40,3) = " + remainderOf(40, 9));
    }
}
