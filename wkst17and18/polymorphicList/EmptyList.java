package polymorphicList;

public class EmptyList implements List {
    
    public NonEmptyList insert(int value) {
        return new NonEmptyList(value, this);
    }
    
    public boolean find(int value) {
        return false;
     }
    
    public List delete(int element) {
        return this;
    }
    
    public List deleteAll(int element) {
        return this;
    }
    
}
