fun main() {
    val amount = 3000
    val customerStatus = true
    val discountedPrice = amount - discountCalculation(amount)
    val total = discountedPrice - customerStatusDiscountCalculation(discountedPrice, customerStatus)

    println(
        "Общая сумма покупки составила: $amount руб.\nСкидка за сумму заказа: " +
                discountCalculation(amount) + " руб.\nПерсональная скидка покупателя: " +
                customerStatusDiscountCalculation(discountedPrice, customerStatus) +
                " руб.\nОбщая сумма покупки с учетом всех скидок составила: $total руб."
    )
}

fun customerStatusDiscountCalculation(discountedPrice: Int, customerStatus: Boolean): Int {
    val customerStatusDiscount = when (customerStatus) {
        true -> discountedPrice * 0.01
        else -> 0
    }
    return customerStatusDiscount.toInt()
}


fun discountCalculation(amount: Int): Int {
    val discount = when {
        amount <= 1000 -> 0
        amount in 1001..10_000 -> 100
        else -> amount * 0.05
    }
    return discount.toInt()
}