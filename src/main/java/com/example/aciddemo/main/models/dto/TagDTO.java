package com.example.aciddemo.main.models.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TagDTO {

    private Integer id;

    private String label;
}
