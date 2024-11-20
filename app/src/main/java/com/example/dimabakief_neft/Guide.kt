package com.example.dimabakief_neft

import android.provider.ContactsContract.CommonDataKinds.Email

data class Guide(
    val id: Int, // Уникальный идентификатор руководства
    val fullName: String, // ФИО руководства
    val post: String, // Должность
    val phones: String, // Контактные телефоны
    val email: String // Адрес электронной почты
)
