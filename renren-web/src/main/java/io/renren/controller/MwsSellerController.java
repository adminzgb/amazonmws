package io.renren.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.entity.MwsSellerEntity;
import io.renren.service.MwsSellerService;
import io.renren.utils.PageUtils;
import io.renren.utils.Query;
import io.renren.utils.R;
import io.renren.utils.ShiroUtils;


/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-22 23:11:09
 */
@RestController
@RequestMapping("mwsseller")
public class MwsSellerController {
	@Autowired
	private MwsSellerService mwsSellerService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<MwsSellerEntity> mwsSellerList = mwsSellerService.queryList(query);
		int total = mwsSellerService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(mwsSellerList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") String id){
		MwsSellerEntity mwsSeller = mwsSellerService.queryObject(id);
		return R.ok().put("mwsSeller", mwsSeller);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody MwsSellerEntity mwsSeller){
		Date date = new Date();
		mwsSeller.setCreateTime(date);
		mwsSeller.setUpdateTime(date);
		Long userId = ShiroUtils.getUserEntity().getUserId();
		mwsSeller.setUserId(userId);
		String id = UUID.randomUUID().toString();
		mwsSeller.setId(id);
		mwsSellerService.save(mwsSeller);
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody MwsSellerEntity mwsSeller){
		mwsSellerService.update(mwsSeller);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody String[] ids){
		mwsSellerService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
