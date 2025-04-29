package codeExamples;

public class Worksheet1 {
	
	//Question 2
	public static int findPos(int[] arr, int eltToFind) {
        int pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == eltToFind)
                pos = i;
        }

        return pos;
    }
	
	//Question 3
    public static void remove(int[] arr, int toRemove) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (found) {
                arr[i - 1] = arr[i];

            } else if (arr[i] == toRemove) {
                found = true;
            }
        }
        if (found) {
            arr[arr.length - 1] = 0;
        }
    }
    
    //Question 4
    public static void insertAtFront(int[] arr, int toAdd) {
        if (arr.length > 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = toAdd;
        }
    }
    
    public static void main(String[] args) {
    	int arr1[] = {1, 2, 3, 2, 1};
    	
    	System.out.println(findPos(arr1, 1));
    	System.out.println(findPos(arr1, 3));

      

    }
}
