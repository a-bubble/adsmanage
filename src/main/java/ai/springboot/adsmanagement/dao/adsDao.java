package ai.springboot.adsmanagement.dao;

import ai.springboot.adsmanagement.entity.advertisement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface adsDao {
    @Select("select * from adsinfo where id=#{id}")
    List<advertisement> getAdInfoById(int id);
}
