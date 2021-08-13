package com.hooooroooos.kotlininitializer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinInitializerApplication

fun main(args: Array<String>) {
	runApplication<KotlinInitializerApplication>(*args)
}
