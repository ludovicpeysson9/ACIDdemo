package com.example.aciddemo.main.mapper;

import com.example.aciddemo.main.models.dto.ZoneDTO;
import com.example.aciddemo.main.models.entities.ZoneEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ZoneMapper {

    ZoneEntity dtoToEntity(ZoneDTO zoneDTO);
    ZoneDTO entityToDto(ZoneEntity zoneEntity);

}
