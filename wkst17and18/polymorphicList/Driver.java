package polymorphicList;

public class Driver {
    public static void main(String[] args) {
        List list= new EmptyList();
        int i, arr[]= new int[]{60, 30, 10, 20, 50, 40, 60, 60, 60, 40, 39};

        for (i= 0; i < arr.length; i++)
          list= list.insert(arr[i]); //remember insert returns a new list!
        
        list = list.delete(20);
        System.out.println("deleted a 20: " + list.find(20)); // should print false now
        
        list = list.delete(60);
        System.out.println("deleted only one 60: " + list.find(60)); // output: true (there are multiple 60's)
        
        list = list.deleteAll(60);
        System.out.println("deleted all 60s: " + list.find(60)); // output: false
        
    }
        
}
