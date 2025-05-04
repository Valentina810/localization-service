package com.github.valentina810.localizationservice.repository

import com.github.valentina810.localizationservice.model.LocalizationDocument
import com.github.valentina810.localizationservice.model.Screen
import org.springframework.data.mongodb.repository.Aggregation
import org.springframework.data.mongodb.repository.MongoRepository

interface LocalizationRepository : MongoRepository<LocalizationDocument, String> {

    @Aggregation(pipeline = [
        "{ '\$match': { 'locale': ?0 } }",
        "{ '\$unwind': '\$screens' }",
        "{ '\$match': { 'screens.screen': ?1 } }",
        "{ '\$replaceRoot': { 'newRoot': '\$screens' } }"
    ])
    fun findScreenByLocaleAndScreen(locale: String, screen: String): Screen?
}