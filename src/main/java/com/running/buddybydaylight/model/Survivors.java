package com.running.buddybydaylight.model;

import jakarta.persistence.*;

import java.util.Arrays;


//    survivor model containing each column of the table here
@Entity
@Table
public class Survivors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer survId;

    private String survName;

    private String survDesc;

    private String survPerk;

    @Column(name="image")
    private String survImg;

    public Survivors(Integer survId, String survName, String survDesc, String survPerk) {
        this.survId = survId;
        this.survName = survName;
        this.survDesc = survDesc;
        this.survPerk = survPerk;
        this.survImg = survImg;
    }


    public Survivors() {
    }

    public Integer getSurvId() {
        return survId;
    }

    public void setSurvId(Integer survId) {
        this.survId = survId;
    }

    public String getSurvName() {
        return survName;
    }

    public void setSurvName(String survName) {
        this.survName = survName;
    }

    public String getSurvDesc() {
        return survDesc;
    }

    public void setSurvDesc(String survDesc) {
        this.survDesc = survDesc;
    }

    public String getSurvPerk() {
        return survPerk;
    }

    public void setSurvPerk(String survPerk) {
        this.survPerk = survPerk;
    }

    public String getSurvImg() {
        return survImg;
    }

    public void setSurvImg(String survImg) {
        this.survImg = survImg;
    }

    @Override
    public String toString() {
        return "Survivors{" +
                "survId=" + survId +
                ", survName='" + survName + '\'' +
                ", survDesc='" + survDesc + '\'' +
                ", survPerk='" + survPerk + '\'' +
                ", survImg='" + survImg + '\'' +
                '}';
    }

}
