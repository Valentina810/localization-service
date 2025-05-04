package com.github.valentina810.localizationservice.service

import com.github.valentina810.localizationservice.model.Screen

interface LocalizationService {
    fun getTranslation(locale: String, screenName: String): Screen?
}