package com.APIexample.firstAPI.ServiceLayers;

import com.APIexample.firstAPI.RepositoryLayers.PatientRepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    //This will contain and talk about patient service details

    @Autowired
    private PatientRepositoryLayer patientRepositoryLayer;//bean
}
