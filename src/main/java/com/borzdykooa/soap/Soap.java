package com.borzdykooa.soap;


import com.borzdykooa.entity.Trainer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Интерфейс веб-сервиса
 */
@WebService
public interface Soap {

    @WebMethod
    String testService();

    @WebMethod
    String sayHelloTo(@WebParam(name = "text") String text);

    @WebMethod
    Trainer getTrainer();
}
