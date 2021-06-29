package br.com.wariors.database.service

import br.com.wariors.core.port.DatabaseServicePort
import br.com.wariors.database.Entity.ProductEntity
import br.com.wariors.database.repository.ProdutoEntityRepository
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class ProductEntityService(val repository: ProdutoEntityRepository) : DatabaseServicePort {
    private val logger = LoggerFactory.getLogger(this::class.java)
    override fun saveProductEntity(productEntity: ProductEntity) {
        logger.info("database - service")
        repository.saveProductCql(productEntity = productEntity)
    }
}