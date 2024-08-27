package com.lc.transcoding;

import cn.hutool.core.io.FileUtil;
import com.lc.transcoding.entity.MyFile;
import com.lc.transcoding.service.MyFileService;
import com.lc.transcoding.util.MinioUtil;
import com.lc.transcoding.util.TranscodingFileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lc
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private MyFileService myFileService;
    @Autowired
    private TranscodingFileUtil transcodingFileUtil;
    @PostMapping("/transcoding")
    public Map<String, String> transcoding(MultipartFile file) {
        Map<String, String> map = new HashMap<>();
        try {
            String s = MinioUtil.upload(file.getInputStream(), "/");

            MyFile myFile =new MyFile();
            myFile.setTranscodingStatus(0);
            myFile.setName(file.getOriginalFilename());
            myFile.setPath(s);
            myFile.setType(FileUtil.getType(new File(s)));
            myFileService.save(myFile);
            map.put("result", s);
        }catch (Exception e){

        }

        return map;
    }

}
