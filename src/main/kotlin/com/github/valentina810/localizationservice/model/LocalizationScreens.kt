package com.github.valentina810.localizationservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("localization")
data class LocalizationScreens(
    @Id
    val id: String,
    val locale: String,
    val screens: List<Screen>
)