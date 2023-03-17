package com.example.aciddemo.main.mapper;

import com.example.aciddemo.main.models.dto.MeterDTO;
import com.example.aciddemo.main.models.entities.MeterEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MeterMapper {

    MeterEntity dtoToEntity(MeterDTO meterDTO);
    MeterDTO entityToDto (MeterEntity meterEntity);

}
