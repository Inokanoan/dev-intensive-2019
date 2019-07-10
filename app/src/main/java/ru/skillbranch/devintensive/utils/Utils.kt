package ru.skillbranch.devintensive.utils

import java.lang.Character.toUpperCase
import kotlin.Boolean as Boolean1
import kotlin.text.ifBlank as ifBlank1

object Utils {
    fun parseFullName(fullName: String?): Pair<String, String>{
        val parts = fullName?.split(" ")
        val firstName = parts?.getOrNull(0).orEmpty().trim().ifEmpty { "null" }
        val lastName = parts?.getOrNull(1).orEmpty().trim().ifEmpty { "null" }

        return firstName to lastName
    }

    fun transliteration(payload: String, devider: String = " "): String {
        TODO("implement")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val firsr_firstName = firstName?.ifBlank1{null}?.trim()?.first()
        val firsr_lastName = lastName?.ifBlank1{null}?.trim()?.first()

        var initials: String?  = when {
            firsr_firstName == null && firsr_lastName == null -> null
            firsr_firstName == null -> firsr_lastName.toString()
            firsr_lastName == null -> firsr_firstName?.toString()
            else -> firsr_firstName?.toString() + firsr_lastName?.toString()
        }
      //  print(initials?.toUpperCase())

    return initials?.toUpperCase()

    }
}

