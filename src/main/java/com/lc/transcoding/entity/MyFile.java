package com.lc.transcoding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author lc
 */
@TableName(value = "resource")
@Data
public class MyFile {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer adminId;

    /**
     * 类型 VIDEO WORD PDF
     */
    private String type;

    /**
     * 资源名
     */
    private String name;

    /**
     * 文件类型
     */
    private String extension;

    /**
     * 大小[字节]
     */
    private Long size;

    /**
     * 存储磁盘
     */
    private String disk;

    /**
     * 相对地址
     */
    private String path;


    private Date createdAt;


    private Integer parentId;
    private Integer isHidden;
    /**
     * 转码状态 0等待转码 1已转码 2转码中 3 转码失败
     */
    private Integer transcodingStatus;



}
