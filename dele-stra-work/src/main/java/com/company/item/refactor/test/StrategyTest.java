package com.company.item.refactor.test;

import com.company.item.refactor.strategy.VideoStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		String cpId = "120";
		VideoStrategy.getAccessVideo(cpId).accessToVideo();
	}
}
