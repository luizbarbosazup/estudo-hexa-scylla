package br.com.wariors.core.mapper

import br.com.wariors.core.model.Product
import br.com.wariors.entrypoint.dto.ProductRequestDto

class Convert {
    companion object{
        fun productRequestDtoToProduto(productRequestDto: ProductRequestDto) =
            Product(null,productRequestDto.name, productRequestDto.price)
    }
}