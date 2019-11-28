package com.qzr.qzr_service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@Data
@EqualsAndHashCode(callSuper = false)
public class Dept implements Serializable {
    private Long id;
    private String name;
    private int sex;
    private String content;
    private String address;

}
