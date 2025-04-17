package com.training.jc.time;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hour, int minute, int second) {
		if (hour >= 24 || minute >= 60 || second >= 60 || hour < 0 || minute < 0 || second < 0) {
			throw new RuntimeException("Can't create the object");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setHour(int hour) {
		if (hour > 24 || hour < 0) {
			this.hour = 0;
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute > 60 || minute < 0) {
			this.minute = 0;
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second > 60 || second < 0) {
			this.second = 0;
		}
		this.second = second;
	}

	public void getTime() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}

}
