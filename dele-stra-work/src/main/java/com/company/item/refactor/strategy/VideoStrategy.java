package com.company.item.refactor.strategy;

import java.util.HashMap;
import java.util.Map;

import com.company.item.refactor.AccessVideo;
import com.company.item.refactor.TengXunVideo;
import com.company.item.refactor.YouKuVideo;

public class VideoStrategy {

	private VideoStrategy(){}
	
	private static final String TENG_XUN = "110";
	private static final String YOU_KU = "120";
	private static final String DEFAULT = TENG_XUN;
	
	private static Map<String,AccessVideo> map = new HashMap<String,AccessVideo>();
	
	static{
		map.put(TENG_XUN, new TengXunVideo());
		map.put(YOU_KU, new YouKuVideo());
	}
	
	public static AccessVideo getAccessVideo(String cpId){
		AccessVideo accessVideo = null;
		if(!map.containsKey(cpId)){
			accessVideo = map.get(DEFAULT);
		}
		accessVideo = map.get(cpId);
		return accessVideo;
	}
}
