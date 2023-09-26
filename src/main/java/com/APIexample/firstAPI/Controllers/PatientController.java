package com.APIexample.firstAPI.Controllers;

import com.APIexample.firstAPI.ServiceLayers.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    //This class can have only API related to patients

    @Autowired
    private PatientService patientService;//bean
}
