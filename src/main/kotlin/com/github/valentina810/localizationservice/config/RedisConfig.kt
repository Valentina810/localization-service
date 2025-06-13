package com.github.valentina810.localizationservice.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.cache.CacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.cache.RedisCacheConfiguration
import org.springframework.data.redis.cache.RedisCacheManager
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.RedisSerializationContext
import org.springframework.data.redis.serializer.StringRedisSerializer

@Configuration
class RedisConfig {

    @Bean
    fun objectMapper(): ObjectMapper = ObjectMapper().apply {
        registerModule(KotlinModule.Builder().build())
    }

    @Bean
    fun redisSerializer(objectMapper: ObjectMapper): GenericJackson2JsonRedisSerializer =
        GenericJackson2JsonRedisSerializer(objectMapper)

    @Bean
    fun redisTemplate(
        factory: RedisConnectionFactory,
        redisSerializer: GenericJackson2JsonRedisSerializer
    ): RedisTemplate<String, Any> {
        val template = RedisTemplate<String, Any>()
        template.connectionFactory = factory
        template.keySerializer = StringRedisSerializer()
        template.valueSerializer = redisSerializer
        template.hashKeySerializer = StringRedisSerializer()
        template.hashValueSerializer = redisSerializer
        template.afterPropertiesSet()
        return template
    }

    @Bean
    fun cacheManager(
        redisConnectionFactory: RedisConnectionFactory,
        redisSerializer: GenericJackson2JsonRedisSerializer
    ): CacheManager {
        val redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
            .serializeValuesWith(
                RedisSerializationContext.SerializationPair.fromSerializer(redisSerializer)
            )
        return RedisCacheManager.builder(redisConnectionFactory)
            .cacheDefaults(redisCacheConfiguration)
            .build()
    }
}
