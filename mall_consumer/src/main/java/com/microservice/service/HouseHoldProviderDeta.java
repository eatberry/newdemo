package com.microservice.service;

import com.microservice.model.HouseHold;
import com.microservice.model.Result;

import java.util.List;

public interface HouseHoldProviderDeta {
    Result sell(String name);

    List<HouseHold> list();

    Result transport();
}
