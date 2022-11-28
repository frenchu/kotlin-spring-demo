package com.pawelweselak.kotlinspringdemo

import org.springframework.stereotype.Service

@Service
internal class GreatResetService(
    private val globalElitesSupplier: () -> Long
) {
    fun reset(earth: World) = earth.copy(population = globalElitesSupplier())
}
