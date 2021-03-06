/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.google.gson.reflect.TypeToken;
import org.openapitools.client.model.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import java.lang.reflect.Type;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.openapitools.client.JSON;

import static io.restassured.http.Method.*;

public class StoreApi {

    private RequestSpecBuilder reqSpec;

    private StoreApi(RequestSpecBuilder reqSpec) {
        this.reqSpec = reqSpec;
    }

    public static StoreApi store(RequestSpecBuilder reqSpec) {
        return new StoreApi(reqSpec);
    }


    public DeleteOrderOper deleteOrder() {
        return new DeleteOrderOper(reqSpec);
    }

    public GetInventoryOper getInventory() {
        return new GetInventoryOper(reqSpec);
    }

    public GetOrderByIdOper getOrderById() {
        return new GetOrderByIdOper(reqSpec);
    }

    public PlaceOrderOper placeOrder() {
        return new PlaceOrderOper(reqSpec);
    }

    /**
     * Customise request specification
     * @param consumer consumer
     * @return api
     */
    public StoreApi reqSpec(Consumer<RequestSpecBuilder> consumer) {
        consumer.accept(reqSpec);
        return this;
    }

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @see #orderIdPath ID of the order that needs to be deleted (required)
     */
    public class DeleteOrderOper {

        public static final String REQ_METHOD = "DELETE";
        public static final String REQ_URI = "/store/order/{order_id}";
        public static final String SUMMARY = "Delete purchase order by ID";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public DeleteOrderOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public DeleteOrderOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * DELETE /store/order/{order_id}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(DELETE, REQ_URI));
        }

        public static final String ORDER_ID_PATH = "order_id";

        /**
         * @param orderId (String) ID of the order that needs to be deleted (required)
         * @return operation
         */
        public DeleteOrderOper orderIdPath(Object orderId) {
            reqSpec.addPathParam(ORDER_ID_PATH, orderId);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public DeleteOrderOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public DeleteOrderOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     *
     * return Map&lt;String, Integer&gt;
     */
    public class GetInventoryOper {

        public static final String REQ_METHOD = "GET";
        public static final String REQ_URI = "/store/inventory";
        public static final String SUMMARY = "Returns pet inventories by status";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetInventoryOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetInventoryOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /store/inventory
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /store/inventory
         * @param handler handler
         * @return Map&lt;String, Integer&gt;
         */
        public Map<String, Integer> executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Map<String, Integer>>(){}.getType();
            return execute(handler).as(type);
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public GetInventoryOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public GetInventoryOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @see #orderIdPath ID of pet that needs to be fetched (required)
     * return Order
     */
    public class GetOrderByIdOper {

        public static final String REQ_METHOD = "GET";
        public static final String REQ_URI = "/store/order/{order_id}";
        public static final String SUMMARY = "Find purchase order by ID";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public GetOrderByIdOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public GetOrderByIdOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * GET /store/order/{order_id}
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(GET, REQ_URI));
        }

        /**
         * GET /store/order/{order_id}
         * @param handler handler
         * @return Order
         */
        public Order executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Order>(){}.getType();
            return execute(handler).as(type);
        }

        public static final String ORDER_ID_PATH = "order_id";

        /**
         * @param orderId (Long) ID of pet that needs to be fetched (required)
         * @return operation
         */
        public GetOrderByIdOper orderIdPath(Object orderId) {
            reqSpec.addPathParam(ORDER_ID_PATH, orderId);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public GetOrderByIdOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public GetOrderByIdOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
    /**
     * Place an order for a pet
     * 
     *
     * @see #body order placed for purchasing the pet (required)
     * return Order
     */
    public class PlaceOrderOper {

        public static final String REQ_METHOD = "POST";
        public static final String REQ_URI = "/store/order";
        public static final String SUMMARY = "Place an order for a pet";

        private RequestSpecBuilder reqSpec;

        private ResponseSpecBuilder respSpec;

        public PlaceOrderOper() {
            this.reqSpec = new RequestSpecBuilder();
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        public PlaceOrderOper(RequestSpecBuilder reqSpec) {
            this.reqSpec = reqSpec;
            reqSpec.setContentType("*/*");
            reqSpec.setAccept("application/json");
            this.respSpec = new ResponseSpecBuilder();
        }

        /**
         * POST /store/order
         * @param handler handler
         * @param <T> type
         * @return type
         */
        public <T> T execute(Function<Response, T> handler) {
            return handler.apply(RestAssured.given().spec(reqSpec.build()).expect().spec(respSpec.build()).when().request(POST, REQ_URI));
        }

        /**
         * POST /store/order
         * @param handler handler
         * @return Order
         */
        public Order executeAs(Function<Response, Response> handler) {
            Type type = new TypeToken<Order>(){}.getType();
            return execute(handler).as(type);
        }

         /**
         * @param order (Order) order placed for purchasing the pet (required)
         * @return operation
         */
        public PlaceOrderOper body(Order order) {
            reqSpec.setBody(order);
            return this;
        }

        /**
         * Customise request specification
         * @param consumer consumer
         * @return operation
         */
        public PlaceOrderOper reqSpec(Consumer<RequestSpecBuilder> consumer) {
            consumer.accept(reqSpec);
            return this;
        }

        /**
         * Customise response specification
         * @param consumer consumer
         * @return operation
         */
        public PlaceOrderOper respSpec(Consumer<ResponseSpecBuilder> consumer) {
            consumer.accept(respSpec);
            return this;
        }
    }
}
