package com.andreykaranik.homework2.businessLayer

import com.andreykaranik.homework2.datalayer.IAccessor
import com.andreykaranik.homework2.objects.Cat

class CatProvider(val accessor: IAccessor) {
    suspend fun getCats(offset: Int, limit: Int): List<Cat> {
        return accessor.getCats(offset, limit)
    }
}