package com.example.aciddemo.main.models.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
@Data
public class MeterDataDTO {

    private Integer id;
    private Integer meter_id;
    private Timestamp when;
    private float value;
}
