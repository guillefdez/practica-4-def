package com.icai.practicas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    public static Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping(
            path="/get-data",
//            consumes = MediaType.,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getBitcoinData() {

        logger.info("Procesando data de bitcoin");

        String data = "[\n" +
                "   {\n" +
                "      \"name\" : \"BTC\",\n" +
                "      \"price\" : 3190.00,\n" +
                "      \"amount\" : 0.24843000,\n" +
                "      \"date\" : 1399210160\n" +
                "   },\n" +
                "   {\n" +
                "      \"price\" : 3195.00,\n" +
                "      \"name\" : \"ETH\",\n" +
                "      \"amount\" : 0.08800000,\n" +
                "      \"date\" : 1399210708\n" +
                "   },\n" +
                "   {\n" +
                "      \"price\" : 3050.01,\n" +
                "      \"name\" : \"XRP\",\n" +
                "      \"amount\" : 0.80000000,\n" +
                "      \"date\" : 1399213161\n" +
                "   },\n" +
                "   {\n" +
                "      \"price\" : 3195.00,\n" +
                "      \"name\" : \"TAC\",\n" +
                "      \"date\" : 1399214944,\n" +
                "      \"amount\" : \"0.05000000\"\n" +
                "   },\n" +
                "   {\n" +
                "      \"date\" : 1399214983,\n" +
                "      \"amount\" : 0.00800000,\n" +
                "      \"name\" : \"MANA\",\n" +
                "      \"price\" : \"3195.00\"\n" +
                "   }\n" +
                "]";

        return data;
    }


}
