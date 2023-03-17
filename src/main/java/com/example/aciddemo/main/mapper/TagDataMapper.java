package com.example.aciddemo.main.mapper;

import com.example.aciddemo.main.models.dto.TagDataDTO;
import com.example.aciddemo.main.models.entities.TagDataEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagDataMapper {

    TagDataEntity dtoToEntity (TagDataDTO tagDataDTO);
    TagDataDTO entityToDto (TagDataEntity tagDataEntity);

}
