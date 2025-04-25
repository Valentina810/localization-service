package com.github.valentina810.localizationservice.service.impl

import com.github.valentina810.localizationservice.repository.ScreenTranslationRepository
import com.github.valentina810.localizationservice.service.ILocalizationService
import org.springframework.stereotype.Service

@Service
class LocalizationService(private val screenTranslationRepository: ScreenTranslationRepository) : ILocalizationService {
    fun getTranslation(screenName: String, locale: String): ScreenTranslation? =
        screenTranslationRepository.findByScreenNameAndLocale(screenName, locale).orElse(null)
}