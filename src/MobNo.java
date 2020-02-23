//mobile no matching program using pattern matching and search mobile no which is present in the array list

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NumberNotFound extends Exception {
    NumberNotFound(String s) {
        super(s);
    }
}

public class MobNo {
    public static void main(String[] args) throws NumberNotFound {
        System.out.println("Enter the mobile number");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[6789][0-9]{9}");
        Matcher m = p.matcher(str);
        TreeSet<String> T = new TreeSet<String>();
        while (m.find()) {
            T.add(m.group());
        }
        String str2 = sc.nextLine();
        boolean res = T.contains(str2);
        try {
            if (res == true) {
                System.out.println("No. found.");
            } else {
                throw new NumberNotFound("Enter valid number.");
            }
        } catch (NumberNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}