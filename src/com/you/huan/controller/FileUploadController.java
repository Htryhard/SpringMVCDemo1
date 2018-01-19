package com.you.huan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/FileUpload")
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request,
                         @RequestParam("description") String description,
                         @RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(description);
        if (!file.isEmpty()) {
            String path = request.getServletContext().getRealPath("/upload/");
            String fileName = file.getOriginalFilename();
            File filepath = new File(path, fileName);
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            file.transferTo(new File(path + File.separator + fileName));
            return "helloWorld";
        } else {
            return "loginForm";
        }
    }

    @RequestMapping(value = "/uploadForm",method = RequestMethod.GET)
    public String uploadForm(){
        return "uploadForm";
    }
}
