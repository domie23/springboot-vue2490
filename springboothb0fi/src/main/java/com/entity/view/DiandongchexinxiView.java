package com.entity.view;

import com.entity.DiandongchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电动车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
@TableName("diandongchexinxi")
public class DiandongchexinxiView  extends DiandongchexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiandongchexinxiView(){
	}
 
 	public DiandongchexinxiView(DiandongchexinxiEntity diandongchexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, diandongchexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
