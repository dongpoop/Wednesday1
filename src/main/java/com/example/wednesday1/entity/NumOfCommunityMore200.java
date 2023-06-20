package com.example.wednesday1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("num_of_community_more_200")
public class NumOfCommunityMore200 {

    private String communityName;
    private Integer num;

}
