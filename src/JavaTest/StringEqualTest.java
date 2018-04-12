package JavaTest;

public class StringEqualTest {

    public static void main(String[] args) {
        /*String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());*/


        String s3 = "s";
        String s4 = "s";
        System.out.println(s3==s4);
        Integer i = 2017;
        Integer j = 2017;
        System.out.println(i==j);
        String s1 = new String("s");
        String s2 = new String("s");
        System.out.println(s1.intern()==s2.intern());
    }

}
