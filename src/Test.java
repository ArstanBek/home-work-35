import java.util.ArrayList;

public class Test {
    private ArrayList<Integer> numbs;

    public Test(ArrayList<Integer> numbs) {
        this.numbs = numbs;
    }

    public void addNumbs(int[] numbs) {
        for (int i:numbs) {
            this.numbs.add(i);
        }
    }

    public void showAllNumbs() {
        for (Integer i:this.numbs) {
            System.out.println(i);
        }
    }

    public void removeByIndex(int index) {
        this.numbs.remove(index);
    }

    public void setByIndex(int index, int numb) {
        this.numbs.set(index,  numb);
    }

    public boolean checkNumbContain(int numb) {
        return this.numbs.contains(numb);
    }

    public ArrayList<Integer> setNumbs() {
        return numbs;
    }

    public void setNumbs(ArrayList<Integer> numbs) {
        this.numbs = numbs;
    }
}
