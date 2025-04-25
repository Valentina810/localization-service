package com.github.valentina810.localizationservice.service.impl

import com.github.valentina810.localizationservice.model.ScreenTranslation
import com.github.valentina810.localizationservice.repository.ScreenTranslationRepository
import com.github.valentina810.localizationservice.service.LocalizationService
import org.springframework.stereotype.Service

@Service
class LocalizationServiceImpl(private val screenTranslationRepository: ScreenTranslationRepository) :
    LocalizationService {
    fun getTranslation(screenName: String, locale: String): ScreenTranslation? =
        screenTranslationRepository.findByScreenNameAndLocale(screenName, locale).orElse(null)
}