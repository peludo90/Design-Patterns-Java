package com.designpatterns.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void valuesTest() {
		Computer computer = new Computer.Builder().setProcessorName("Intel").setProcessorCapacity(4.5)
				.setBoarName("Asus").setBoardCapacity(64).setHddName("Adata").setHddCapacity(500).setRamName("Spartan")
				.setRamCapacity(2048).setScreenName("Samsung").setScreenSize(24).setKeyboarName("Logitech")
				.setMouseName("Logitech").build();

		assertEquals("Intel", computer.getProcessorName());
		assertEquals(4.5, computer.getProcessorCapacity(), 0);
		assertEquals("Asus", computer.getBoarName());
		assertEquals(64, computer.getBoardCapacity(), 0);
		assertEquals("Adata", computer.getHddName());
		assertEquals(500, computer.getHddCapacity(), 0);
		assertEquals("Spartan", computer.getRamName());
		assertEquals(2048, computer.getRamCapacity(), 0);
		assertEquals("Samsung", computer.getScreenName());
		assertEquals(24, computer.getScreenSize(), 0);
		assertEquals("Logitech", computer.getKeyboarName());
		assertEquals("Logitech", computer.getMouseName());

	}

	@Test(expected = IllegalStateException.class)
	public void ValuesNullParam() {
		Computer computer = new Computer.Builder().build();
		computer.getBoarName();
	}

}
