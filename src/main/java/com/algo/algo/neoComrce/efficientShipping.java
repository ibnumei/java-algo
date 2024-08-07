package com.algo.algo.neoComrce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class efficientShipping {
    public long getMaxUnits(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        int n = boxes.size();

        // Membuat array dua dimensi untuk menyimpan jumlah kotak dan unit per kotak
        List<long[]> boxInfo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boxInfo.add(new long[]{unitsPerBox.get(i), boxes.get(i)});
        }

        // Mengurutkan berdasarkan unit per kotak secara menurun
//        Collections.sort(boxInfo, new Comparator<long[]>() {
//            public int compare(long[] a, long[] b) {
//                return Long.compare(b[0], a[0]);
//            }
//        });
        boxInfo.sort((a, b) -> Long.compare(b[0], a[0]));

        long maxUnits = 0;
        long remainingTruckSize = truckSize;

        for (int i = 0; i < n && remainingTruckSize > 0; i++) {
            long units = boxInfo.get(i)[0];
            long numOfBoxes = boxInfo.get(i)[1];

            // Ambil sebanyak mungkin kotak hingga truk penuh
            if (remainingTruckSize >= numOfBoxes) {
                maxUnits += numOfBoxes * units;
                remainingTruckSize -= numOfBoxes;
            } else {
                maxUnits += remainingTruckSize * units;
                remainingTruckSize = 0; // Truk sudah penuh
            }
        }

        return maxUnits;
    }

    public long getMaxUnitsWithoutSort(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        long totalUnits = 0;
        long remainingTruckSize = truckSize;

        for (int i = 0; i < boxes.size(); i++) {
            long units = unitsPerBox.get(i);
            long numOfBoxes = boxes.get(i);

            if (remainingTruckSize >= numOfBoxes) {
                totalUnits += numOfBoxes * units;
                remainingTruckSize -= numOfBoxes;
            } else {
                totalUnits += remainingTruckSize * units;
                remainingTruckSize = 0; // Truk sudah penuh
            }
        }

        return totalUnits;
    }

    public long getMaxUnitsStreams(List<Long> boxes, List<Long> unitsPerBox, long truckSize) {
        List<BoxInfo> boxInfo = IntStream.range(0, boxes.size())
                .mapToObj(i -> new BoxInfo(unitsPerBox.get(i), boxes.get(i)))
                .sorted((a, b) -> Long.compare(b.unitsPerBox, a.unitsPerBox))
                .collect(Collectors.toList());

        long totalUnits = 0;
        long remainingTruckSize = truckSize;

        for (BoxInfo info : boxInfo) {
            long unitsPerBoxTemp = info.unitsPerBox;
            long numOfBoxes = info.numOfBoxes;

            if (remainingTruckSize >= numOfBoxes) {
                totalUnits += numOfBoxes * unitsPerBoxTemp;
                remainingTruckSize -= numOfBoxes;
            } else {
                totalUnits += remainingTruckSize * unitsPerBoxTemp;
                remainingTruckSize = 0; // Truk sudah penuh
            }
        }

        return totalUnits;
    }
}

class BoxInfo {
    long unitsPerBox;
    long numOfBoxes;

    public BoxInfo(long unitsPerBox, long numOfBoxes) {
        this.unitsPerBox = unitsPerBox;
        this.numOfBoxes = numOfBoxes;
    }
}

