package com.AExVeS.AExVeS.partner.infrastructure.data.Mappers;

import org.mapstruct.Mapper;

import com.AExVeS.AExVeS.partner.domain.Models.Partner;
import com.AExVeS.AExVeS.partner.infrastructure.data.Entities.PartnerEntity;

@Mapper(uses = {PersonalDataEntityMapper.class, SudiesEntityMapper.class})
public interface PartnerEntityMapper {
	Partner toDomain(PartnerEntity partnerEntity);
	PartnerEntity toEntity(Partner partner);
}
