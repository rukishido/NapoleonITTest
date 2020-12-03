package com.example.napoleonittest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun sort_test(){
        var arr = arrayOf<Person>(Person("Denis",21,"male"),
            Person("Masha",30,"female"),Person("Ivan",15,"male")
        )
        var flag:Boolean = true;
        arr.sortByAge()
        for(i in 0..arr.lastIndex-1){
            if(arr[i].age >= arr[i+1].age) flag = false
        }
        assertTrue(flag)
    }

    fun Array<Person>.sortByAge (){
        this.sortBy{it.age}
    }
}