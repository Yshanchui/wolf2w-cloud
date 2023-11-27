package com.yshanchui.wolf2w.user.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@TableName("userinfo")
public class UserInfo implements Serializable {

    public static final int GENDER_SECRET = 0; //保密
    public static final int GENDER_MALE =1; //man
    public static final int GENDER_FEMALE =2; //woman
    public static final int STATE_NORMAL = 0; //正常
    public static final int STATE_DISABLE =1; //冻结

    @TableId(type = IdType.AUTO)
    private Long id;

    private String nickname;
    private String phone;
    private String email;
    private String password;
    private Integer gender = GENDER_SECRET;
    private Integer level = 0;
    private String city;
    private String headImgUrl;
    private String info;
    private Integer state = STATE_NORMAL;
}
