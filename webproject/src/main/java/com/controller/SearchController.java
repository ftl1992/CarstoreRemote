package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.TbBrand;
import com.po.TbModel;
import com.po.TbSeries;
import com.service.Service;
@ControllerAdvice
public class SearchController {
		private Service service;
		
		@RequestMapping("/selectBySeriesname")
		public String  selectBySeriesname( Model model,String series_name) throws Exception{
			
			//调用service查询商品信息
			TbSeries seriesDto = service.selectBySeriesname(series_name);
			
			model.addAttribute("seriesDto", seriesDto);
			return "index";
		}
		
		
		@RequestMapping("/selectByEname")
		public String selectByEname(Model model,String en_name) throws Exception{
			
			//调用service查询商品信息
			TbSeries seriesDto = service.selectByEname(en_name);
			model.addAttribute("seriesDto", seriesDto);
			
			return "index";
		}
		@RequestMapping("/selectAname")
		public String selectAname(Model model,String alias_name) throws Exception{
			
			//调用service查询商品信息
			TbSeries seriesDto = service.selectAname(alias_name);
			model.addAttribute("seriesDto", seriesDto);
			
			return "index";
		}
		@RequestMapping("/selectByModelname")
		public 	String selectByModelname(Model model,String model_name)throws Exception{
			
			//调用service查询商品信息
			TbModel modelDto = service.selectByModelname(model_name);
			model.addAttribute("modelDto", modelDto);
			
			return "index";
		}
		@RequestMapping("/selectByYear")
		public String selectByYear(Model model,int year)throws Exception{
			
			//调用service查询商品信息
			TbModel modelDto = service.selectByYear(year);
			model.addAttribute("modelDto", modelDto);
			
			return "index";
		}
		@RequestMapping("/selectByShortname")
		public String selectByShortname(Model model,String short_name)throws Exception{
			
			//调用service查询商品信息
			TbModel modelDto = service.selectByShortname(short_name);
			model.addAttribute("modelDto", modelDto);
			
			return "index";
		}
		@RequestMapping("/selectByBrandname")
		public String selectByBrandname(Model model,String brand_name) throws Exception{
			
			//调用service查询商品信息
			TbBrand brandDto = service.selectByBrandname(brand_name);
			model.addAttribute("brandDto", brandDto);
			
			return "index";
		}
		@RequestMapping("/selectByEnameBrand")
		public String selectByEnameBrand(Model model,String en_name) throws Exception {
			
			//调用service查询商品信息
			TbBrand brandDto = service.selectByEnameBrand(en_name);
			model.addAttribute("brandDto", brandDto);
			
			return "index";
		}
		
		@RequestMapping("/selectCountry")
		public String selectCountry(Model model,String country) throws Exception {
			
			//调用service查询商品信息
			TbBrand brandDto = service.selectCountry(country);
			model.addAttribute("brandDto", brandDto);
			
			return "index";
		}
		@RequestMapping("/selectPinyin")
		public String selectPinyin(Model model,String pinyin) throws Exception{
			
			//调用service查询商品信息
			TbBrand brandDto = service.selectPinyin(pinyin);
			model.addAttribute("brandDto", brandDto);
			
			return "index";
		}
		@RequestMapping("/selectAnameBrand")
		public String selectAnameBrand(Model model,String alias_name) throws Exception{
			
			//调用service查询商品信息
			TbBrand brandDto = service.selectAnameBrand(alias_name);
			model.addAttribute("brandDto", brandDto);
			
			return "index";
		}
}
