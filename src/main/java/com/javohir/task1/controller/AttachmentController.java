package com.javohir.task1.controller;

import com.javohir.task1.payload.ApiResult;
import com.javohir.task1.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
@RestController
@RequestMapping(value = "/api/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping(value = "/upload")
    public ApiResult upload(MultipartHttpServletRequest request){
        return attachmentService.upload(request);
    }

    @GetMapping("/download/{id}")
    public void getFileFromSystem(@PathVariable Integer id, HttpServletResponse response){
        attachmentService.download(id, response);
    }

}
