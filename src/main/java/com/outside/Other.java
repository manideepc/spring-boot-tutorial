package com.outside;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/other")
public class Other {

    @RequestMapping(value="/getOther")
    public String getOther()
    {
        return "Other class outside Boot Strapped Class";
    }
}
