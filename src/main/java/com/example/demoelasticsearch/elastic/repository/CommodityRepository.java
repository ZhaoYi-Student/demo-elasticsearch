package com.example.demoelasticsearch.elastic.repository;

import com.example.demoelasticsearch.pojo.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity,String> {



}
