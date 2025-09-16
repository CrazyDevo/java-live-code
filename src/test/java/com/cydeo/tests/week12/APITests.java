package com.cydeo.tests.week12;

import com.cydeo.tests.week12.pojos.Product;
import com.cydeo.utils.JSONUtils;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
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

    @Test
    public void test6() {
        //after jdk 15
        String s = JSONUtils.readJSONFile("testData", "productTemplate");

        JSONObject product=new JSONObject(s);
        product.put("price",new Faker().number().randomDouble(4,100,1000));
        product.put("title",new Faker().name().firstName()+ " " + new Faker().name().lastName());


        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(product.toString())
               // .accept("application/json")
                .post("https://fakestoreapi.com/products");
        response.prettyPrint();


    }
}
