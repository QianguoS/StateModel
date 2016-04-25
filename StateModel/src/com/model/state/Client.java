package com.model.state;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TVController tvController = new TVController();
		tvController.poweron();
		tvController.nextChanel();
		tvController.turnup();
		tvController.poweroff();
	}

}
