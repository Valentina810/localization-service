package com.github.valentina810.localizationservice.service.impl

import com.github.valentina810.localizationservice.model.Screen
import com.github.valentina810.localizationservice.repository.LocalizationRepository
import com.github.valentina810.localizationservice.service.LocalizationService
import org.springframework.stereotype.Service

@Service
class LocalizationServiceImpl(private val localizationRepository: LocalizationRepository) : LocalizationService {
    override fun getScreenByLocale(locale: String, screenName: String): Screen? =
        localizationRepository.findScreenByLocale(locale, screenName)
}