package com.express.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeDemo")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeDemo {

}
