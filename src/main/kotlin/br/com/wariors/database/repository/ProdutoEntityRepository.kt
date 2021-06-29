package br.com.wariors.database.repository

import br.com.wariors.database.Entity.ProductEntity
import javax.inject.Singleton

@Singleton
interface ProdutoEntityRepository {

    fun saveProductCql(productEntity: ProductEntity)

}