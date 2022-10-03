package ss19_string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ten_lop {
        private static Pattern pattern;
        private Matcher matcher;
    private static final String CLASSNAME_REGEX="^[ACP]+[0-9]+[0-9]+[0-9]+[0-9]+[GHIKLM]$";
    public Ten_lop() {
        pattern=Pattern.compile(CLASSNAME_REGEX);
    }
    public boolean vaildate(String regex) {
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
    private static final String[] classname={"C0318G","M0318G", "P0323A","C09*0G","A0987M"};

    public static void main(String[] args) {
        Ten_lop ten_lop=new Ten_lop();
        for (String i:classname) {
            boolean is=ten_lop.vaildate(i);
            System.out.println("Class name is "+i+" is vali "+is);
        }
    }
}
