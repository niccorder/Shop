package me.niccorder.shop.api

import me.niccorder.shop.Item

class ItemApiModule {
  val item: Item = Item.apply("1", "Cheese", 23.4, Option.empty)
}
