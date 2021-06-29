package br.com.wariors.database.Entity

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class ProductEntity (
    val id:UUID?,
    val name:String,
    val price:Double
        )