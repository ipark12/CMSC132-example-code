package trees;

public class Tree {
    
    private class Node {
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data= data;
            left= right= null;
        }
    }
    
    private Node root = null;
    
    public boolean insert(int value) {
        Node travel= root, prev= null;
        boolean result= true;

        while (travel != null && travel.data != value) {
            prev= travel;
            if (value < travel.data)
                travel= travel.left;
            else travel= travel.right;
        }

        if (travel != null)
            result= false;  // already present
        else
            if (root == null)  // case where the tree is empty
                root= new Node(value);
            else
                // determine whether value should be the left or right child
                // of its parent (which prev refers to)
                if (value < prev.data)
                    prev.left= new Node(value);
                else prev.right= new Node(value);

        return result;
    }

    private String toString(Node travel) {
        String result= "", leftStr, rightStr;

        if (travel != null) {
            leftStr= toString(travel.left);
            rightStr= toString(travel.right);
            result= leftStr + (leftStr.equals("") ? "" : " ") + travel.data +
                (rightStr.equals("") ? "" : " ") + rightStr;
        }

        return result;
    }

    public String toString() {
        return toString(root);
    }
    
    //worksheet 18
    public boolean lookup(int value) {
        Node curr = root;
        boolean b = false;
        
        while (curr != null && curr.data != value) {
            if (curr.data < value)
                curr = curr.right;
            else
                curr = curr.left;
        }
        return curr != null; // if curr was found, will return value otherwise null
    }
    
    public boolean lookupRec(int value) {
        return lookupHelper(value, root);
    }
    private boolean lookupHelper(int value, Node curr) {
        if (curr == null)
            return false;
        if (curr.data == value)
            return true;
        else if (curr.data < value)
            return lookupHelper(value, curr.right);
        else
            return lookupHelper(value, curr.left);
    }
    
    public int height() {
        return heightHelper(root);
    }
    private int heightHelper(Node curr) {
        if (curr == null)
            return 0;
        else {
            int lHeight = heightHelper(curr.left);
            int rHeight = heightHelper(curr.right);
            return 1 + Math.max(lHeight, rHeight); //you can use ternary here as well, i personally used Math.max
        }
    }
    
    //worksheet 19
    public int numOnlyChildren() {
        int ans = 0;
        ans = helper(root);
        return ans;
    }
    private int helper(Node root) {
        int ans = 0;
        if (root == null)
            return 0;
        else {
            if ((root.left != null && root.right == null) || (root.left == null && root.right != null)) 
                ans = 1 + helper(root.left) + helper(root.right);
            else 
                ans = helper(root.left) + helper(root.right);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
        //creating a tree to test the method on
        Tree iAmTree = new Tree();
        
        //try inserting different values that'd change the output!
        iAmTree.insert(40);
        iAmTree.insert(60);
        iAmTree.insert(50);
        iAmTree.insert(20);
        iAmTree.insert(30);
        iAmTree.insert(10);
        iAmTree.insert(70);
        iAmTree.insert(80);
        
        System.out.println(iAmTree.numOnlyChildren());
        System.out.println(iAmTree.height());
        System.out.println(iAmTree.lookupRec(80));
        System.out.println(iAmTree.lookupRec(10000));
      }
    
}
