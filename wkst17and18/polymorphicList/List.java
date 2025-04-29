package polymorphicList;

public interface List {

    public NonEmptyList insert(int value);
    public boolean find(int value);
    public List delete(int element);
    public List deleteAll(int element);
    

  }
