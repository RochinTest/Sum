package com.example.Sum;
//Напишите параметризированный класс с двумя параметрами, ограниченными
// классом Number и разработайте метод вычисления суммы двух чисел, любых
// типов, метод сравнивающий поэлементно два массива разных типов,
// метод определяющий наибольший и наименьший элементы в массивах.

import java.math.BigDecimal;

public class Sum<T, V extends Number> {
    private T x;
    private V y;
    private T[] massT;
    private V[] massV;

    public Sum(T[] mT, V[] mV) {

        this.massT =  mT;
        this.massV =  mV;
    }

    public Sum(Object n, Object m) {
        this.x = (T) n;
        this.y = (V) m;

    }
    public static <T, V extends Number> boolean arraysEqual(T[] mT, V[] mV) {
        if (mT.length != mV.length) {
            return false;
        }
        for (int i = 0; i < mT.length; i++) {
            if (!mT[i].equals(mV[i])) {
                return false; // Массивы различаются
            }
        }
        return true; // Содержимое массивов совпадает
    }

    public static void main(String[] args) {
        Sum<Float, Double> intSum = new Sum(534, 8546485);
        Sum<Double, Integer> summ = new Sum(6.8, 7.4);

        System.out.println(summ.sum());
        System.out.println(intSum.sum());

        Integer nums[] = {1, 2, 3, 4, 5};
        Double nums2[] = {1d, 256756756756756756d, 356756756756756756d, 4567567567567567567d, 556565656756756756756756756d};
        Long nums3[] = {1445456456454564564l, 2546456456456456454l, 356756756756564545l, 456777777567567567l, 545645456456456456l};
      Float nums4[] = {15667745675675675675675675675675675675f, 2234234234234234234234234234234234234f, 3f, 4f, 5f, };
// Параметры типов T и V неявно определяются
// при вызове метода

        if (arraysEqual(nums, nums2)) {
            System.out.println("nums equals nums2");
        }else {System.out.println("nums not equals nums2");}
        if (arraysEqual(nums, nums3)) {
            System.out.println("nums equals nums3");
        }else { System.out.println("nums not equals nums3");
        }
        if (arraysEqual(nums, nums4)) {
            System.out.println("nums equals nums4");
        }else { System.out.println("nums not equals nums4");

        }
// Создание массива типа Double
        Double dvals[] = {1575.1, 256756.2, 356756.3, 45675.4, 55675.5};
// Следующая строка не будет скомпилирована, поскольку
// типы nums и dvals нe совпадают
   if(arraysEqual(nums, dvals)){
   System.out.println("nums equals dvals");
    }}






    private T sum() {
        if (x instanceof Integer && y instanceof Integer) {
            return (T) Integer.valueOf(Math.addExact((Integer) x, (Integer) y));
        }
        if (x instanceof Double && y instanceof Double) {
            return (T) Double.valueOf(((Double) x + (Double) y));
        }
        throw new RuntimeException(" Неправильный тип ");


    }
}
