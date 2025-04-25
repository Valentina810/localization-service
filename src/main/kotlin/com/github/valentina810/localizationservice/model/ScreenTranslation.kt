package com.github.valentina810.localizationservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "translations")
data class ScreenTranslation(
    @Id val id: String? = null,
    val screenName: String,
    val locale: String,
    val content: Map<String, String>
)