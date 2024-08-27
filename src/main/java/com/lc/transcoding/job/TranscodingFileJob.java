package com.lc.transcoding.job;

import com.lc.transcoding.entity.MyFile;
import com.lc.transcoding.service.MyFileService;
import com.lc.transcoding.util.TranscodingFileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lc
 */
@Slf4j
@Component
public class TranscodingFileJob {
    @Autowired
    private MyFileService myFileService;
    @Autowired
    private TranscodingFileUtil transcodingFileUtil;

    @Scheduled(cron = "0 0/5 * * * ?")
    public void run() {

        List<MyFile> list = myFileService.getTranscodingData();
        if (list.isEmpty()) {
            return;
        }
        transcodingFileUtil.transcodingFile(list);

    }

}
