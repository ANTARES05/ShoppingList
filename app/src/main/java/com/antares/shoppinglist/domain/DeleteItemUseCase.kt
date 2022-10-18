package com.antares.shoppinglist.domain

class DeleteItemUseCase(private val shopListRepository: ShopListRepository) {

    // Метод удаляет элемент из списка
    fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}