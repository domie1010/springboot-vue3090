package com.entity.view;

import com.entity.KechengEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 课程信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kecheng")
public class KechengView extends KechengEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 课程类型的值
		*/
		private String kechengValue;



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

	public KechengView() {

	}

	public KechengView(KechengEntity kechengEntity) {
		try {
			BeanUtils.copyProperties(this, kechengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
