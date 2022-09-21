package ss9_List.thuc_hanh;

import java.sql.Array;
import java.util.Arrays;

public class List {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object element[];
    public List() {
        element=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    
}
