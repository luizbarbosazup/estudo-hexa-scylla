package br.com.wariors.core.mapper

import br.com.wariors.core.model.Product
import br.com.wariors.database.Entity.ProductEntity
import br.com.wariors.entrypoint.dto.ProductRequestDto

class Convert {
    companion object{
        fun productRequestDtoToProduto(productRequestDto: ProductRequestDto) =
            Product(id =null, name = productRequestDto.name, price = productRequestDto.price)
        fun productToProductEntity(product: Product) =
            ProductEntity(id = null,name = product.name, price = product.price)
    }
}