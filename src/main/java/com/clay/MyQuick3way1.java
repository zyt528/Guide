package com.clay;

/**
 * MyQuick3way1
 */
public class MyQuick3way1 {

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo + 10) {
            Insertion.sort(a);
        }
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) {
                exch(a, lt++, i++);
            }
            else if (cmp > 0) {
                exch(a, i, gt--);
            }
            else {
                i++;
            }
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable v = a[i];
        a[i] = a[j];
        a[j] = v;
    }
}
