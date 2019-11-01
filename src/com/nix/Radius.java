package com.nix;

public class Radius {
    /*В одномерном массиве с четным количеством элементов (2N) находятся координаты N точек
плоскости. Они располагаются в следующем порядке: x1, y1, х2, y2, x3, y3, и т.д. Определить минимальный
радиус круга с центром в начале координат, который содержит все точки.*/

    public double radius(int[] mas) {
        double radius = 0, distance = 0;
        for (int i = 0; i < mas.length; ) {
            distance = Math.pow((Math.pow(mas[i++], 2) + Math.pow(mas[i++], 2)), 1./2);
            radius = Math.max(radius, distance);
        }
        return radius;
    }
}
