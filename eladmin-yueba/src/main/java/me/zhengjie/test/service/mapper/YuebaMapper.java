package me.zhengjie.test.service.mapper;

import me.zhengjie.base.BaseMapper;
import me.zhengjie.test.domain.Yueba;
import me.zhengjie.test.service.dto.YuebaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author cgj
* @date 2019-11-05
*/
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface YuebaMapper extends BaseMapper<YuebaDTO, Yueba> {

}