

package io.swagger.sample.resource;

import com.google.inject.Inject;
import io.swagger.annotations.*;
import io.swagger.sample.Shopify.ShopifyService;
import io.swagger.sample.model.Product;
import io.swagger.sample.exception.NotFoundException;

import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;
import java.util.List;

@Path("/product")
@Api(value = "/product", description = "Operations on products")
@Produces({"application/json"})
public class ProductResource {

    @Inject
    private ShopifyService shopifyService;

    @POST
    @ApiOperation(value = "Add a new product to the catalog")
    @ApiResponses(value = { @ApiResponse(code = 405, message = "Invalid input") })
    public Response addProduct(@Valid
            @ApiParam(value = "Product object that needs to be added to the catalog", required = true) Product product) {

        List<Product> products = null;
        try {
            products = shopifyService.getProducts();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return Response.ok().entity(products).build();
    }
}
