package com.brianpondi.gis.service;

import com.brianpondi.gis.entity.NairobiSubCounty;
import javassist.NotFoundException;

import java.util.List;


public interface NairobiSubCountyService {
    List<NairobiSubCounty> findAll();
    NairobiSubCounty findById(int id) throws NotFoundException;
    void deleteById(int id);
}
