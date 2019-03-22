package com.company.item.refactor;

import com.company.item.refactor.status.Result;

public class YouKuVideo implements AccessVideo {

	public Result accessToVideo() {
		System.out.println("接入优酷视频！");
		return null;
	}

}
