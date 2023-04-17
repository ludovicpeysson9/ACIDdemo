package com.example.aciddemo.main.models.dto;

import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TagDTO {

    private Integer id;

    @Pattern(regexp="^[A-Za-z]+$")
    private String label;
}
