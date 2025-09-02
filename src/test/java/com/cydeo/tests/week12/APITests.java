package com.cydeo.tests.week12;

import com.cydeo.tests.week12.pojos.Product;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {


    @Test
    public void test1() {

        Response response = RestAssured.given()
                .accept(ContentType.JSON)
                // .accept("application/json")
                .get("https://fakestoreapi.com/products");
        response.prettyPrint();


    }


    @Test
    public void test2() {

        Response response = RestAssured.given()
                .accept(ContentType.JSON)
                // .accept("application/json")
                .get("https://fakestoreapi.com/products/1");
        response.prettyPrint();


    }

    @Test
    public void test3() {

        Response response = RestAssured.given()
                .accept(ContentType.JSON)
                .pathParam("id",1)
                // .accept("application/json")
                .get("https://fakestoreapi.com/products/{id}");
        response.prettyPrint();


    }


    @Test
    public void test4() {

        Response response = RestAssured.given()
                .accept(ContentType.JSON)
                .pathParam("id",1)
                // .accept("application/json")
                .get("https://fakestoreapi.com/products/{id}");

        Assert.assertEquals(response.statusCode(),200);
        JsonPath body = response.jsonPath();
        int actualId = body.getInt("id");
        Assert.assertEquals(actualId,1);
        double actualRate = body.getDouble("rating.rate");

        System.out.println(actualRate);


    }


    @Test
    public void test5() {

        Response response = RestAssured.given()
                .accept(ContentType.JSON)
                .pathParam("id",1)
                // .accept("application/json")
                .get("https://fakestoreapi.com/products/{id}");

        Product product = response.as(Product.class);

        Assert.assertEquals(product.getId(),1);
        Assert.assertEquals(product.getRating().getRate(),3.9);


    }
}
