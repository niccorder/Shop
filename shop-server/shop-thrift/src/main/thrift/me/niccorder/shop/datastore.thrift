include "item.thrift"

namespace java me.niccorder.shop
#@namespace scala me.niccorder.shop

service ItemDatastore {
  string createItem(item.Item item)
  string deleteItem(i32 id)
  item.Item getItem(i32 id)
}