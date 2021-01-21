package ReverseString;

import java.util.Arrays;
import java.util.Collections;

public class ReverseS {
    String[] s = {"The", "greatest", "victory", "is", "that", "which", "requires", "no", "battle"};

    void reverse1() {
        Collections.reverse(Arrays.asList(s));
        System.out.println(Arrays.toString(s));
    }


}