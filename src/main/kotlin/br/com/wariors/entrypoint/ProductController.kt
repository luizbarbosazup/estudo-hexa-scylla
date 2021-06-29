package br.com.wariors.entrypoint

import br.com.wariors.core.mapper.Convert
import br.com.wariors.core.port.EntrypointServicePort
import br.com.wariors.entrypoint.dto.ProductRequestDto
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import org.slf4j.LoggerFactory
import javax.validation.Valid

@Validated
@Controller("/api/v1/products")
class ProductController(val service:EntrypointServicePort) {

    private val logger= LoggerFactory.getLogger(this::class.java)

    @Post
    fun productSave(@Body @Valid productRequestDto: ProductRequestDto) {
        logger.info("Client Request : ${productRequestDto}")
        service.saveProduct(Convert.productRequestDtoToProduto(productRequestDto = productRequestDto))
    }


}