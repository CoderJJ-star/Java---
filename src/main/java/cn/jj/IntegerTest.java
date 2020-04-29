package cn.jj;

/**
 * Created by 崔将军
 */
public class IntegerTest {
    public static void main(String[] args) {

        //手动装箱和拆箱
        Integer a = new Integer(10); //装箱
        a = Integer.valueOf(10);//装箱

        int b = a.intValue(); //拆箱


        //自动装箱和拆箱
        Integer c = 20;//装箱
        int d = c;//拆箱


        //装箱缓存
        Integer e = 30;
        Integer f = 30;
        Integer m = 200;
        Integer n = 200;
        System.out.println(e == f);
        System.out.println(m == n);

    }
}
