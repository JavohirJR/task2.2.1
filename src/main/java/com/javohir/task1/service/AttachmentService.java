package com.javohir.task1.service;

import com.javohir.task1.entity.Attachment;
import com.javohir.task1.entity.AttachmentContent;
import com.javohir.task1.payload.ApiResult;
import com.javohir.task1.repository.AttachmentContentRepository;
import com.javohir.task1.repository.AttachmentRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    @SneakyThrows
    public ApiResult upload(MultipartHttpServletRequest request){
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        Attachment attachment = new Attachment();
        if (file != null) {
            attachment.setName(file.getOriginalFilename());
            attachment.setSize(file.getSize());
            attachment.setContentType(file.getContentType());
            Attachment savedAttachment = attachmentRepository.save(attachment);

            AttachmentContent attachmentContent = new AttachmentContent();
            attachmentContent.setBytes(file.getBytes());
            attachmentContent.setAttachment(savedAttachment);
            attachmentContentRepository.save(attachmentContent);
            return new ApiResult("File uploaded", true, savedAttachment.getId());
        }
        return new ApiResult("Error with uploading", false);
    }

    @SneakyThrows
    public void download(Integer id, HttpServletResponse response){
        Optional<Attachment> byId = attachmentRepository.findById(id);
            if (byId.isPresent()) {
            Attachment attachment = byId.get();
            response.setHeader("Content", "attachment");
            response.setContentType(attachment.getContentType());
            FileInputStream fileInputStream = new FileInputStream("uploadedFiles" + "/" + attachment.getName());
            FileCopyUtils.copy(fileInputStream, response.getOutputStream());
        }
    }
}
