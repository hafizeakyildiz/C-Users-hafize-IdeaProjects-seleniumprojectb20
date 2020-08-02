package day37_ArrayList;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str = "AABBCDDEFGTKKKLLIOYYTBHAFIZE";
        String uniques ="";

        ArrayList<String> list = new ArrayList<>();

        for (String each :str.split("")){
            list.add(each);
        }

        System.out.println(list);

        for (String each :list){
           int count = Collections.frequency(list,each);
            if (count ==1){
               uniques += each ;
            }

        }

        System.out.println(uniques);






    }
}
