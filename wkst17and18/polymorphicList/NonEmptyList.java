package polymorphicList;

public class NonEmptyList implements List {

    private int data;
    private List next;

    public NonEmptyList(int value, List next) {
        data = value;
        this.next = next;
    }

    public NonEmptyList insert(int value) {
        next = next.insert(value);

        return this;
    }
    
    public boolean find(int value) {
        if (data == value)
          return true;
        else return next.find(value);
      }
    
    //deletes FIRST occurrence of parameter value
    public List delete(int element) {
        if (data == element)
            return next;
        else {
            next = next.delete(element);
            return this;
        }
    }
    
    //deletes ALL occurrences of parameter value
    public List deleteAll(int element) {
        if (data == element) {
            next = next.deleteAll(element);
            return next;
        } else {
            next = next.deleteAll(element);
            return this;
        }
    }
}
