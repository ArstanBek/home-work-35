import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbs = new ArrayList<>();
        numbs.add(1);
        numbs.add(2);
        Test test = new Test(numbs);

        System.out.println("Before:");
        test.addNumbs(new int[]{3, 4, 5, 6, 7});

        test.showAllNumbs();

        test.removeByIndex(2);

        test.setByIndex(0, 10);

        test.checkNumbContain(7);
        System.out.println("\nAfter:");
        test.showAllNumbs();
    }
}