package com.example.demo.constant

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class UserType(@JsonValue val type: String) {
    CLIENT("client"),
    MANAGER("manager");
}