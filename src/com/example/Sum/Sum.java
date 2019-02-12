package com.example.Sum;
//Напишите параметризированный класс с двумя параметрами, ограниченными
// классом Number и разработайте метод вычисления суммы двух чисел, любых
// типов, метод сравнивающий поэлементно два массива разных типов,
// метод определяющий наибольший и наименьший элементы в массивах.

import java.math.BigDecimal;

public class Sum<T, V extends Number> {
    private T x;
    private V y;


    public Sum(Object n, Object m) {
        this.x = (T) n;
        this.y = (V) m;

    }

    public static void main(String[] args) {
        Sum<Float, Double> intSum = new Sum(534, 8546485);
        Sum<Double, Integer> summ = new Sum(6.8, 7.4);

        System.out.println(summ.sum());
        System.out.println(intSum.sum());

    }


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
