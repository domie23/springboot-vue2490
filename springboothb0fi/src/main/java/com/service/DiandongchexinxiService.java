package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiandongchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiandongchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiandongchexinxiView;


/**
 * 电动车信息
 *
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public interface DiandongchexinxiService extends IService<DiandongchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiandongchexinxiVO> selectListVO(Wrapper<DiandongchexinxiEntity> wrapper);
   	
   	DiandongchexinxiVO selectVO(@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);
   	
   	List<DiandongchexinxiView> selectListView(Wrapper<DiandongchexinxiEntity> wrapper);
   	
   	DiandongchexinxiView selectView(@Param("ew") Wrapper<DiandongchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiandongchexinxiEntity> wrapper);
   	

}

