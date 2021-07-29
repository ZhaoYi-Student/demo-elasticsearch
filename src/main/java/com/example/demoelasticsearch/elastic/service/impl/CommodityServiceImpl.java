package com.example.demoelasticsearch.elastic.service.impl;

import com.example.demoelasticsearch.elastic.repository.CommodityRepository;
import com.example.demoelasticsearch.elastic.service.CommonService;
import com.example.demoelasticsearch.pojo.Commodity;
import com.example.demoelasticsearch.util.GsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CommodityServiceImpl implements CommonService<Commodity> {

    private final CommodityRepository commodityRepository;

    public CommodityServiceImpl(CommodityRepository commodityRepository) {
        this.commodityRepository = commodityRepository;
    }

    @Override
    public Commodity findById(String id) {
        Optional<Commodity> byId = commodityRepository.findById(id);
        if (byId.isPresent()) {
            log.info("findById byId is : {}", GsonUtil.toJson(byId.get()));
            return byId.get();
        }
        return null;
    }

    @Override
    public List<Commodity> findAll() {
        List<Commodity> all = (List<Commodity>) commodityRepository.findAll();
        log.info("findAll all is : {}", GsonUtil.toJson(all));
        return all;
    }

    @Override
    public int save(Commodity target) {
        try {
            Commodity save = commodityRepository.save(target);
            log.info("save is success : {}", GsonUtil.toJson(save));
            return 1;
        } catch (Exception e) {
            log.info("save is failed");
            e.printStackTrace();
            return 0;
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int saveAll(List<Commodity> targets) {
        try {
            commodityRepository.saveAll(targets);
            log.info("saveAll is success : {}", targets.size());
            return targets.size();
        } catch (Exception e) {
            log.info("saveAll is failed");
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Commodity target) {
        return 0;
    }

    @Override
    public int updateAll(List<Commodity> targets) {
        return 0;
    }

    @Override
    public int del(Commodity target) {
        try {
            commodityRepository.delete(target);
            log.info("del is success : {}", GsonUtil.toJson(target));
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            log.info("del is failed");
            return 0;
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int delAll(List<Commodity> target) {
        try {
            commodityRepository.deleteAll(target);
            log.info("delAll is success : {}", target.size());
            return target.size();
        } catch (Exception e) {
            e.printStackTrace();
            log.info("delAll is failed");
            return 0;
        }
    }
}
