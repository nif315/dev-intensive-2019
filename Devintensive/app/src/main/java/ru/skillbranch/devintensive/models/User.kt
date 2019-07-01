package ru.skillbranch.devintensive.models

import java.util.*

class User(
    val id: String,
    val firstname: String?,
    val lastname: String?,
    val avatar: String?,
    val rating: Int = 0,
    val respect: Int = 0,
    val lastvisit: Date? = null,
    val isOnline: Boolean = false
) {
    constructor(id: String, firstname: String?, lastname: String?) : this(
        id = id,
        firstname = firstname,
        lastname = lastname,
        avatar = null
    )

    constructor(id: String) : this(id, firstname = "John", lastname = "Doe $id")

    init {
        print(
            "it's alive. \n" +
                    "${if (lastname === "Doe") "His name $firstname $lastname" else "and his name is $firstname $lastname"}\n" +
                    "}"
        )
    }


    fun printMe(): Unit {
        println(
            """
            id:$id
            firstname:$firstname
            lastname:$lastname
            avatar:$avatar
            rating:$rating
            respect:$respect
            lastvisit:$lastvisit
            isOnline:$isOnline
        """.trimIndent()
        )
    }

    fun parseFullName(fullName: String): String {
        val result = firstname + lastname
        return result
        println(result)
    }

    fun toinitials(firstname: String?, lastname: String?): String {
        if (firstname != null || lastname != null) {
            val firstLetter = "$firstname"[0]
            val initials = firstLetter.toString() + lastname
            return initials
            println(initials)
        } else {
            return "values are empty"
        }
    }
}
