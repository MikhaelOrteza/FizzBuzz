public class Reduce {
    public static void main(String[] args) {
        int number = 100;
        int steps = 0;
        while (number != 0) {
            if (number % 2 == 0){
                number = number / 2;
            } else {
                number = (number - 1) / 2;
            }
            steps++;
        }
        System.out.println("There are " + steps + " steps.");
    }
}
