package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiandongchebaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiandongchebaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiandongchebaoxiuView;


/**
 * 电动车报修
 *
 * @author 
 * @email 
 * @date 2023-03-25 23:11:57
 */
public interface DiandongchebaoxiuService extends IService<DiandongchebaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiandongchebaoxiuVO> selectListVO(Wrapper<DiandongchebaoxiuEntity> wrapper);
   	
   	DiandongchebaoxiuVO selectVO(@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);
   	
   	List<DiandongchebaoxiuView> selectListView(Wrapper<DiandongchebaoxiuEntity> wrapper);
   	
   	DiandongchebaoxiuView selectView(@Param("ew") Wrapper<DiandongchebaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiandongchebaoxiuEntity> wrapper);
   	

}

