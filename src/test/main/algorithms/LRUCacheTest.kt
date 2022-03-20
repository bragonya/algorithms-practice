package main.algorithms

import main.design.LRUCache
import org.junit.Test

import org.junit.Assert.*

class LRUCacheTest {

    @Test
    fun basic() {

        val lruCache = LRUCache(2)
        lruCache.put(1,1)
        assertEquals(1, lruCache.get(1))
        lruCache.put(2,2)
        lruCache.put(3,3)
        assertEquals(-1, lruCache.get(1))
        assertEquals(2, lruCache.get(2))
        lruCache.put(4,4)
        assertEquals(-1, lruCache.get(3))
    }
}