package com.qianfeng.Controller;

import com.qianfeng.PO.TbPhone;
import com.qianfeng.PO.TbPhoneBrand;
import com.qianfeng.Service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@ResponseBody
@RestController
@RequestMapping("/oldphone")
public class OldPhoneController {
    @Resource
    private BrandService brandService;

    @RequestMapping("/brand")
    public List<TbPhoneBrand> selectAllBrand(){
        List<TbPhoneBrand> brandList = brandService.selectAllBrand();
        return brandList;
    }

    @RequestMapping("/phone")
    public List<TbPhone> selectAllPhone(){
        List<TbPhone> phoneList = brandService.selectAllPhone();
        return phoneList;
    }

    @RequestMapping(value = "{brandId}",method = RequestMethod.GET)
    public List<TbPhone> selectPhone(@PathVariable("brandId") String phoneBrandId){
        List<TbPhone> tbPhoneList = brandService.selectPhone(phoneBrandId);
        return tbPhoneList;
    }

    @RequestMapping(value = "/{phoneId}/{stateAssessmentId}",method = RequestMethod.GET)
   public TbPhone selectPhoneInfo(@PathVariable("phoneId") String phoneId ,@PathVariable("stateAssessmentId")String stateAssessmentId){
        TbPhone phoneInfo  = brandService.selectPhoneInfo(phoneId,stateAssessmentId);
        return phoneInfo;
    }
}
