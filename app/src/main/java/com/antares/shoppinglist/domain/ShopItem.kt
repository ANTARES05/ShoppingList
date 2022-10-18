package com.antares.shoppinglist.domain

// Класс сущности с которым работает приложение
data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)