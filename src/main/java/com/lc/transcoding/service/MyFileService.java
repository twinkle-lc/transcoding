package com.lc.transcoding.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lc.transcoding.entity.MyFile;

import java.util.List;

/**
 * @author lc
 */
public interface MyFileService extends IService<MyFile> {
    List<MyFile> getTranscodingData();
}
