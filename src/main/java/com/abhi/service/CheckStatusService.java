//Spring Retry library
package com.abhi.service;

import org.springframework.http.HttpStatus;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;

@Service
public class CheckStatusService {


    @Retryable(value = HttpStatusCodeException.class, maxAttempts = 3, backoff = @Backoff(3000), exclude =
            HttpClientErrorException.class)
    public String checkStatus(String trackingNumber) {

        // another microservice call to get status.
        //rest template call

        System.out.println("calling another service to get status!!");
        throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR);

        // return "approved";
    }

    @Recover
    public String recover(HttpServerErrorException exception) {
        return "Please try after some time!!";
    }
}