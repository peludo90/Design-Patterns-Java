package com.designpatterns.builder;

import java.security.InvalidAlgorithmParameterException;

public class Computer {

	private String processorName;
	private int processorCapacity;
	private String hddName;
	private int hddCapacity;
	private String ramName;
	private int ramCapacity;
	private String boarName;
	private int boardCapacity;
	private String screenName;
	private int screenSize;
	private String mouseName;
	private String keyboarName;

	public Computer(Builder builder) {
		this.processorName = builder.processorName;
		this.processorCapacity = builder.processorCapacity;
		this.hddName = builder.hddName;
		this.hddCapacity = builder.hddCapacity;
		this.ramName = builder.ramName;
		this.ramCapacity = builder.ramCapacity;
		this.boarName = builder.boarName;
		this.boardCapacity = builder.boardCapacity;
		this.screenName = builder.screenName;
		this.screenSize = builder.screenSize;
		this.mouseName = builder.mouseName;
		this.keyboarName = builder.keyboarName;
	}

	public String getProcessorName() {
		return processorName;
	}

	public int getProcessorCapacity() {
		return processorCapacity;
	}

	public String getHddName() {
		return hddName;
	}

	public int getHddCapacity() {
		return hddCapacity;
	}

	public String getRamName() {
		return ramName;
	}

	public int getRamCapacity() {
		return ramCapacity;
	}

	public String getBoarName() {
		return boarName;
	}

	public int getBoardCapacity() {
		return boardCapacity;
	}

	public String getScreenName() {
		return screenName;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public String getMouseName() {
		return mouseName;
	}

	public String getKeyboarName() {
		return keyboarName;
	}

	public static class Builder {

		private String processorName;
		private int processorCapacity;
		private String hddName;
		private int hddCapacity;
		private String ramName;
		private int ramCapacity;
		private String boarName;
		private int boardCapacity;
		private String screenName;
		private int screenSize;
		private String mouseName;
		private String keyboarName;

		public Builder setProcessorName(String processorName) {
			this.processorName = processorName;
			return this;
		}

		public Builder setProcessorCapacity(int processorCapacity) {
			this.processorCapacity = processorCapacity;
			return this;
		}

		public Builder setHddName(String hddName) {
			this.hddName = hddName;
			return this;
		}

		public Builder setHddCapacity(int hddCapacity) {
			this.hddCapacity = hddCapacity;
			return this;
		}

		public Builder setRamName(String ramName) {
			this.ramName = ramName;
			return this;
		}

		public Builder setRamCapacity(int ramCapacity) {
			this.ramCapacity = ramCapacity;
			return this;
		}

		public Builder setBoarName(String boarName) {
			this.boarName = boarName;
			return this;
		}

		public Builder setBoardCapacity(int boardCapacity) {
			this.boardCapacity = boardCapacity;
			return this;
		}

		public Builder setScreenName(String screenName) {
			this.screenName = screenName;
			return this;
		}

		public Builder setScreenSize(int screenSize) {
			this.screenSize = screenSize;
			return this;
		}

		public Builder setMouseName(String mouseName) {
			this.mouseName = mouseName;
			return this;
		}

		public Builder setKeyboarName(String keyboarName) {
			this.keyboarName = keyboarName;
			return this;
		}

		public Computer build() throws InvalidAlgorithmParameterException {
			if (processorName != null && processorCapacity != 0 && hddName != null && hddCapacity != 0
					&& ramName != null && ramCapacity != 0 && boarName != null && boardCapacity != 0
					&& screenName != null && screenSize != 0 && mouseName != null && keyboarName != null)
				return new Computer(this);
			else
				throw new InvalidAlgorithmParameterException("Falta tal parametro");
		}

	}

}
