package com.example.demoelasticsearch.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * 商品
 */
@Getter
@Setter
@Document(indexName = "commodity")
@TypeAlias("product")
public class Commodity {

    @Id
    private String id;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品类型
     */
    private String productType;
    /**
     * 商品图片
     */
    private String productImage;
    /**
     * 商品价格
     */
    private String productPrice;
    /**
     * 版本
     */
    private String version;
    /**
     * 是否删除
     */
    private String isDel;
    /**
     * 创建时间
     */
    private Date createTime;

}
