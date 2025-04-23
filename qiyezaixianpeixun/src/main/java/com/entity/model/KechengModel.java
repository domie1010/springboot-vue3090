package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程封面
     */
    private String kechengPhoto;


    /**
     * 课程视频
     */
    private String kechengVideo;


    /**
     * 课程资料
     */
    private String kechengFile;


    /**
     * 课程类型
     */
    private Integer kechengTypes;


    /**
     * 讲师
     */
    private Integer jiangshiId;


    /**
     * 课程发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 点击次数
     */
    private Integer shangpinClicknum;


    /**
     * 课程详情
     */
    private String kechengContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：课程封面
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：课程视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }


    /**
	 * 设置：课程视频
	 */
    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 获取：课程资料
	 */
    public String getKechengFile() {
        return kechengFile;
    }


    /**
	 * 设置：课程资料
	 */
    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：讲师
	 */
    public Integer getJiangshiId() {
        return jiangshiId;
    }


    /**
	 * 设置：讲师
	 */
    public void setJiangshiId(Integer jiangshiId) {
        this.jiangshiId = jiangshiId;
    }
    /**
	 * 获取：课程发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：课程发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 获取：课程详情
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：课程详情
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
