package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 讲师
 *
 * @author 
 * @email
 */
@TableName("jiangshi")
public class JiangshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiangshiEntity() {

	}

	public JiangshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 讲师名称
     */
    @TableField(value = "jiangshi_name")

    private String jiangshiName;


    /**
     * 联系方式
     */
    @TableField(value = "jiangshi_phone")

    private String jiangshiPhone;


    /**
     * 头像
     */
    @TableField(value = "jiangshi_photo")

    private String jiangshiPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "jiangshi_email")

    private String jiangshiEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：讲师名称
	 */
    public String getJiangshiName() {
        return jiangshiName;
    }
    /**
	 * 获取：讲师名称
	 */

    public void setJiangshiName(String jiangshiName) {
        this.jiangshiName = jiangshiName;
    }
    /**
	 * 设置：联系方式
	 */
    public String getJiangshiPhone() {
        return jiangshiPhone;
    }
    /**
	 * 获取：联系方式
	 */

    public void setJiangshiPhone(String jiangshiPhone) {
        this.jiangshiPhone = jiangshiPhone;
    }
    /**
	 * 设置：头像
	 */
    public String getJiangshiPhoto() {
        return jiangshiPhoto;
    }
    /**
	 * 获取：头像
	 */

    public void setJiangshiPhoto(String jiangshiPhoto) {
        this.jiangshiPhoto = jiangshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getJiangshiEmail() {
        return jiangshiEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setJiangshiEmail(String jiangshiEmail) {
        this.jiangshiEmail = jiangshiEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiangshi{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", jiangshiName=" + jiangshiName +
            ", jiangshiPhone=" + jiangshiPhone +
            ", jiangshiPhoto=" + jiangshiPhoto +
            ", sexTypes=" + sexTypes +
            ", jiangshiEmail=" + jiangshiEmail +
            ", createTime=" + createTime +
        "}";
    }
}
