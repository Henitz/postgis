package com.brianpondi.gis.repository;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NairobiHealthFacilityRepository extends JpaRepository<NairobiHealthFacility, Integer> {
        @Query(value = "SELECT nhf.id, nhf.name, nhf.geom "
                      + "FROM nairobi.sub-saharan_health_facilities nhf, nairobi.ke_subcounty nsc "
                      + "WHERE ST_Within(nhf.geom, nsc.geom) AND nsc.id= :subCountyId"
                      , nativeQuery = true)
       List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(@Param("subCountyId")  int subCountyId);

        @Query(value = "SELECT nhf.id, nhf.name, nhf.geom, ST_Distance(nhf.geom,ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326)) AS distance "
                      + "FROM nairobi.sub-saharan_health_facilities nhf "
                      + "ORDER BY nhf.geom  <-> ST_SetSRID(ST_Point(:userLongitude,:userLatitude),4326) "
                      + "LIMIT 5"
                       , nativeQuery = true)
        List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(@Param("userLongitude") Double userLongitude,@Param("userLatitude")  Double userLatitude);

}
