package com.pawelweselak.kotlinspringdemo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("global")
internal data class GlobalProperties(
    val population: Population,
    val elites: Elites
) {
    data class Population(
        val count: Long
    )
    data class Elites(
        val count: Long
    )
}
