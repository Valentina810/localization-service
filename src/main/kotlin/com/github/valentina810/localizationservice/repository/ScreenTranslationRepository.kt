package com.github.valentina810.localizationservice.repository

import com.github.valentina810.localizationservice.model.ScreenTranslation
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.Optional

interface ScreenTranslationRepository : MongoRepository<ScreenTranslation, String> {
    fun findByScreenNameAndLocale(screenName: String, locale: String): Optional<ScreenTranslation>
}