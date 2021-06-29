package br.com.wariors.core.port

import br.com.wariors.database.Entity.ProductEntity

interface DatabaseServicePort {
    fun saveProductEntity(productEntity: ProductEntity)
}