package com.example.wednesday1.homework.homworkOne.entity;

import lombok.Data;

@Data
public class NanjingCommunity {

    private Long id;
    private String link;
    private String community;
    private String district;
    private String region;
    private Float longitude;
    private Float latitude;
    private Integer buildYear;
    private Integer buildingNum;
    private Integer houseNum;

}
