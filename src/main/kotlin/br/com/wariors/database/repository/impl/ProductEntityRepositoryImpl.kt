package br.com.wariors.database.repository.impl

import br.com.wariors.database.Entity.ProductEntity
import br.com.wariors.database.repository.ProdutoEntityRepository
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Singleton

@Singleton
class ProductEntityRepositoryImpl(val cqlSession: CqlSession):ProdutoEntityRepository {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun saveProductCql(productEntity: ProductEntity) {
        logger.info("Salvando no Scylla")
        cqlSession.execute(
            SimpleStatement
                .newInstance(
                    "insert into pdvdata.product(id,name,price) values (?,?,?)",
                    UUID.randomUUID(),
                    productEntity.name,
                    productEntity.price
                )
        )
    }
}