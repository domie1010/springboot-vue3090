package com.entity.view;

import com.entity.KechengCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng_collection")
public class KechengCollectionView extends KechengCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String kechengCollectionValue;



		//级联表 kecheng
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
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 课程信息 的 讲师
			*/
			private Integer kechengJiangshiId;
			/**
			* 点击次数
			*/
			private Integer shangpinClicknum;
			/**
			* 课程详情
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 员工名称
			*/
			private String yonghuName;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public KechengCollectionView() {

	}

	public KechengCollectionView(KechengCollectionEntity kechengCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kechengCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getKechengCollectionValue() {
				return kechengCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setKechengCollectionValue(String kechengCollectionValue) {
				this.kechengCollectionValue = kechengCollectionValue;
			}




























				//级联表的get和set kecheng

					/**
					* 获取： 课程名称
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程名称
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程封面
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程封面
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 课程视频
					*/
					public String getKechengVideo() {
						return kechengVideo;
					}
					/**
					* 设置： 课程视频
					*/
					public void setKechengVideo(String kechengVideo) {
						this.kechengVideo = kechengVideo;
					}

					/**
					* 获取： 课程资料
					*/
					public String getKechengFile() {
						return kechengFile;
					}
					/**
					* 设置： 课程资料
					*/
					public void setKechengFile(String kechengFile) {
						this.kechengFile = kechengFile;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取：课程信息 的 讲师
					*/
					public Integer getKechengJiangshiId() {
						return kechengJiangshiId;
					}
					/**
					* 设置：课程信息 的 讲师
					*/
					public void setKechengJiangshiId(Integer kechengJiangshiId) {
						this.kechengJiangshiId = kechengJiangshiId;
					}


					/**
					* 获取： 点击次数
					*/
					public Integer getShangpinClicknum() {
						return shangpinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShangpinClicknum(Integer shangpinClicknum) {
						this.shangpinClicknum = shangpinClicknum;
					}

					/**
					* 获取： 课程详情
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程详情
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 员工名称
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 员工名称
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
