package com.example.shoplite

object PriceCalculator {
    fun total(unitPrice: Double, quantity: Int, discountPercent: Int): Double {
        val subtotal = unitPrice * quantity
        return subtotal - subtotal * discountPercent / 100
    }
}