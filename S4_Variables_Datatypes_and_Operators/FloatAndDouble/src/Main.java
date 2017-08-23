/* Created by LaraMeow on 2017/8/1. */

public class Main {

  public static void main(String[] args) {
    // width of int = 32 (4 bytes)
    // width of float = 32 (4 bytes)
    // width of double = 64 (8 bytes) Actually faster on modern computers
    int myIntValue = 5;
    float myFloatValue = 5f;
    double myDoubleValue = 5d;
    System.out.println("MyIntValue = " + myIntValue); // 5
    System.out.println("MyFloatValue = " + myFloatValue); // 5.0
    System.out.println("MyDoubleValue = " + myDoubleValue); // 5.0

// Wrong case below. Because default type is double.
    //    float f1 = 5.4;
    float f1 = (float) 5.4;
    double d1 = 5.4433;

    int i2 = 5 / 2;
    float f2 = 5f / 2f;
    double d2 = 5d / 2d;
    System.out.println("MyIntValue = " + i2); // 2
    System.out.println("MyFloatValue = " + f2); // 2.5
    System.out.println("MyDoubleValue = " + d2); // 2.5

    int i3 = 5 / 3;
    float f3 = 5f / 3f;
    double d3 = 5d / 3d;
    System.out.println("MyIntValue = " + i3); // 1
    System.out.println("MyFloatValue = " + f3); // 1.6666666
    System.out.println("MyDoubleValue = " + d3); // 1.666666666666667

    // Double and Float can also use '_' to make it easier to read.
  }

}
