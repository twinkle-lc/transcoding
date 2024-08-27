package com.lc.transcoding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lc
 */
@Data
@TableName(value = "transcoding_file")
public class TranscodingFile {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Integer rid;
    private String fileUrl;
}
