public class Multiples {
    public static void main(String[] args) {
        int totalFive = 0;
        int totalThree = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 5 == 0){
                totalFive++;
            }
            if (i % 3 == 0){
                totalThree++;
            }
        }
        System.out.println("There are " + totalFive + " fives " + totalThree + " threes.");
    }
}
