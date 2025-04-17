package com.training.jc.time;

public class Main {

	public static void main(String[] args) {
		Time tm = new Time(12, 23, 56);
		tm.setHour(23);
		tm.setSecond(22);
		tm.getTime();
	}

}
