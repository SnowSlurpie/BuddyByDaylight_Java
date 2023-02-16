package com.running.buddybydaylight.model;

import jakarta.persistence.*;

@Entity
@Table(name="perks")
public class Perks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer perkId;
    private String pName;
    private String pDesc;

    public Perks(Integer perkId, String pName, String pDesc) {
        this.perkId = perkId;
        this.pName = pName;
        this.pDesc = pDesc;
    }

    public Perks() {
    }

    public Integer getPerkId() {
        return perkId;
    }

    public void setPerkId(Integer perkId) {
        this.perkId = perkId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }
}
