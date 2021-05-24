package pl.pedyk.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LruCacheTest {


    @DisplayName("least recently used element should be removed from cache")
    @Test
    void test1() {
        //given
        LruCache<Integer, Integer> lruCache = new LruCache<>(4);
        //when
        lruCache.set(1,11);
        lruCache.set(2,12);
        lruCache.set(3,13);
        lruCache.set(4,14);
        lruCache.set(5,15);
        //then
        assertNull(lruCache.get(1));
        assertEquals(lruCache.get(2).intValue(),12);
        assertEquals(lruCache.get(3).intValue(),13);
        assertEquals(lruCache.get(4).intValue(),14);
        assertEquals(lruCache.get(5).intValue(),15);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(2));
//        System.out.println(lruCache.get(3));
//        System.out.println(lruCache.get(4));
//        System.out.println(lruCache.get(5));
//        System.out.println("--------------------");
        //when
        lruCache.set(6,16);

        //then
        assertNull(lruCache.get(1));
        assertNull(lruCache.get(2));
        assertEquals(lruCache.get(3).intValue(),13);
        assertEquals(lruCache.get(4).intValue(),14);
        assertEquals(lruCache.get(5).intValue(),15);
        assertEquals(lruCache.get(6).intValue(),16);

//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(2));
//        System.out.println(lruCache.get(3));
//        System.out.println(lruCache.get(4));
//        System.out.println(lruCache.get(5));
//        System.out.println(lruCache.get(6));
    }

}