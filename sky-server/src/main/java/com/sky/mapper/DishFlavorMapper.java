package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除口味数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where id= #{dishId}")
    void deleteByDishId(Long dishId);

    /**
     * 根据菜品集合批量删除相关口味数据
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);
}
