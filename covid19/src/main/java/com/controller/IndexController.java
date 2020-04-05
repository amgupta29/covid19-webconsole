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

        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }

    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return "next";
    }

    @RequestMapping("/getMapData")
    public String getMapData() {
        //model.put("message", "You are in new page !!");
        return "{\n" +
                "  \"type\": \"FeatureCollection\",\n" +
                "  \"features\": [\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 5.4,\n" +
                "        \"place\": \"48km SSE of Pondaguitan, Philippines\",\n" +
                "        \"time\": 1348176066,\n" +
                "        \"tz\": 480,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/usc000csx3\",\n" +
                "        \"felt\": 2,\n" +
                "        \"cdi\": 3.4,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"449\",\n" +
                "        \"net\": \"us\",\n" +
                "        \"code\": \"c000csx3\",\n" +
                "        \"ids\": \",usc000csx3,\",\n" +
                "        \"sources\": \",us,\",\n" +
                "        \"types\": \",dyfi,eq-location-map,general-link,geoserve,historical-moment-tensor-map,historical-seismicity-map,nearby-cities,origin,p-wave-travel-times,phase-data,scitech-link,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          126.3832,\n" +
                "          5.9775,\n" +
                "          111.16\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"usc000csx3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 5.7,\n" +
                "        \"place\": \"35km ESE of Ndoi Island, Fiji\",\n" +
                "        \"time\": 1348175020,\n" +
                "        \"tz\": -720,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/usc000csw5\",\n" +
                "        \"felt\": 0,\n" +
                "        \"cdi\": 1,\n" +
                "        \"mmi\": 2,\n" +
                "        \"alert\": \"green\",\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"500\",\n" +
                "        \"net\": \"us\",\n" +
                "        \"code\": \"c000csw5\",\n" +
                "        \"ids\": \",usc000csw5,\",\n" +
                "        \"sources\": \",us,\",\n" +
                "        \"types\": \",dyfi,eq-location-map,geoserve,historical-moment-tensor-map,historical-seismicity-map,losspager,nearby-cities,origin,p-wave-travel-times,phase-data,scitech-link,shakemap,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          -178.3725,\n" +
                "          -20.753,\n" +
                "          544.19\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"usc000csw5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 3.8,\n" +
                "        \"place\": \"43km NNE of Talkeetna, Alaska\",\n" +
                "        \"time\": 1348174056,\n" +
                "        \"tz\": -480,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/ak10562838\",\n" +
                "        \"felt\": 0,\n" +
                "        \"cdi\": 1,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": \"1\",\n" +
                "        \"sig\": \"222\",\n" +
                "        \"net\": \"ak\",\n" +
                "        \"code\": \"10562838\",\n" +
                "        \"ids\": \",ak10562838,at00mao1rc,\",\n" +
                "        \"sources\": \",ak,at,\",\n" +
                "        \"types\": \",dyfi,general-link,geoserve,impact-link,nearby-cities,origin,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          -149.8072,\n" +
                "          62.6916,\n" +
                "          10.1\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"ak10562838\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 3.4,\n" +
                "        \"place\": \"46km ESE of Yunaska Island, Alaska\",\n" +
                "        \"time\": 1348171278,\n" +
                "        \"tz\": -660,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/ak10562822\",\n" +
                "        \"felt\": null,\n" +
                "        \"cdi\": null,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"178\",\n" +
                "        \"net\": \"ak\",\n" +
                "        \"code\": \"10562822\",\n" +
                "        \"ids\": \",ak10562822,\",\n" +
                "        \"sources\": \",ak,\",\n" +
                "        \"types\": \",general-link,geoserve,nearby-cities,origin,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          -170.0567,\n" +
                "          52.4716,\n" +
                "          127.2\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"ak10562822\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 4.9,\n" +
                "        \"place\": \"41km WSW of Kimbe, Papua New Guinea\",\n" +
                "        \"time\": 1348163091,\n" +
                "        \"tz\": 600,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/usc000csng\",\n" +
                "        \"felt\": 0,\n" +
                "        \"cdi\": 1,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"369\",\n" +
                "        \"net\": \"us\",\n" +
                "        \"code\": \"c000csng\",\n" +
                "        \"ids\": \",usc000csng,\",\n" +
                "        \"sources\": \",us,\",\n" +
                "        \"types\": \",dyfi,eq-location-map,general-link,geoserve,historical-moment-tensor-map,historical-seismicity-map,nearby-cities,origin,p-wave-travel-times,phase-data,scitech-link,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          149.8211,\n" +
                "          -5.7346,\n" +
                "          120.46\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"usc000csng\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 2.9,\n" +
                "        \"place\": \"65km N of Road Town, British Virgin Islands\",\n" +
                "        \"time\": 1348161717,\n" +
                "        \"tz\": -240,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/pr12264008\",\n" +
                "        \"felt\": null,\n" +
                "        \"cdi\": null,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"129\",\n" +
                "        \"net\": \"pr\",\n" +
                "        \"code\": \"12264008\",\n" +
                "        \"ids\": \",pr12264008,\",\n" +
                "        \"sources\": \",pr,\",\n" +
                "        \"types\": \",geoserve,nearby-cities,origin,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          -64.5569,\n" +
                "          19.0055,\n" +
                "          65\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"pr12264008\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 3.4,\n" +
                "        \"place\": \"136km N of Road Town, British Virgin Islands\",\n" +
                "        \"time\": 1348161305,\n" +
                "        \"tz\": -240,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/pr12264007\",\n" +
                "        \"felt\": null,\n" +
                "        \"cdi\": null,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"178\",\n" +
                "        \"net\": \"pr\",\n" +
                "        \"code\": \"12264007\",\n" +
                "        \"ids\": \",pr12264007,\",\n" +
                "        \"sources\": \",pr,\",\n" +
                "        \"types\": \",geoserve,nearby-cities,origin,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          -64.4336,\n" +
                "          19.6334,\n" +
                "          17\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"pr12264007\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 4.3,\n" +
                "        \"place\": \"24km NE of Jesus Carranza, Mexico\",\n" +
                "        \"time\": 1348160323,\n" +
                "        \"tz\": -360,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/usc000csm3\",\n" +
                "        \"felt\": 1,\n" +
                "        \"cdi\": 4.9,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"285\",\n" +
                "        \"net\": \"us\",\n" +
                "        \"code\": \"c000csm3\",\n" +
                "        \"ids\": \",usc000csm3,\",\n" +
                "        \"sources\": \",us,\",\n" +
                "        \"types\": \",dyfi,eq-location-map,general-link,geoserve,historical-moment-tensor-map,historical-seismicity-map,nearby-cities,origin,p-wave-travel-times,phase-data,scitech-link,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          -94.854,\n" +
                "          17.5693,\n" +
                "          114.12\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"usc000csm3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"properties\": {\n" +
                "        \"mag\": 4.9,\n" +
                "        \"place\": \"121km NE of San Isidro, Philippines\",\n" +
                "        \"time\": 1348158763,\n" +
                "        \"tz\": 480,\n" +
                "        \"url\": \"http://earthquake.usgs.gov/earthquakes/eventpage/usc000cslr\",\n" +
                "        \"felt\": 0,\n" +
                "        \"cdi\": 1,\n" +
                "        \"mmi\": null,\n" +
                "        \"alert\": null,\n" +
                "        \"status\": \"REVIEWED\",\n" +
                "        \"tsunami\": null,\n" +
                "        \"sig\": \"369\",\n" +
                "        \"net\": \"us\",\n" +
                "        \"code\": \"c000cslr\",\n" +
                "        \"ids\": \",usc000cslr,\",\n" +
                "        \"sources\": \",us,\",\n" +
                "        \"types\": \",dyfi,eq-location-map,general-link,geoserve,historical-moment-tensor-map,historical-seismicity-map,nearby-cities,origin,p-wave-travel-times,phase-data,scitech-link,tectonic-summary,\"\n" +
                "      },\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          126.9779,\n" +
                "          10.6573,\n" +
                "          35.04\n" +
                "        ]\n" +
                "      },\n" +
                "      \"id\": \"usc000cslr\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
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