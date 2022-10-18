package com.antares.shoppinglist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    // Метод получает весь список покупок
    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}