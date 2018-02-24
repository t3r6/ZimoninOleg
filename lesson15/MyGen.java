package lesson15;

import lesson10.clothes.Clothe;
import lesson10.clothes.SizeClothes;
import lesson10.clothes.Tie;

import java.io.Serializable;

public class MyGen<T extends Comparable, V extends Clothe & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public MyGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    public void showYypes() {
        System.out.println("ob1" + getOb1().getClass().getName());
        System.out.println("ob1" + getOb2().getClass().getName());
        System.out.println("ob1" + getOb3().getClass().getName());
    }

    public static void main(String[] args) {
        MyGen<String, Tie, Double> object1 = new MyGen<>("MyGen", new Tie(SizeClothes.XS, 56, "56"), 23.3);
        object1.showYypes();
    }
}
