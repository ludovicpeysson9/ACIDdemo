package com.example.aciddemo.main.models.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MeterDTO {

    private Integer id;
    private Integer zone_id;
    private Integer tag_id;
    private String label;
}
