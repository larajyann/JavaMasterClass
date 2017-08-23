/* Created by LaraMeow on 2017/8/1. */
public class Main {

  public static void main(String[] args) {

    int myValue = 10000;
    // Integer has limit from negative 2.147 billion to positive 2.147 billion.
    // Range: -2147483648 ~ 2147483647
    // Return error if out of the range.
    // Like this
//    int myOutOfRangeMinValue = -2147483649;
//    int myOutOfRangeMaxValue = 2147483648;
    int myMinValue = -2147483648;
    int myMaxValue = 2147483647;
    // "=" 右边的叫做'literal' if it is a fixed number.
    // if the right side is like 'a*b', it is not a literal, it's an expression.
    // Numbers: 12345678 and 12_345_678 are same thing. (后面那种more readable)

    byte myByteValue = 10;
    // 1/4 of int.
    // 'Byte' allocated by the computer a much smaller space, and consequently
    // can fit a much smaller number.
    // Range: -128 ~ 127.
    // - Why use a byte.
    //    - A byte is more efficient because it's in round-about terms it would
    //      normally take about 1/4 of the amount of space of an 'integer'.
    //    - So it will be more efficient to use a 'byte' if need to do a lot of calculations


    short myShort = 30000;
    // Range: -32768 ~ 32767.
    // 1/2 of int, twice of byte.



    // Int has a width of 32
    // Byte has a width of 8
    // Short has a width of 16
    // Long has a width of 64


    long myLongValue = 100L; // long 的话要加 'L' 在最后
    // Range:  2 to the power of 63
    long myMaxLongValue = 9_223_372_036_854_775_807L;


    int i1 = (myMaxValue / 2);
//    byte b1 = (myByteValue / 2);
//    is wrong, 因为默认type is int.
//    想要它不报错要 cast 他的 type, like below
    byte b1 = (byte) (myByteValue / 2);

    System.out.println(i1);
    System.out.println(b1);

  }
}
