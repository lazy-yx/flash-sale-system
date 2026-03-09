package cn.duck.flashsale.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.duck.flashsale.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}