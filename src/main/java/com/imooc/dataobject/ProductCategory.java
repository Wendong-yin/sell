package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }

    @Id
    @GeneratedValue
    public Integer getCategoryId() {
        return categoryId;
    }

}
