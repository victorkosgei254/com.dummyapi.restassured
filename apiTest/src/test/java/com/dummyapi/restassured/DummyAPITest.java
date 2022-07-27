package com.dummyapi.restassured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DummyAPITest {
    private String dummyAPIURL = "https://gorest.co.in/public/v2/users";
    private Response apiResponse = RestAssured.get(dummyAPIURL);
    private Map<String,?> cookies = apiResponse.getCookies();
    @Test
    public void getTest() throws InterruptedException {
        System.out.println(apiResponse.asPrettyString());

        Thread.sleep(200);
    }

    @Test
    public void showCookies(){

        System.out.println(cookies.toString());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void showStatusCode(){
        System.out.println(apiResponse.statusCode());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void showBody(){
        System.out.println(apiResponse.body());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void showContentTyp(){
        System.out.println(apiResponse.contentType());
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getStatusLine(){
        System.out.println(apiResponse.getStatusLine());
    }

    @Test
    public void getSessionId(){
        System.out.println(apiResponse.getSessionId());
    }

    @Test
    public void getTime(){
        System.out.println("Time : "+apiResponse.getTime());
        System.out.println("Time In"+ apiResponse.getTimeIn(TimeUnit.MILLISECONDS));
    }

    @Test
    public void doPeek(){
        System.out.println(apiResponse.peek());
    }

    @Test
    public  void doPrettyPeek(){
        System.out.println(apiResponse.prettyPeek());
    }

    @Test
    public void showHashCode(){
        System.out.println(apiResponse.hashCode());
       
    }



}
