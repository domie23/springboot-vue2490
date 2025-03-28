package com.entity.view;

import com.entity.DiandongchezulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电动车租赁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
@TableName("diandongchezulin")
public class DiandongchezulinView  extends DiandongchezulinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiandongchezulinView(){
	}
 
 	public DiandongchezulinView(DiandongchezulinEntity diandongchezulinEntity){
 	try {
			BeanUtils.copyProperties(this, diandongchezulinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
