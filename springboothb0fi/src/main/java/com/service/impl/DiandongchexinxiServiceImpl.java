package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiandongchexinxiDao;
import com.entity.DiandongchexinxiEntity;
import com.service.DiandongchexinxiService;
import com.entity.vo.DiandongchexinxiVO;
import com.entity.view.DiandongchexinxiView;

@Service("diandongchexinxiService")
public class DiandongchexinxiServiceImpl extends ServiceImpl<DiandongchexinxiDao, DiandongchexinxiEntity> implements DiandongchexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiandongchexinxiEntity> page = this.selectPage(
                new Query<DiandongchexinxiEntity>(params).getPage(),
                new EntityWrapper<DiandongchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiandongchexinxiEntity> wrapper) {
		  Page<DiandongchexinxiView> page =new Query<DiandongchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiandongchexinxiVO> selectListVO(Wrapper<DiandongchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiandongchexinxiVO selectVO(Wrapper<DiandongchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiandongchexinxiView> selectListView(Wrapper<DiandongchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiandongchexinxiView selectView(Wrapper<DiandongchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
