package com.sample.app.service;

import java.util.Map;
import com.sample.app.dto.OrderDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/store")
@Api(description = "the store API")
public interface StoreApi {

    @DELETE
    @Path("/order/{orderId}")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors", tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    void deleteOrder(@PathParam("orderId") @Min(1) @ApiParam("ID of the order that needs to be deleted") Long orderId) throws Exception;

    @GET
    @Path("/inventory")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    Map<String, Integer> getInventory() throws Exception;

    @GET
    @Path("/order/{orderId}")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value >= 1 and <= 10.         Other values will generated exceptions", tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderDTO.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
    OrderDTO getOrderById(@PathParam("orderId") @Min(1) @Max(10) @ApiParam("ID of pet that needs to be fetched") Long orderId) throws Exception;

    @POST
    @Path("/order")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Place an order for a pet", notes = "", tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = OrderDTO.class),
        @ApiResponse(code = 400, message = "Invalid Order", response = Void.class) })
    OrderDTO placeOrder(@Valid OrderDTO body) throws Exception;
}
