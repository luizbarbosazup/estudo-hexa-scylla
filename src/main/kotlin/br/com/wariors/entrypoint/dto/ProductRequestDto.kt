package br.com.wariors.entrypoint.dto

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.PositiveOrZero

@Introspected
data class ProductRequestDto (
    @NotBlank
    val name:String,
    @PositiveOrZero
    val price:Double
        )