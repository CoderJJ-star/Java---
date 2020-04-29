package cn.jj;

/**
 * Created by 崔将军
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "Hello" + "World";
               a = "Java";

        String b = "Girls";
        String str = a + b;
        System.out.println(str);


        StringBuffer sb = new StringBuffer(20);
        sb.append("wolf").append("code");
        System.out.println(sb);

    }
}
