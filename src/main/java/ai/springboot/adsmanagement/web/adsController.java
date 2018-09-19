package ai.springboot.adsmanagement.web;

import ai.springboot.adsmanagement.entity.advertisement;
import ai.springboot.adsmanagement.service.adsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class adsController {
    @Autowired
    private adsService adsservice;
    @ApiOperation(value="广告管理",notes="")
    @RequestMapping(value = "/get",method = RequestMethod.POST)
    public List<advertisement> getAds(@RequestParam(value="id",required = true) Integer  id){
        return adsservice.getAdsById(id);
    }
}
