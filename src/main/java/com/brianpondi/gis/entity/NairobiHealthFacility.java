package com.brianpondi.gis.entity;

import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "sub-saharan_health_facilities", schema = "nairobe")
public class NairobiHealthFacility implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "geom")
    private Point geom;

    @Column(name = "country")
    private String country;

    @Column(name = "admin1")
    private String admin1;

    @Column(name = "facility_n")
    private String name;

    @Column(name = "facility_t")
    private String facility;

    @Column(name = "ownership")
    private String ownership;

    @Column(name = "lat")
    private Double lat;

    @Column(name = "long")
    private Double lng;

    @Column(name = "ll_source")
    private String source;

}
