package com.example.shoplite

import junit.framework.TestCase.assertEquals
import org.junit.Test

class PriceCalculatorTest {

    @Test
    fun totalAppliesDiscount() {
        assertEquals(180.0, PriceCalculator.total(100.0, 2, 10), 0.001)
    }

    @Test
    fun totalWithoutDiscount() {
        assertEquals(50.0, PriceCalculator.total(25.0, 2, 0), 0.001)
    }

    @Test
    fun totalWithZeroQuantityIsZero() {
        assertEquals(0.0, PriceCalculator.total(99.0, 0, 10), 0.001)
    }
}