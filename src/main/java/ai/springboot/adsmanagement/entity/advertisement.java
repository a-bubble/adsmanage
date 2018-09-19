package ai.springboot.adsmanagement.entity;

import lombok.Data;

@Data
public class advertisement {
    private int id;
    private String tittle;
    private String picdir;
    private String picurl;
    private String remark;
}
