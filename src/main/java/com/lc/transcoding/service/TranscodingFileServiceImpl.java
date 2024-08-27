package com.lc.transcoding.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lc.transcoding.entity.TranscodingFile;
import com.lc.transcoding.mapper.TranscodingFileMapper;
import org.springframework.stereotype.Service;

/**
 * @author lc
 */
@Service
public class TranscodingFileServiceImpl extends ServiceImpl<TranscodingFileMapper, TranscodingFile> implements TranscodingFileService {
}
