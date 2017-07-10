package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mj2like on 02.07.2017.
 */
public class TestFor {


    private int int1;

    public int int1 (){
        return this.int1 + 1;
    }
    public void g (){
        this.int1 += 1;
        System.out.println(int1);
    }
    public static void main(String[] args) {
        String[] arr = {"Gleb", "Kosty", "Max", "Serge","ssss"};

       /* for (int i = 0; i <= 3; i++) {
            System.out.print(arr[i] + " ");
        }*/
            TestFor testFor = new TestFor();
            System.out.println(testFor.int1());
        testFor.g();
    }
}
