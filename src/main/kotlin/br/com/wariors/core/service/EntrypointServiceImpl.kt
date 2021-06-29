package br.com.wariors.core.service

import br.com.wariors.core.model.Product
import br.com.wariors.core.port.EntrypointServicePort
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class EntrypointServiceImpl:EntrypointServicePort {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun saveProduct(product: Product) {
        logger.info("receiving product to entrypoint : ${product}")
    }
}