package com.example.demo

import com.example.demo.constant.CommentStatus
import com.example.demo.constant.UserType
import com.example.demo.dto.Comment
import com.example.demo.dto.User
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.jupiter.api.Test

class ParseEnumNumber {

    private val mapper = jacksonObjectMapper()

    @Test
    fun `parse model with enum number`() {

        val userJson = """
			{
				"message": "message text", 
				"status": 0
			}
			""".trimIndent()

        val comment = mapper.readValue<Comment>(userJson)

        assert(comment.message == "message text")
        assert(comment.status == CommentStatus.DRAFT)
    }
}