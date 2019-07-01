package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.User
import java.util.*

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
    fun test_instance() {
        val user = User(id = "1")
        val user2 = User(id = "2", firstname = "John", lastname = "Cena")
        //val user3 =
            //User(id = "3", firstname = "John", lastname = "Snow", avatar = null, lastvisit = Date(), isOnline = true)

        user.printMe()
        user.parseFullName(fullName = "Peter")
        user.toinitials(firstname = "Alex", lastname = "Jones")

        //user2.printMe()
        //user3.printMe()

        println("$user")
    }
}
