package larrylist;

public class LarryList {
    private Integer arr[] = null;
    private int size =0;
    
    void init(int capacity) {
        arr= new Integer[capacity];
        size = 0;
    }
    
    public boolean equals(Object obj) {
        boolean result = true;
        
        if (obj == this) {
            result = true;
        } else if (!(obj instanceof LarryList)){
            result = false;
        } else {
            LarryList list = (LarryList) obj; 
            if (arr != null && list.arr != null && size == list.size && arr.length == list.arr.length) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != list.arr[i])
                        result = false;
                }
            } else {
                result = false;
            }
        }
        return result;
    }
}
