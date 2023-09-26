package com.APIexample.firstAPI.ServiceLayers;

import com.APIexample.firstAPI.RepositoryLayers.DoctorRepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    //this class contains and talk about doctors service details

    @Autowired
    private DoctorRepositoryLayer doctorRepositoryLayer;//bean
}
