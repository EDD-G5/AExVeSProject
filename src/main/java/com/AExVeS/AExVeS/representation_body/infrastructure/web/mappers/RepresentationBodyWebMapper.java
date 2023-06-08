package com.AExVeS.AExVeS.representation_body.infrastructure.web.mappers;

import java.util.Arrays;
import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.AExVeS.AExVeS.representation_body.domain.RepresentationBody;
import com.AExVeS.AExVeS.representation_body.infrastructure.web.dto.RepresentationBodyWebDto;

@Mapper
public interface RepresentationBodyWebMapper {
	RepresentationBodyWebMapper INSTANCE = Mappers.getMapper(RepresentationBodyWebMapper.class);
	@Mapping(source = "_id", target = "id")
	RepresentationBodyWebDto toDto(RepresentationBody body);

	@InheritInverseConfiguration
	RepresentationBody fromDto(RepresentationBodyWebDto bodyWebDto);
	
	public static String list2Str(List<String> values) {
		String mapped = "";
		for (String string : values) {
			mapped+=string+", ";
		}
		return mapped.substring(0, mapped.lastIndexOf(", "));
	}
	
    public static List<String> str2List(String value) {
		return Arrays.asList(value.split(", "));
    }
}