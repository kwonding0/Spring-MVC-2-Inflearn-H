package hello.upload.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UploadFile {
    //같은 파일로 저장하면 파일이 덮어씌워지기 떄문에, storeFileName은 유일한 파일명으로 바꿔줘서 넣어줄거임.
    private String uploadFileName;
    private String storeFileName;
}
