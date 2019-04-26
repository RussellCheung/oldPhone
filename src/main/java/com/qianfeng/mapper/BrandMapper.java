package com.qianfeng.mapper;
import com.qianfeng.PO.TbPhone;
import com.qianfeng.PO.TbPhoneBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface BrandMapper {

    List<TbPhoneBrand> selectAllBrand();

    List<TbPhone> selectAllPhone();

    List<TbPhone>selectPhone(@Param("phoneBrandId") String brandId);

    TbPhone selectPhoneInfo(@Param("phoneId")String phoneId,@Param("stateAssessmentId")String stateAssessmentId);

}
