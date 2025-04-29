package larrylist;

public class SortedLarryList extends LarryList {
    public enum Order { ASCENDING, DESCENDING }
    
    private Order order;
    private boolean removeAllOccurrences;
    
    public boolean equals(Object obj) {
        boolean result = super.equals(obj);
        if (result) {
            if (obj == this)
                result = true;
            else {
                result = obj instanceof SortedLarryList
                && ((SortedLarryList) obj).order.equals(order)
                && removeAllOccurrences == ((SortedLarryList) obj).removeAllOccurrences;
            }
        }
        return result;
    }
}
