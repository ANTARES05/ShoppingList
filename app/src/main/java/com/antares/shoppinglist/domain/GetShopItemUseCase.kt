package com.antares.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    // Метод получает объект по id
    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}