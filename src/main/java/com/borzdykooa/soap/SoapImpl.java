package com.borzdykooa.soap;

import com.borzdykooa.entity.Trainer;

import javax.jws.WebService;

/**
 * Реализация инфтерфейса веб-сервиса
 */
@WebService(endpointInterface = "com.borzdykooa.soap.Soap", serviceName = "SoapImpl")
public class SoapImpl implements Soap {

    @Override
    public String testService() {
        return "Hello from SOAP Webservice!";
    }

    @Override
    public String sayHelloTo(String text) {
        return "Hello to trainer " + text;
    }

    @Override
    public Trainer getTrainer() {
        return new Trainer(1L, "Vladimir Vladimirov", "Java", 5);
    }
}
