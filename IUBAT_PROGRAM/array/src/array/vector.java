package array;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        
        System.out.println("vector");
        
        for(Integer x : vector)
        {
            System.out.print(x +" ");
        }
        
        System.out.println();
        
        int size = vector.size();
        System.out.println("Size: " + size);
        
        int capacity = vector.capacity();
        System.out.println("Size: " + capacity);
        
        vector.add(4);
        
                for(Integer x : vector)
        {
            System.out.print(x +" ");
        }
                        System.out.println();

        vector.remove (2);
        
                for(Integer x : vector)
        {
            System.out.print(x +" ");
        }
    }
}
