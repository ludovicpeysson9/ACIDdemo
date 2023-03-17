package com.example.aciddemo.main.mapper;

import com.example.aciddemo.main.models.dto.TagDTO;
import com.example.aciddemo.main.models.dto.TagDataDTO;
import com.example.aciddemo.main.models.entities.TagEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TagMapper {

    TagEntity dtoToEntity (TagDTO tagDTO);
    TagDataDTO entityToDto (TagEntity tagEntity);

}
