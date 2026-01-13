package com.controller;

import java.io.IOException;
import java.util.Map;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.StringEntity;
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
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");

            ClassicHttpResponse response = client.execute(httpPost);
            if(response.getCode() == 200) {
                //String body = response.getEntity().getContent().
            }
            client.close();

            System.out.println(response);

            return "";

            //assertThat(response.getCode(), equalTo(200));
        } catch (IOException ie) {

            return "";

        }

    }
}