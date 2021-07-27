package com.example.demoelasticsearch.elastic.controller;

import com.example.demoelasticsearch.elastic.service.impl.CommodityServiceImpl;
import com.example.demoelasticsearch.pojo.Commodity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commodity")
public class CommodityController {

    private final CommodityServiceImpl commodityService;

    public CommodityController(CommodityServiceImpl commodityService) {
        this.commodityService = commodityService;
    }

    @GetMapping("/")
    public List<Commodity> findAll() {
        return commodityService.findAll();
    }

    @GetMapping("/{id}")
    public Commodity findById(@PathVariable("id") String id) {
        return commodityService.findById(id);
    }

    @PostMapping("/")
    public String save(Commodity commodity) {
        if (commodity.getId() == null) {
            return "id must not be null";
        }
        return String.format("save count is : %d", commodityService.save(commodity));
    }

    @DeleteMapping("/")
    public String del(Commodity commodity) {
        return String.format("del count is : %d", commodityService.del(commodity));
    }


}
