package com.pawelweselak.kotlinspringdemo

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class WorldConfiguration {

    @Bean
    @ConditionalOnProperty("global.armaggedon")
    fun worldBeforeTheThing(global: GlobalProperties) = World(global.population.count)
}