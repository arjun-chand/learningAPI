package com.APIexample.firstAPI.Controllers;

import com.APIexample.firstAPI.ServiceLayers.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService; //bean
}
