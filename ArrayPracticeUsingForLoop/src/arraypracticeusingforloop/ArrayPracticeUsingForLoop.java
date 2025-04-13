package arraypracticeusingforloop;

public class ArrayPracticeUsingForLoop {

    public static void main(String[] args) {

        String[] names = {"Suprova", "Shemanto", "Simki", "Safwan", "Shawon"};
        int[] marks = {10, 20, 30, 40, 50};

        for (int i = 0; i < names.length; i++) {
            
            System.out.println("My name is " + names[i] + " & marks is " + marks[i] + ".");
            
        }
    }

}
