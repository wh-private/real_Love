
package com.neuedu.model.mapper;

import java.util.List;

import com.neuedu.model.bean.Details;


public interface MapperDetails {
     //½ñÈÕÃ÷ĞÇ
	public  List<Details> selectHots();
	//²ÂÄãÏ²»¶
	public List<Details> selectGuessLike();
	
}
