package second.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T13 {
    ArrayList<Integer> allNumbers = new ArrayList<Integer>();
    ArrayList<Integer> sixNumbers = new ArrayList<Integer>();

    public T13() {
        for (int i = 0; i < 49; i++) {
            allNumbers.add(i, i+1);
        }
    }

    private int randomNumber(int arrSize) {
        return (int) (Math.random() * (arrSize - 1));
    }

    private void printLotteryCombination(ArrayList<Integer> arr) {
        for (Integer item : arr) {
            System.out.print(item + " ");
        }
    }

    public void sortedLotteryCombination() {
        for (int i = 0; i < 6; i++) {
            int j = randomNumber(allNumbers.size());
            sixNumbers.add(i, allNumbers.get(j));
            allNumbers.remove(j);
        }
        Collections.sort(sixNumbers);
        printLotteryCombination(sixNumbers);
    }
}
