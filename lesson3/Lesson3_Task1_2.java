package lesson3;

public class Lesson3_Task1_2 {
    /*       byte	short	char	int	 long	float	double	boolean
    byte    T       ня      я       ня     ня     ня      ня       x
    short   я       T       я       ня     ня     ня      ня       x
    char    я       я       T       ня     ня     ня      ня       x
    int     я       я       я       T      ня     ня      ня       x
    long    я       я       я       я      T      ня      ня       x
    float   я       я       я       я      я      T       ня       x
    double  я       я       я       я      я      я        T       x
    boolean x       x       x       x      x      x        x       T*/

    /* ня (неявное) – если преобразование происходит автоматически,

     я (явное) – если нужно использовать явное преобразование,

     х – если преобразование невозможно,

     т  - если преобразование тождественно.*/
    public static void main(String[] args) {

        System.out.println(intToByte(126));
        System.out.println(byteToInt((byte) 196));
        System.out.println(byteToShort((byte) 56));
        System.out.println(byteToLong((byte) 656));
        System.out.println(byteToChar((byte) 656));
        System.out.println(byteToFloat((byte) 656));
        System.out.println(byteToDouble((byte) 656));
        System.out.println(shortToByte((short) 656));
        System.out.println(shortToInt((short) 656));
        System.out.println(shortToLong((short) 656656));
        System.out.println(shortToChar((short) 656656));
        System.out.println(shortToFloat((short) 656656));
        System.out.println(shortToDouble((short) 6563));
        System.out.println(charToByte((char) 'R'));
        System.out.println(charToShort((char) 'O'));
        System.out.println(charToInt((char) 'C'));
        System.out.println(charToLong((char) 'K'));
        System.out.println(charToDouble((char) '?'));
        System.out.println(charToFloat((char) '!'));
        System.out.println(intToShort(656656));
        System.out.println(intToLong(656656));
        System.out.println(intToChar(656656));
        System.out.println(intToFloat(6564));
        System.out.println(intToDouble(656656));
        System.out.println(longToByte(6566561));
        System.out.println(longToShort(656656));
        System.out.println(longToInt(656656656));
        System.out.println(longToChar(656656));
        System.out.println(longToFloat(656656656));
        System.out.println(longToDouble(656656));
        System.out.println(floatToByte((float) 656.656));
        System.out.println(floatToShort((float) 656.656));
        System.out.println(floatToInt((float) 656.656));
        System.out.println(floatToLong((float) 656656.656));
        System.out.println(floatToChar((float) 656.656));
        System.out.println(floatToDouble((float) 656656656.656656656));
        System.out.println(doubleToByte(656656.656));
        System.out.println(doubleToShort(656.656));
        System.out.println(doubleToInt(656.656));
        System.out.println(doubleToLong(656656.656656));
        System.out.println(doubleToChar(656656.656656));
        System.out.println(doubleToFloat(656656.656656));
    }

    public static byte intToByte(int i1) {
        byte k = (byte) i1;
        return k;
    }

    public static int byteToInt(byte b1) {
        int i2 = b1;
        return i2;
    }

    public static short byteToShort(byte b2) {
        short s1 = b2;
        return s1;
    }

    public static long byteToLong(byte b3) {
        long l1 = b3;
        return l1;
    }

    public static char byteToChar(byte b4) {
        char c1 = (char) b4;
        return c1;
    }

    public static float byteToFloat(byte b5) {
        float f1 = b5;
        return f1;
    }

    public static double byteToDouble(byte b6) {
        double d1 = b6;
        return d1;
    }

    public static byte shortToByte(short s2) {
        byte b = (byte) s2;
        return b;
    }

    public static int shortToInt(short s) {
        int i = s;
        return i;
    }

    public static long shortToLong(short s) {
        long l = s;
        return l;
    }

    public static char shortToChar(short s) {
        char c = (char) s;
        return c;
    }

    public static float shortToFloat(short s) {
        float f = s;
        return f;
    }

    public static double shortToDouble(short s) {
        double d = s;
        return d;
    }

    public static byte charToByte(char c) {
        byte b = (byte) c;
        return b;
    }

    public static short charToShort(char c) {
        short s = (short) c;
        return s;
    }

    public static int charToInt(char c) {
        int i = c;
        return i;
    }

    public static long charToLong(char c) {
        long l = c;
        return l;
    }

    public static double charToDouble(char c) {
        double d = c;
        return d;
    }

    public static float charToFloat(char c) {
        float f = c;
        return f;
    }

    public static short intToShort(int i) {
        short s = (short) i;
        return s;
    }

    public static long intToLong(int i) {
        long l = i;
        return l;
    }

    public static char intToChar(int i) {
        char c = (char) i;
        return c;
    }

    public static float intToFloat(int i) {
        float f = i;
        return f;
    }

    public static double intToDouble(int i) {
        double d = i;
        return d;
    }

    public static byte longToByte(long l) {
        byte b = (byte) l;
        return b;
    }

    public static short longToShort(long l) {
        short s = (short) l;
        return s;
    }

    public static int longToInt(long l) {
        int i = (int) l;
        return i;
    }

    public static char longToChar(long l) {
        char c = (char) l;
        return c;
    }

    public static float longToFloat(long l) {
        float f = l;
        return f;
    }

    public static double longToDouble(long l) {
        double d = l;
        return d;
    }

    public static byte floatToByte(float f) {
        byte b = (byte) f;
        return b;
    }

    public static short floatToShort(float f) {
        short s = (short) f;
        return s;
    }

    public static int floatToInt(float f) {
        int i = (int) f;
        return i;
    }

    public static long floatToLong(float f) {
        long l = (long) f;
        return l;
    }

    public static char floatToChar(float f) {
        char c = (char) f;
        return c;
    }

    public static double floatToDouble(float f) {
        double d = f;
        return d;
    }

    public static byte doubleToByte(double d) {
        byte b = (byte) d;
        return b;
    }

    public static short doubleToShort(double d) {
        short s = (short) d;
        return s;
    }

    public static int doubleToInt(double d) {
        int i = (int) d;
        return i;
    }

    public static long doubleToLong(double d) {
        long l = (long) d;
        return l;
    }

    public static char doubleToChar(double d) {
        char c = (char) d;
        return c;
    }

    public static float doubleToFloat(double d) {
        float f = (float) d;
        return f;
    }
}

