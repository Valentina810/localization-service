package com.github.valentina810.localizationservice.service

import com.github.valentina810.localizationservice.model.Screen

interface LocalizationService {
    fun getScreenByLocale(locale: String, screenName: String): Screen?
}