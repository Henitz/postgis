package com.brianpondi.gis.entity;

import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.MultiPolygon;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ke_subcounty", schema = "nairobe")
public class NairobiSubCounty implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="geom")
    private MultiPolygon geom;

    @Column(name = "country")
    private String country;

    @Column(name = "provpcode")
    private String provpcode;

    @Column(name = "province")
    private String province;

    @Column(name = "ctypcode")
    private String ctypcode;

    @Column(name="county")
    private String name;

    @Column(name = "scpcode")
    private String scpcode;

    @Column(name = "subcounty")
    private String subcounty;

    @Column(name = "dhis2_id")
    private String dhis2_id;

}
