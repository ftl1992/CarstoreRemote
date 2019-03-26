package com.service;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;

public interface Service {
	public TbSeries selectBySeriesname(String series_name) throws Exception;
	public TbSeries selectByEname(String en_name) throws Exception;
	public TbSeries selectAname(String alias_name) throws Exception;
	public 	TbModel selectByModelname(String model_name)throws Exception;
	public TbModel selectByYear(int year)throws Exception;
	public TbModel selectByShortname(String short_name)throws Exception;
	public TbBrand selectByBrandname(String brand_name) throws Exception;
	public TbBrand selectByEnameBrand(String en_name) throws Exception ;
	public TbBrand selectCountry(String country) throws Exception ;
	public TbBrand selectPinyin(String pinyin) throws Exception ;
	public TbBrand selectAnameBrand(String alias_name) throws Exception ;
}
