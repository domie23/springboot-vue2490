package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiandongchezulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiandongchezulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiandongchezulinView;


/**
 * 电动车租赁
 *
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public interface DiandongchezulinService extends IService<DiandongchezulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiandongchezulinVO> selectListVO(Wrapper<DiandongchezulinEntity> wrapper);
   	
   	DiandongchezulinVO selectVO(@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);
   	
   	List<DiandongchezulinView> selectListView(Wrapper<DiandongchezulinEntity> wrapper);
   	
   	DiandongchezulinView selectView(@Param("ew") Wrapper<DiandongchezulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiandongchezulinEntity> wrapper);
   	

}

