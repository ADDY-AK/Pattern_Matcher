//split string program using pattern matching and exception handling and add in tree set
// in tree set entry is done in ascending ordrer autimatically

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ToLongStringException extends Exception {
    ToLongStringException(String s) {
        super(s);
    }
}

public class SplitString {
    public static void main(String[] args) {
        System.out.println("kuch likho");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        TreeSet<String> a = new TreeSet<>();
        Pattern p = Pattern.compile(" ");
        Matcher m = p.matcher(str);
        String[] s1 = p.split(str);
        System.out.println(s1.length);
        for (String res : s1) {
            try {
                if (res.length() > 10) {
                    throw new ToLongStringException("eee bhau ....string chota kar na");
                } else {
                    a.add(res);
                    //System.out.println(res);
                }
            } catch (ToLongStringException e) {
                System.out.println(e.getMessage());
                //System.out.println(e.printStackTrace());
            }
        }
        System.out.println(a);

    }

}
