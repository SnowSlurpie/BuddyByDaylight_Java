package com.running.buddybydaylight.model;


import jakarta.persistence.*;

@Entity
@Table(name="killers")
public class Killers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String kName;

    private String kDesc;

    private String powerName;
    private String powerDesc;

    private String kPerk;

    public Killers(Integer id, String kName, String kDesc, String powerName, String powerDesc, String kPerk) {
        Id = id;
        this.kName = kName;
        this.kDesc = kDesc;
        this.powerName = powerName;
        this.powerDesc = powerDesc;
        this.kPerk = kPerk;
    }

    public Killers() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public String getkDesc() {
        return kDesc;
    }

    public void setkDesc(String kDesc) {
        this.kDesc = kDesc;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerDesc() {
        return powerDesc;
    }

    public void setPowerDesc(String powerDesc) {
        this.powerDesc = powerDesc;
    }

    public String getkPerk() {
        return kPerk;
    }

    public void setkPerk(String kPerk) {
        this.kPerk = kPerk;
    }

    @Override
    public String toString() {
        return "Killers{" +
                "Id=" + Id +
                ", kName='" + kName + '\'' +
                ", kDesc='" + kDesc + '\'' +
                ", powerName='" + powerName + '\'' +
                ", powerDesc='" + powerDesc + '\'' +
                ", kPerk='" + kPerk + '\'' +
                '}';
    }
}