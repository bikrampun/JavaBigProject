package org.example.util.thymeleaf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class DecoupledLogicSetup {
    //== fields
    private final SpringResourceTemplateResolver templateResolver;

    //== constructor

    public DecoupledLogicSetup(SpringResourceTemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }

    //== init
    @PostConstruct
//The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization.
    public void init() {
        templateResolver.setUseDecoupledLogic(true);
        log.info("Decoupled template logic enabled");
    }
}
