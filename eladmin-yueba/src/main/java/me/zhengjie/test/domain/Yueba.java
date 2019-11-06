package me.zhengjie.test.domain;

import lombok.Data;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import javax.persistence.*;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author cgj
* @date 2019-11-05
*/
@Entity
@Data
@Table(name="yueba")
public class Yueba implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "enabled",nullable = false)
    private Boolean enabled;

    @Column(name = "sort",nullable = false)
    private Long sort;

    @Column(name = "dept_id")
    private Long deptId;

    @Column(name = "create_time")
    private Timestamp createTime;

    public void copy(Yueba source){
        BeanUtil.copyProperties(source,this, CopyOptions.create().setIgnoreNullValue(true));
    }
}