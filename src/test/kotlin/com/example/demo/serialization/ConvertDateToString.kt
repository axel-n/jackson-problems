package com.example.demo.serialization

import com.example.demo.dto.Group
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class ConvertDateToString {

    private val mapper = jacksonObjectMapper()

    @Test
    fun `convert model with date to json`() {

        val group = Group(
                id = 1,
                name = "name",
                created = LocalDateTime.of(2011, 11, 30, 23, 59)
        )

        val jsonActual = mapper.writeValueAsString(group)
        println("jsonActual $jsonActual")
    }
}