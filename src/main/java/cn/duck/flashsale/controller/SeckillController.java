package cn.duck.flashsale.controller;

import cn.duck.flashsale.service.SeckillService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seckill")
public class SeckillController {

    @Resource
    private SeckillService seckillService;

    @PostMapping
    public String seckill(@RequestParam Long userId,
                          @RequestParam Long productId) {

        return seckillService.seckill(userId, productId);

    }

}