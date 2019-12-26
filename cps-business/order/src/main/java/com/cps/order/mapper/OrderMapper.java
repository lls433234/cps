package com.cps.order.mapper;

import com.cps.order.entity.Orderd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    int save(Orderd orderd);
}
