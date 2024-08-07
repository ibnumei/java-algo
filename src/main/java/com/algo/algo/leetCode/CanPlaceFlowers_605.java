package com.algo.algo.leetCode;

public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Tanam bunga di tempat tidur kosong ini
                count++; // Tambahkan jumlah bunga yang berhasil ditanam
            }
            i++;
        }

        return count >= n;
    }
}