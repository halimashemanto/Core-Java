package staticmethodlistandcollection;

import java.util.*;

public class StaticMethodListAndCollection {

    public static void main(String[] args) {

        List<String> ls = Arrays.asList("Orange", "Violet", "Purple", "Indigo");
        List<String> lss = Arrays.asList("Orange", "Violet", "Purple", "Indigo");

                                                                                                                                                                                                                                                                                                                                                                                                       Collections.shuffle(ls);
        Collections.shuffle(lss);

        // Collections.sort(ls);
        System.out.println(ls);
        System.out.println(lss);

    }

}
