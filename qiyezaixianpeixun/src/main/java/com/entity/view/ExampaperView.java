package com.entity.view;

import com.entity.ExampaperEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 试卷表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("exampaper")
public class ExampaperView extends ExampaperEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 试卷状态的值
		*/
		private String exampaperValue;



		//级联表 jiangshi
			/**
			* 讲师名称
			*/
			private String jiangshiName;
			/**
			* 联系方式
			*/
			private String jiangshiPhone;
			/**
			* 头像
			*/
			private String jiangshiPhoto;
			/**
			* 电子邮箱
			*/
			private String jiangshiEmail;

	public ExampaperView() {

	}

	public ExampaperView(ExampaperEntity exampaperEntity) {
		try {
			BeanUtils.copyProperties(this, exampaperEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 试卷状态的值
			*/
			public String getExampaperValue() {
				return exampaperValue;
			}
			/**
			* 设置： 试卷状态的值
			*/
			public void setExampaperValue(String exampaperValue) {
				this.exampaperValue = exampaperValue;
			}


















				//级联表的get和set jiangshi

					/**
					* 获取： 讲师名称
					*/
					public String getJiangshiName() {
						return jiangshiName;
					}
					/**
					* 设置： 讲师名称
					*/
					public void setJiangshiName(String jiangshiName) {
						this.jiangshiName = jiangshiName;
					}

					/**
					* 获取： 联系方式
					*/
					public String getJiangshiPhone() {
						return jiangshiPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setJiangshiPhone(String jiangshiPhone) {
						this.jiangshiPhone = jiangshiPhone;
					}

					/**
					* 获取： 头像
					*/
					public String getJiangshiPhoto() {
						return jiangshiPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setJiangshiPhoto(String jiangshiPhoto) {
						this.jiangshiPhoto = jiangshiPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getJiangshiEmail() {
						return jiangshiEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setJiangshiEmail(String jiangshiEmail) {
						this.jiangshiEmail = jiangshiEmail;
					}










}
