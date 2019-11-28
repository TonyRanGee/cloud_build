package com.qzr.qzr_service.dao;
import com.qzr.qzr_service.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DeptDao {

    @Select("select * from dept")
    public List<Dept> deptList();

}
