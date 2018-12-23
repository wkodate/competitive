package com.wkodate.procon.aoj.alds1.quick_sort;

import java.util.Scanner;

public class Main {

    public static class Card {
        String design;
        int number;
        int index;

        Card(String design, int number, int index) {
            this.design = design;
            this.number = number;
            this.index = index;
        }
    }

    public static Card[] quickSort(Card[] c, int p, int r) {
        if (p >= r) {
            return c;
        }
        int q = partition(c, p, r);
        quickSort(c, p, q - 1);
        quickSort(c, q + 1, r);
        return c;
    }

    private static int partition(Card[] c, int p, int r) {
        int x = c[r].number;
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (c[j].number <= x) {
                i += 1;
                // a[i]とa[j]を交換
                Card tmp = c[i];
                c[i] = c[j];
                c[j] = tmp;
            }
        }
        // 最後にa[i+1]とa[r]を交換
        Card tmp = c[i + 1];
        c[i + 1] = c[r];
        c[r] = tmp;
        return i + 1;
    }


    public static boolean isStable(Card[] card) {
        for (int i = 0; i < card.length - 1; i++) {
            if (card[i].number == card[i + 1].number
                    && card[i].index > card[i + 1].index) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Card[] card = new Card[n];
        for (int i = 0; i < n; i++) {
            String design = sc.next();
            int number = sc.nextInt();
            card[i] = new Card(design, number, i);
        }

        Card[] output = quickSort(card, 0, n - 1);

        if (isStable(output)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(output[i].design + " " + output[i].number);
        }

    }

}
