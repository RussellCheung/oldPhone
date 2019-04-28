package com.qianfeng.Service;
import com.qianfeng.PO.Price;
import com.qianfeng.PO.TbDepreciation;
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

    //查询所有品牌
    public List<TbPhoneBrand> selectAllBrand(){
        return brandMapper.selectAllBrand();
    }

    //查询手机
    public List<TbPhone> selectAllPhone(){
        return  brandMapper.selectAllPhone();
    }

    //根据与品牌id查询手机
    public List<TbPhone> selectPhone(String phoneBrandId){
        return brandMapper.selectPhone(phoneBrandId);
    }

    //根据手机id和终极父属性id查询手机信息
   public TbPhone selectPhoneInfo(String phoneId,String stateAssessmentId){
       return brandMapper.selectPhoneInfo(phoneId,stateAssessmentId);
    }

    //查询单个手机
    public TbPhone selectOnePhone(String phoneId){
        return brandMapper.selectOnePhone(phoneId);
    }

    //计算手机折损后价格
    public Long selectPrice(Price price){
        String phoneId =price.getGid();
        String desc_ids = price.getDesc_ids();
        String pj_ids = price.getPj_ids();
        String property_ids = price.getProperty_ids();
        String phoneID = ""+phoneId;
        long phonePrice = brandMapper.selectOnePhone(phoneID).getPhonePrice();
        long phoneLossPrice = phonePrice;
        String[] str1 = desc_ids.split(",");
        String[] str2 = pj_ids.split(",");
        String[] str3 = property_ids.split(",");
        for(String str:str1){
            TbDepreciation depreciation = brandMapper.selectPrice(str,phoneID);
            if(depreciation != null){
                long lossMoney = depreciation.getDepreciationPrice();
                phoneLossPrice -=lossMoney;
            }
            continue;
        }
        for(String str:str2){
            if(str!=null){
                TbDepreciation depreciation = brandMapper.selectPrice(str,phoneID);
                if(depreciation != null){
                    long lossMoney = depreciation.getDepreciationPrice();
                    phoneLossPrice -=lossMoney;
                }
                continue;
            }
        }
        for(String str:str3){
            if(str != null && str.length() != 0){
                TbDepreciation depreciation = brandMapper.selectPrice(str,phoneID);
                if(depreciation != null){
                    long lossMoney = depreciation.getDepreciationPrice();
                    phoneLossPrice -=lossMoney;
                }
                continue;
            }
        }
        Long opp =phoneLossPrice;
        System.out.println("折损后价格为："+phoneLossPrice);
        return opp;
    }


}
