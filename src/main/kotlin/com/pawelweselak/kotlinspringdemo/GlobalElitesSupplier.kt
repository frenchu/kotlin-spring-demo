package com.pawelweselak.kotlinspringdemo

import org.springframework.stereotype.Component

@Component
internal class GlobalElitesSupplier(private val global: GlobalProperties) : () -> Long {
    override fun invoke(): Long = global.elites.count
}
