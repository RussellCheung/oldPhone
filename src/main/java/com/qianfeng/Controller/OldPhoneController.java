package com.qianfeng.Controller;

import com.qianfeng.PO.Price;
import com.qianfeng.PO.TbPhone;
import com.qianfeng.PO.TbPhoneBrand;
import com.qianfeng.Service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/oldphone")
public class OldPhoneController {
    @Resource
    private BrandService brandService;
//查询所有品牌
    @RequestMapping("/brand")
    public List<TbPhoneBrand> selectAllBrand(){
        List<TbPhoneBrand> brandList = brandService.selectAllBrand();
        return brandList;
    }
//查询所有手机
    @RequestMapping("/phone")
    public List<TbPhone> selectAllPhone(){
        List<TbPhone> phoneList = brandService.selectAllPhone();
        return phoneList;
    }
//根据品牌id查询手机
    @RequestMapping(value = "{brandId}",method = RequestMethod.GET)
    public List<TbPhone> selectPhone(@PathVariable("brandId") String phoneBrandId){
        List<TbPhone> tbPhoneList = brandService.selectPhone(phoneBrandId);
        return tbPhoneList;
    }
//根据手机id和终极父属性id查询手机损耗信息
    @RequestMapping(value = "/{phoneId}/{stateAssessmentId}",method = RequestMethod.GET)
   public TbPhone selectPhoneInfo(@PathVariable("phoneId") String phoneId ,@PathVariable("stateAssessmentId")String stateAssessmentId){
        TbPhone phoneInfo  = brandService.selectPhoneInfo(phoneId,stateAssessmentId);
        return phoneInfo;
    }
//查询一个手机
    @RequestMapping(value = "/onephone/{phoneId}",method = RequestMethod.GET)
    public TbPhone selectOnePhone(@PathVariable("phoneId") Integer phoneId){
        String phoneID = ""+phoneId;
        TbPhone onePhone  = brandService.selectOnePhone(phoneID);
        return onePhone;
    }
//查询计算损耗后的手机价格
    @RequestMapping("/price")
    public String[] Price(Price price){
        System.out.println(price);
        Long phonePrice = brandService.selectPrice(price);
        System.out.println(phonePrice);
        String[] str={"1",""+phonePrice};
        return str;
    }
}
