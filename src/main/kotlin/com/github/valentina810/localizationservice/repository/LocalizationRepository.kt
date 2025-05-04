package com.github.valentina810.localizationservice.repository

import com.github.valentina810.localizationservice.model.LocalizationScreens
import com.github.valentina810.localizationservice.model.Screen
import org.springframework.data.mongodb.repository.Aggregation
import org.springframework.data.mongodb.repository.MongoRepository

interface LocalizationRepository : MongoRepository<LocalizationScreens, String> {

    @Aggregation(pipeline = [
        "{ '\$match': { 'locale': ?0 } }",
        "{ '\$unwind': '\$screens' }",
        "{ '\$match': { 'screens.screen': ?1 } }",
        "{ '\$replaceRoot': { 'newRoot': '\$screens' } }"
    ])
    fun findScreenByLocale(locale: String, screen: String): Screen?
}