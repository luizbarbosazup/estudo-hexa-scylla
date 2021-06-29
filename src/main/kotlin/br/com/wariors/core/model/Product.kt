package br.com.wariors.core.model

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class Product (
    val id:UUID?,
    val name:String,
    val price:Double
        )