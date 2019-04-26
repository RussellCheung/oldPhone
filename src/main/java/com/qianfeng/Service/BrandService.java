package com.qianfeng.Service;
import com.qianfeng.PO.TbPhone;
import com.qianfeng.PO.TbPhoneBrand;
import com.qianfeng.mapper.BrandMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class BrandService {
    @Resource
    private BrandMapper brandMapper;

    public List<TbPhoneBrand> selectAllBrand(){
        return brandMapper.selectAllBrand();
    }

    public List<TbPhone> selectAllPhone(){
        return  brandMapper.selectAllPhone();
    }

    public List<TbPhone> selectPhone(String phoneBrandId){
        return brandMapper.selectPhone(phoneBrandId);
    }

   public TbPhone selectPhoneInfo(String phoneId,String stateAssessmentId){
       return brandMapper.selectPhoneInfo(phoneId,stateAssessmentId);
    }


}
