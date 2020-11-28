package com.example.demo.dto

import com.example.demo.constant.CommentStatus

data class Comment(
        val status: CommentStatus,
        val message: String
)
