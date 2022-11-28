package com.pawelweselak.kotlinspringdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class KotlinSpringDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringDemoApplication>(*args)
}
