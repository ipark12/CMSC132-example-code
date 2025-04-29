package question1;

import java.util.*;

public class Worksheet3 {
	//INCORRECT EXAMPlE: remember ArrayList parameters are pass by value!
    public static void removeAllIncorrect(ArrayList<Integer> list, int toRemove) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++)
            if (list.get(i) != toRemove)
                newList.add(list.get(i));
        list = newList;
    }
    
    //one solution
    public static void removeAll(ArrayList<Integer> list, int toRemove) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == toRemove) {
                count++;
            } else {
                list.set(i - count, list.get(i));
            }
        }
        //haha I gave up on using only one loop that passed all my edge cases
        for (int i = list.size() - count; i < list.size(); i++) {    
            list.set(i, 0);
        }
    }
    
    //another example, it's pretty similar to the above one but may be easier to understand
    public static void removeAll2(ArrayList<Integer> list, int toRemove) {
        int curr = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num != toRemove) {
                list.set(curr, num);
                curr++;
            }

        }
        while (curr < list.size()) {
            list.set(curr, 0);
            curr++;
        }
    }
}
