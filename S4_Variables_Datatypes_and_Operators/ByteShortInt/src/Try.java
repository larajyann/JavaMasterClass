/* Created by LaraMeow on 2017/8/1. */
public class Try {

  public static void main(String[] args) {

    // 1. Create a byte variable and set it to any valid byte number.
    byte b1 = 11;

    // 2. Create a short variable and set it to any valid short number.
    short s1 = 55;

    // 3. Create a int variable and set it to any valid int number.
    int i1 = 665;

    // 4. Create a variable of type long, and make it equal to
    // 50000 + 10 times the sum of the byte, plus the short plus the int.
    long l1 = (long) (50000 + (10 * (b1 + s1 + i1)));
    System.out.println(l1);
    System.out.println(b1 + s1 + i1);


    // 第四题的更正！！！！！！！！！
    // 不需要在前面写(long) -- no need to cast.
    // 也只有 long 不需要写
    long l2 = 50000L + 10L * (b1 + s1 + i1);
    }

}
