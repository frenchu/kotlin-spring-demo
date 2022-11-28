package com.pawelweselak.kotlinspringdemo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GreatResetServiceTest {

    private val service = GreatResetService { 10 }

    @Test
    fun `Should reset the World`() {
        // given
        val world = World(population = 8_000_000_000)

        // when
        val braveNewWorld = service.reset(world)

        // then
        assertEquals(10, braveNewWorld.population)
    }
}