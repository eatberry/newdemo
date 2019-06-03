package com.microservice.service;

import com.microservice.model.PCService;
import java.util.List;

public interface PCServiceProvider {
    PCService sell(String pname);
    List<PCService> list();
}
