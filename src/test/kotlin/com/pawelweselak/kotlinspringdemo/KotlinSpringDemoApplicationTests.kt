package com.pawelweselak.kotlinspringdemo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class KotlinSpringDemoApplicationTests(
	@Autowired private val worldAtTheBeginningOfTheEnd: World?,
	@Autowired private val greatResetService: GreatResetService,
) {
	@Test
	fun contextLoads() = Unit

	@Test
	fun `Should reset the World`() {
		// expect
		assertEquals(
			World(population = 1000),
			worldAtTheBeginningOfTheEnd?.let { greatResetService.reset(it) }
		)
	}
}
