package com.example.demo

import com.example.demo.constant.UserType
import com.example.demo.dto.User
import org.junit.jupiter.api.Test
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class ParserModelTest {
	private val mapper = jacksonObjectMapper()

	@Test
	fun `parse user type with type lowercase` () {

		val userJson = """
			{
				"id": 1, 
				"type": "client"
			}
			""".trimIndent()

		val user = mapper.readValue<User>(userJson)

		assert(user.id == 1)
		assert(user.type == UserType.CLIENT)
	}
}