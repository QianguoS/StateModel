package com.model.state;

public class TVController implements PowerController {

	public TVState mState;
	
	public TVState getmState() {
		return mState;
	}

	public void setmState(TVState mState) {
		this.mState = mState;
	}

	public void poweron() {
		// TODO Auto-generated method stub
		setmState(new PowerOnState());
		System.out.println("开机了");
	}

	public void poweroff() {
		// TODO Auto-generated method stub
			setmState(new PowerOffState());
			System.out.println("关机了");
	}
	public void nextChanel(){
		mState.nextChanel();
	}
	public void prechanel(){
		mState.preChanel();
	}
	public void turnup(){
		mState.turnUp();
	}
	public void turndown(){
		mState.turnDown();
	}

}
