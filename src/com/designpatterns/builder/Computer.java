package com.designpatterns.builder;

import java.security.InvalidAlgorithmParameterException;
import java.util.MissingFormatArgumentException;

public class Computer {

	private String processorName;
	private double processorCapacity;
	private String hddName;
	private double hddCapacity;
	private String ramName;
	private double ramCapacity;
	private String boarName;
	private double boardCapacity;
	private String screenName;
	private double screenSize;
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

	public double getProcessorCapacity() {
		return processorCapacity;
	}

	public String getHddName() {
		return hddName;
	}

	public double getHddCapacity() {
		return hddCapacity;
	}

	public String getRamName() {
		return ramName;
	}

	public double getRamCapacity() {
		return ramCapacity;
	}

	public String getBoarName() {
		return boarName;
	}

	public double getBoardCapacity() {
		return boardCapacity;
	}

	public String getScreenName() {
		return screenName;
	}

	public double getScreenSize() {
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
		private double processorCapacity;
		private String hddName;
		private double hddCapacity;
		private String ramName;
		private double ramCapacity;
		private String boarName;
		private double boardCapacity;
		private String screenName;
		private double screenSize;
		private String mouseName;
		private String keyboarName;

		public Builder setProcessorName(String processorName) {
			this.processorName = processorName;
			return this;
		}

		public Builder setProcessorCapacity(double processorCapacity) {
			this.processorCapacity = processorCapacity;
			return this;
		}

		public Builder setHddName(String hddName) {
			this.hddName = hddName;
			return this;
		}

		public Builder setHddCapacity(double hddCapacity) {
			this.hddCapacity = hddCapacity;
			return this;
		}

		public Builder setRamName(String ramName) {
			this.ramName = ramName;
			return this;
		}

		public Builder setRamCapacity(double ramCapacity) {
			this.ramCapacity = ramCapacity;
			return this;
		}

		public Builder setBoarName(String boarName) {
			this.boarName = boarName;
			return this;
		}

		public Builder setBoardCapacity(double boardCapacity) {
			this.boardCapacity = boardCapacity;
			return this;
		}

		public Builder setScreenName(String screenName) {
			this.screenName = screenName;
			return this;
		}

		public Builder setScreenSize(double screenSize) {
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

		public Computer build() {
			if (processorName == null) {
				throw new IllegalStateException("Falta el parámetro: processorName");
			} else if (processorCapacity == 0) {
				throw new IllegalStateException("Falta el parámetro: processorCapacity");
			} else if (hddName == null) {
				throw new IllegalStateException("Falta el parámetro: hddName");
			} else if (hddCapacity == 0) {
				throw new IllegalStateException("Falta el parámetro: hddCapacity");
			} else if (ramName == null) {
				throw new IllegalStateException("Falta el parámetro: ramName");
			} else if (ramCapacity == 0) {
				throw new IllegalStateException("Falta el parámetro: ramCapacity");
			} else if (boarName == null) {
				throw new IllegalStateException("Falta el parámetro: boarName");
			} else if (boardCapacity == 0) {
				throw new IllegalStateException("Falta el parámetro: boardCapacity");
			} else if (screenName == null) {
				throw new IllegalStateException("Falta el parámetro: screenName");
			} else if (screenSize == 0) {
				throw new IllegalStateException("Falta el parámetro: screenSize");
			} else if (mouseName == null) {
				throw new IllegalStateException("Falta el parámetro: mouseName");
			} else if (keyboarName == null) {
				throw new IllegalStateException("Falta el parámetro: keyboarName");
			} else {
				return new Computer(this);
			}

		}

	}

}
