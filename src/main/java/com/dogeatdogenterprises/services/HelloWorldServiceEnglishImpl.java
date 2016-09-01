package com.dogeatdogenterprises.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by donaldsmallidge on 8/31/16.
 */
@Component
@Profile("english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {

        return "Hello World!";
    }
}
