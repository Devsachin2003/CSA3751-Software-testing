public class NumberOperations {
    public int findSquare(int number) {
        return number * number;
    }

    public int findCube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        NumberOperations numberOperations = new NumberOperations();
        int num = 5;
        System.out.println("Square of " + num + " is: " + numberOperations.findSquare(num));
        System.out.println("Cube of " + num + " is: " + numberOperations.findCube(num));
    }
}
