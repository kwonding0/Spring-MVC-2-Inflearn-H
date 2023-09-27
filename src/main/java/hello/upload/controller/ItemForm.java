package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {
    private Long itemId;
    private String itemName;
    private MultipartFile attachFile; //MultipartFile는 @ModelAttribute에서 사용할 수 있음.
    private List<MultipartFile> imageFiles;
}
