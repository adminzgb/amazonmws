package io.renren.service;

import io.renren.entity.MwsSellerEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-22 23:11:09
 */
public interface MwsSellerService {
	
	MwsSellerEntity queryObject(String id);
	
	List<MwsSellerEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(MwsSellerEntity mwsSeller);
	
	void update(MwsSellerEntity mwsSeller);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);
}
