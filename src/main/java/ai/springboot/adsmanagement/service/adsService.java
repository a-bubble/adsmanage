package ai.springboot.adsmanagement.service;

import ai.springboot.adsmanagement.dao.adsDao;
import ai.springboot.adsmanagement.entity.advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adsService {
    @Autowired
    private adsDao adsdao;
    public List<advertisement> getAdsById(int id){
        return adsdao.getAdInfoById(id);
    }

}
