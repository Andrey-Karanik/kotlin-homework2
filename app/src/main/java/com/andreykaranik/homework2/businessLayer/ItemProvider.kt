package com.andreykaranik.homework2.businessLayer

import com.andreykaranik.homework2.datalayer.IAccessor
import com.andreykaranik.homework2.objects.Item

class ItemProvider(val accessor: IAccessor) {
    suspend fun getCats(offset: Int, limit: Int): List<Item> {
        return accessor.getCats(offset, limit)
    }
}