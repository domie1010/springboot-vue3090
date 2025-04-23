package com.entity.vo;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课程信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kecheng")
public class KechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 课程名称
     */

    @TableField(value = "kecheng_name")
    private String kechengName;


    /**
     * 课程封面
     */

    @TableField(value = "kecheng_photo")
    private String kechengPhoto;


    /**
     * 课程视频
     */

    @TableField(value = "kecheng_video")
    private String kechengVideo;


    /**
     * 课程资料
     */

    @TableField(value = "kecheng_file")
    private String kechengFile;


    /**
     * 课程类型
     */

    @TableField(value = "kecheng_types")
    private Integer kechengTypes;


    /**
     * 讲师
     */

    @TableField(value = "jiangshi_id")
    private Integer jiangshiId;


    /**
     * 课程发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 点击次数
     */

    @TableField(value = "shangpin_clicknum")
    private Integer shangpinClicknum;


    /**
     * 课程详情
     */

    @TableField(value = "kecheng_content")
    private String kechengContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 获取：课程名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：课程封面
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 获取：课程封面
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：课程视频
	 */
    public String getKechengVideo() {
        return kechengVideo;
    }


    /**
	 * 获取：课程视频
	 */

    public void setKechengVideo(String kechengVideo) {
        this.kechengVideo = kechengVideo;
    }
    /**
	 * 设置：课程资料
	 */
    public String getKechengFile() {
        return kechengFile;
    }


    /**
	 * 获取：课程资料
	 */

    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：讲师
	 */
    public Integer getJiangshiId() {
        return jiangshiId;
    }


    /**
	 * 获取：讲师
	 */

    public void setJiangshiId(Integer jiangshiId) {
        this.jiangshiId = jiangshiId;
    }
    /**
	 * 设置：课程发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：课程发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getShangpinClicknum() {
        return shangpinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setShangpinClicknum(Integer shangpinClicknum) {
        this.shangpinClicknum = shangpinClicknum;
    }
    /**
	 * 设置：课程详情
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：课程详情
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
