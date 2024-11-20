package com.example.dimabakief_neft

data class Teacher(
    val id: Int, // Уникальный идентификатор преподавателя
    val fullName: String, // ФИО преподавателя
    val education: String, // Образование (высшее, среднее специальное и т.д.)
    val specialization: String, // Специализация преподавателя по диплому
    val position: String, // Должность преподавателя
    val teachingSubjects: String, // Предметы, которые ведет преподаватель
    val achievements: String?, // Достижения, награды и звания (если есть)
    val professionalDevelopment: String?, // Курсы повышения квалификации (если проводились)
    val yearsOfExperience: Int, // Общий стаж работы в годах
    val teachingExperience: Int // Стаж работы преподавателем в годах
)
