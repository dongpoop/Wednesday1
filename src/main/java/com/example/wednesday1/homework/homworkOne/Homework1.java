package com.example.wednesday1.homework.homworkOne;

import com.example.wednesday1.util.JdbcUtil;
import org.junit.Test;

public class Homework1 {

    @Test
    public  void prepareWork() {

        try {
             JdbcUtil.hiveBasicOperation("create table nanjing_sold(id_sold bigint, total_price int, unit_price int, " +
                    "community string, build_area float, layout string, sold_day string, id_community bigint, link_Community string, " +
                    "district string, region string, longitude float, latitude float, build_year string, building_num int, house_num int) row format delimited fields terminated by ','");

            JdbcUtil.hiveBasicOperation("load data local inpath '/opt/test/NanjingSold.csv' into table nanjing_sold");

            JdbcUtil.hiveBasicOperation("create table nanjing_community(id bigint, link string, community string, district string, " +
                    "region string, longitude float, latitude float, build_year int, building_num int, house_num int) row format delimited fields terminated by ','");

            JdbcUtil.hiveBasicOperation("load data local inpath '/opt/test/NanjingCommunity.csv' into table nanjing_community");

            JdbcUtil.hiveBasicOperation("create table nanjing_on_sale(id_on_sale bigint, link_on_sale string, title string, total_price int, unit_price int, " +
                    "community string, layout string, n_floor string, build_area float, layout_construct string,use_area float, build_type string, towards string, " +
                    "build_construct string, decorate string, stair_resident_ratio string, has_elevator string, start_sale_time string, ownership string, last_transfer_time string, " +
                    "year_limit string, use_for string, property_belong string, moregage string, has_photo string, feature string, focus_num int, id_community bigint, link_community string," +
                    "district string, region string, longitude float, latitude float, build_year int, building_num int, house_num int) row format delimited fields terminated by ','");

            JdbcUtil.hiveBasicOperation("load data local inpath '/opt/test/NanjingOnsale.csv' into table nanjing_on_sale");

            JdbcUtil.hiveBasicOperation("create table nj_community(id bigint, link string, community string, district string, region string, " +
                    "longitude float, latitude float, build_year int, building_num int, house_num int) row format delimited fields terminated by ','");

            JdbcUtil.hiveBasicOperation("load data local inpath '/opt/test/NJ_Community.csv' into table nj_community");

        }catch (Error error) {
            error.printStackTrace();
        }catch (Exception exception) {
            exception.printStackTrace();
        }

    }

//    1 根据NanjingCommunity和NanjingOnsale_gb18030统计在售房源的社区和没有在售房源社区信息的统计
    @Test
    public void task1() {

        String sql1 = "create table h1t11 row format delimited fields terminated by ',' as (select community as h_community from nanjing_community where house_num > 0)";

        String sql2 = "create table h1t12 row format delimited fields terminated by ',' as (select community as h_community from nanjing_community where house_num = 0)";

        JdbcUtil.hiveBasicOperation(sql1);

        JdbcUtil.hiveBasicOperation(sql2);

    }

//    2 统计每个社区在售房源的数量 将社区及数量进行记录
    @Test
    public void task2() {

        String sql = "create table h1t2 row format delimited fields terminated by ',' as select community as h_community, sum(house_num) as h_num from " +
                "nanjing_community group by community";

        JdbcUtil.hiveBasicOperation(sql);

    }

//    3 统计每个社区面积超过200的房屋数量 将社区名称及数量进行记录
    @Test
    public void task3() {

        String sql = "create table h1t3 row format delimited fields terminated by ',' as (select community as h_community, count(*) as h_num from nanjing_on_sale where build_area > 200 group by community)";

        JdbcUtil.hiveBasicOperation(sql);

    }

//    4 统计每个街道在售房源数量，将街道及数量进行统计
    @Test
    public void task4() {

        String sql = "create table h1t4 row format delimited fields terminated by ',' as (select region as h_region, count(*) as h_num from nanjing_on_sale group by region)";

        JdbcUtil.hiveBasicOperation(sql);

    }

//    5 根据sold_day 统计每年售出房源的数量
    @Test
    public void task5() {

        String sql = "create table h1t5 row format delimited fields terminated by ',' as (select split(sold_day, '/')[0], count(*) from nanjing_sold group by split(sold_day, '/')[0])";

        JdbcUtil.hiveBasicOperation(sql);

    }

//    6 统计在售房源中，关注排名前50的房源信息，将关注数量和房源名称进行统计
    @Test
    public void task6() {

        String sql = "create table h1t6 row format delimited fields terminated by ',' as (select focus_num as h_focus_num, district as h_district, region as h_region, community as h_community from nanjing_on_sale order by focus_num desc limit 50)";

        JdbcUtil.hiveBasicOperation(sql);

    }

//    7 统计每个社区售出房源的数量
    @Test
    public void task7() {

        String sql = "create table h1t7 row format delimited fields terminated by ',' as (select community as h_community, count(*) as h_num from nanjing_sold group by community)";

        JdbcUtil.hiveBasicOperation(sql);

    }

}