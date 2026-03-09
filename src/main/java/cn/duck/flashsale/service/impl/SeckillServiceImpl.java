package cn.duck.flashsale.service.impl;

import cn.duck.flashsale.entity.Order;
import cn.duck.flashsale.mapper.OrderMapper;
import cn.duck.flashsale.service.SeckillService;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


@Service
public class SeckillServiceImpl implements SeckillService {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private OrderMapper orderMapper;

    @Override
    public String seckill(Long userId, Long productId) {

        String stockKey = "flashsale:stock:" + productId;

        Long stock = redisTemplate.opsForValue().decrement(stockKey);

        if (stock == null || stock < 0) {
            return "Sold Out";
        }

        Order order = new Order();
        order.setUserId(userId);
        order.setProductId(productId);

        orderMapper.insert(order);

        return "Seckill Success";

    }
}