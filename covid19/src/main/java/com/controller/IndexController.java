package com.controller;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.omg.CORBA.NameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        reloadMap();

        return "index";
    }

    private String reloadMap() {
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("https://3cwnx8b850.execute-api.eu-west-1.amazonaws.com/prod/open/heatmapGet");

            //String json = "{"id":1,"name":"John"}";
            String json = "{\"additionalProperties\":{},\"location\":{\"additionalProperties\":{},\"latitude\":57.7150033,\"longitude\":12.0011183},\"radius\":100,\"timeSpan\":500}";
            StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            CloseableHttpResponse response = client.execute(httpPost);
            if(response.getStatusLine().getStatusCode() == 200) {
                //String body = response.getEntity().getContent().
            }
            client.close();

            System.out.println(response);

            return "";

            //assertThat(response.getStatusLine().getStatusCode(), equalTo(200));
        } catch (IOException ie) {

            return "";

        }

    }
}