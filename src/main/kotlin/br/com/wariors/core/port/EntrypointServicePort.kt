package br.com.wariors.core.port

import br.com.wariors.core.model.Product
import javax.inject.Singleton

@Singleton
interface EntrypointServicePort {

    fun saveProduct(product: Product)

}