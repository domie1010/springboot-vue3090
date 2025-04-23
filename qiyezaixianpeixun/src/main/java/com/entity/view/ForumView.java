package com.entity.view;

import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 话题讨论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 话题状态的值
		*/
		private String forumStateValue;



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

		//级联表 users
			/**
			* 用户名
			*/
			private String uusername;
			/**
			* 密码
			*/
			private String upassword;
			/**
			* 角色
			*/
			private String urole;
			/**
			* 新增时间
			*/
			private Date uaddtime;

	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 话题状态的值
			*/
			public String getForumStateValue() {
				return forumStateValue;
			}
			/**
			* 设置： 话题状态的值
			*/
			public void setForumStateValue(String forumStateValue) {
				this.forumStateValue = forumStateValue;
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






			//级联表的get和set users

					/**
					* 获取： 用户名
					*/
					public String getUusername() {
						return uusername;
					}
					/**
					* 设置： 用户名
					*/
					public void setUusername(String uusername) {
						this.uusername = uusername;
					}

					/**
					* 获取： 密码
					*/
					public String getUpassword() {
						return upassword;
					}
					/**
					* 设置： 密码
					*/
					public void setUpassword(String upassword) {
						this.upassword = upassword;
					}

					/**
					* 获取： 角色
					*/
					public String getUrole() {
						return urole;
					}
					/**
					* 设置： 角色
					*/
					public void setUrole(String urole) {
						this.urole = urole;
					}

					/**
					* 获取： 新增时间
					*/
					public Date getUaddtime() {
						return uaddtime;
					}
					/**
					* 设置： 新增时间
					*/
					public void setUaddtime(Date uaddtime) {
						this.uaddtime = uaddtime;
					}
}
