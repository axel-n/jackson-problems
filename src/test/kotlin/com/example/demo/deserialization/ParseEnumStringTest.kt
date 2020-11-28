package com.example.demo.desiarization

import com.example.demo.constant.UserType
import com.example.demo.dto.User
import org.junit.jupiter.api.Test
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class ParseEnumStringTest {
	private val mapper = jacksonObjectMapper()

	@Test
	fun `parse model with enum string lowercase` () {

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