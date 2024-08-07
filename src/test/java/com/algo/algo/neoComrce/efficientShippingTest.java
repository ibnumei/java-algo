package com.algo.algo.neoComrce;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class efficientShippingTest {

    @Test
    void getMaxUnits1() {
        List<Long> boxes = List.of(1L, 2L, 3L);
        List<Long> unitsPerBox = List.of(3L, 2L, 1L);
        long truckSize = 3;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnits(boxes, unitsPerBox, truckSize), 7);
    }
    @Test
    void getMaxUnits2() {
        List<Long> boxes = List.of(1L);
        List<Long> unitsPerBox = List.of(2L);
        long truckSize = 1;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnits(boxes, unitsPerBox, truckSize), 2);
    }
    @Test
    void getMaxUnits3() {
        List<Long> boxes = List.of(1L, 1L);
        List<Long> unitsPerBox = List.of(9L, 6L);
        long truckSize = 1;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnits(boxes, unitsPerBox, truckSize), 9);
    }

    @Test
    void getMaxUnitsWithoutSort1() {
        List<Long> boxes = List.of(1L, 2L, 3L);
        List<Long> unitsPerBox = List.of(3L, 2L, 1L);
        long truckSize = 3;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnitsWithoutSort(boxes, unitsPerBox, truckSize), 7);
    }
    @Test
    void getMaxUnitsWithoutSort2() {
        List<Long> boxes = List.of(1L);
        List<Long> unitsPerBox = List.of(2L);
        long truckSize = 1;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnits(boxes, unitsPerBox, truckSize), 2);
    }
    @Test
    void getMaxUnitsWithoutSort3() {
        List<Long> boxes = List.of(1L, 1L);
        List<Long> unitsPerBox = List.of(9L, 6L);
        long truckSize = 1;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnits(boxes, unitsPerBox, truckSize), 9);
    }

    @Test
    void getMaxUnitsStreams1() {
        List<Long> boxes = List.of(1L, 2L, 3L);
        List<Long> unitsPerBox = List.of(3L, 2L, 1L);
        long truckSize = 3;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnitsStreams(boxes, unitsPerBox, truckSize), 7);
    }
    @Test
    void getMaxUnitsStreams2() {
        List<Long> boxes = List.of(1L);
        List<Long> unitsPerBox = List.of(2L);
        long truckSize = 1;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnitsStreams(boxes, unitsPerBox, truckSize), 2);
    }
    @Test
    void getMaxUnitsStreams3() {
        List<Long> boxes = List.of(1L, 1L);
        List<Long> unitsPerBox = List.of(9L, 6L);
        long truckSize = 1;

        efficientShipping efficientShipping = new efficientShipping();
        assertEquals(efficientShipping.getMaxUnitsStreams(boxes, unitsPerBox, truckSize), 9);
    }
}
