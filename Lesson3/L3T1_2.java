package Lesson3;

public class L3T1_2 {
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

        System.out.println(IntToByte(126));
        System.out.println(ByteToInt((byte) 196));
        System.out.println(ByteToShort((byte) 56));
        System.out.println(ByteToLong((byte) 656));
        System.out.println(ByteToChar((byte) 656));
        System.out.println(ByteToFloat((byte) 656));
        System.out.println(ByteToDouble((byte) 656));
        System.out.println(ShortToByte((short) 656));
        System.out.println(ShortToInt((short) 656));
        System.out.println(ShortToLong((short) 656656));
        System.out.println(ShortToChar((short) 656656));
        System.out.println(ShortToFloat((short) 656656));
        System.out.println(ShortToDouble((short) 6563));
        System.out.println(CharToByte((char) 'R'));
        System.out.println(CharToShort((char) 'O'));
        System.out.println(CharToInt((char) 'C'));
        System.out.println(CharToLong((char) 'K'));
        System.out.println(CharToDouble((char) '?'));
        System.out.println(CharToFloat((char) '!'));
        System.out.println(IntToShort(656656));
        System.out.println(IntToLong(656656));
        System.out.println(IntToChar(656656));
        System.out.println(IntToFloat(6564));
        System.out.println(IntToDouble(656656));
        System.out.println(LongToByte(6566561));
        System.out.println(LongToShort(656656));
        System.out.println(LongToInt(656656656));
        System.out.println(LongToChar(656656));
        System.out.println(LongToFloat(656656656));
        System.out.println(LongToDouble(656656));
        System.out.println(FloatToByte((float) 656.656));
        System.out.println(FloatToShort((float) 656.656));
        System.out.println(FloatToInt((float) 656.656));
        System.out.println(FloatToLong((float) 656656.656));
        System.out.println(FloatToChar((float) 656.656));
        System.out.println(FloatToDouble((float) 656656656.656656656));
        System.out.println(DoubleToByte(656656.656));
        System.out.println(DoubleToShort(656.656));
        System.out.println(DoubleToInt(656.656));
        System.out.println(DoubleToLong(656656.656656));
        System.out.println(DoubleToChar(656656.656656));
        System.out.println(DoubleToFloat(656656.656656));
    }

    public static byte IntToByte(int i1) {
        byte k = (byte) i1;
        return k;
    }

    public static int ByteToInt(byte b1) {
        int i2 = b1;
        return i2;
    }

    public static short ByteToShort(byte b2) {
        short s1 = b2;
        return s1;
    }

    public static long ByteToLong(byte b3) {
        long l1 = b3;
        return l1;
    }

    public static char ByteToChar(byte b4) {
        char c1 = (char) b4;
        return c1;
    }

    public static float ByteToFloat(byte b5) {
        float f1 = b5;
        return f1;
    }

    public static double ByteToDouble(byte b6) {
        double d1 = b6;
        return d1;
    }

    public static byte ShortToByte(short s2) {
        byte b = (byte) s2;
        return b;
    }

    public static int ShortToInt(short s) {
        int i = s;
        return i;
    }

    public static long ShortToLong(short s) {
        long l = s;
        return l;
    }

    public static char ShortToChar(short s) {
        char c = (char) s;
        return c;
    }

    public static float ShortToFloat(short s) {
        float f = s;
        return f;
    }

    public static double ShortToDouble(short s) {
        double d = s;
        return d;
    }

    public static byte CharToByte(char c) {
        byte b = (byte) c;
        return b;
    }

    public static short CharToShort(char c) {
        short s = (short) c;
        return s;
    }

    public static int CharToInt(char c) {
        int i = c;
        return i;
    }

    public static long CharToLong(char c) {
        long l = c;
        return l;
    }

    public static double CharToDouble(char c) {
        double d = c;
        return d;
    }

    public static float CharToFloat(char c) {
        float f = c;
        return f;
    }

    public static short IntToShort(int i) {
        short s = (short) i;
        return s;
    }

    public static long IntToLong(int i) {
        long l = i;
        return l;
    }

    public static char IntToChar(int i) {
        char c = (char) i;
        return c;
    }

    public static float IntToFloat(int i) {
        float f = i;
        return f;
    }

    public static double IntToDouble(int i) {
        double d = i;
        return d;
    }

    public static byte LongToByte(long l) {
        byte b = (byte) l;
        return b;
    }

    public static short LongToShort(long l) {
        short s = (short) l;
        return s;
    }

    public static int LongToInt(long l) {
        int i = (int) l;
        return i;
    }

    public static char LongToChar(long l) {
        char c = (char) l;
        return c;
    }

    public static float LongToFloat(long l) {
        float f = l;
        return f;
    }

    public static double LongToDouble(long l) {
        double d = l;
        return d;
    }

    public static byte FloatToByte(float f) {
        byte b = (byte) f;
        return b;
    }

    public static short FloatToShort(float f) {
        short s = (short) f;
        return s;
    }

    public static int FloatToInt(float f) {
        int i = (int) f;
        return i;
    }

    public static long FloatToLong(float f) {
        long l = (long) f;
        return l;
    }

    public static char FloatToChar(float f) {
        char c = (char) f;
        return c;
    }

    public static double FloatToDouble(float f) {
        double d = f;
        return d;
    }

    public static byte DoubleToByte(double d) {
        byte b = (byte) d;
        return b;
    }

    public static short DoubleToShort(double d) {
        short s = (short) d;
        return s;
    }

    public static int DoubleToInt(double d) {
        int i = (int) d;
        return i;
    }

    public static long DoubleToLong(double d) {
        long l = (long) d;
        return l;
    }

    public static char DoubleToChar(double d) {
        char c = (char) d;
        return c;
    }

    public static float DoubleToFloat(double d) {
        float f = (float) d;
        return f;
    }
}

