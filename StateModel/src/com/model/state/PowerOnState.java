package com.model.state;

public class PowerOnState implements TVState {

	
	public void nextChanel() {
		// TODO Auto-generated method stub

		System.out.println("下一个频道");
	}

	public void preChanel() {
		// TODO Auto-generated method stub

		System.out.println("上一个频道");
	}

	public void turnUp() {
		// TODO Auto-generated method stub
		System.out.println("调大音量");
	}

	public void turnDown() {
		// TODO Auto-generated method stub
		System.out.println("调小音量");
	}

}
