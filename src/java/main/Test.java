import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        p("abc".matches("..."));

        // \d代表数字，将每一个数字都替换为-
        p("a4343b".replaceAll("\\d", "-"));

        // [a-z]{3} 匹配3个字符的字符串，而字符串中的每一个字符都是a-z中的一个
        Pattern p = Pattern.compile("[a-z]{3}");
    }


    public static void p(Object o){
        System.out.println(o);
    }
}


