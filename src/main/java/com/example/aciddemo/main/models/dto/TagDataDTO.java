package com.example.aciddemo.main.models.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
@Data
public class TagDataDTO {

    private Integer id;
    private Integer tag_id;
    private Timestamp when;
    private float value;
}
