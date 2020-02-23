//mobile no check using pattern matching program and customize sorting of mobile no

/*import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;4
import java.util.Scanner;*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobNo2 {
    public static void main(String[] args) {
        System.out.println("enter the mobile number");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[678][0-9]{9}");
        Matcher m = p.matcher(str);
        ArrayList<String> a = new ArrayList<>();
        while (m.find()) {
            a.add(m.group());
        }
        Collections.sort(a, new MySort());
        System.out.println(a);
    }
}

class MySort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}