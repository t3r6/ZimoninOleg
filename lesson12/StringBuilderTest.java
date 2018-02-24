package lesson12;

public class StringBuilderTest {
    public static void main(String[] args) {
        int i1 = 3, i2 = 56;
        StringBuilder sb = new StringBuilder(1);
        sb.append(i1).append(" + ").append(i2).append(" = ").append(i1 + i2)
                .append("\n").append(i1).append(" - ").append(i2).append(" = ").append(i1 - i2)
                .append("\n").append(i1).append(" * ").append(i2).append(" = ").append(i1 * i2);
        System.out.println(sb);
        sb.deleteCharAt(7);
        sb.deleteCharAt(18);
        sb.insert(7, "равно");
        sb.insert(23, "равно");
        sb.replace(40, 41, "равно");
        System.out.println(sb);
    }
}
