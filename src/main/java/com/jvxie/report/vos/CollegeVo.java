package com.jvxie.report.vos;

import lombok.Data;

import java.util.Date;

@Data
public class CollegeVo {
    private Integer id;

    private String name;

    private Date createdAt;

    private Date updatedAt;
}
