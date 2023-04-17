package com.example.aciddemo.main.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ZoneDTO {
    private Integer id;

    @NotBlank
    private String label;
    private Long parentZoneId;
}