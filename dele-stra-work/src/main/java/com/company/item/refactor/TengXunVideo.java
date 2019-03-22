package com.company.item.refactor;

import com.company.item.refactor.status.Result;

public class TengXunVideo implements AccessVideo {

	public Result accessToVideo() {
		System.out.println("接入腾讯视！");
		return null;
	}

}
