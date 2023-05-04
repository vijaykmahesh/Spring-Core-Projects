package com.seleniumexpress.fistspringapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = {"file","database"})
public class Test {

}
