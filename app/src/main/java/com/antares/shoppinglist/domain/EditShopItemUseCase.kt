package com.antares.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    // Метод редактирует элемент списка
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}