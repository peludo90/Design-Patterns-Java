package com.designpatterns.adapter;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AdapterTest {

	private static RobotAttacker robot;
	private static RobotAttackerAdapter robotAdapter;
	private static TankAttaker tank;

	@BeforeClass
	public static void beforeClass() {
		robot = new RobotAttacker();
		robotAdapter = new RobotAttackerAdapter(robot);
		tank = new TankAttaker();
	}

	@Test
	public void simplePrintingTest() {

		System.out.println("Robot");
		System.out.println(robot.hit());
		System.out.println(robot.kick());
		System.out.println(robot.move());
		System.out.println(robot.smashHuman("Stan"));
		System.out.println("Tank");
		System.out.println(tank.fireWeapon());
		System.out.println(tank.move());
		System.out.println(tank.assignDriver("Steve"));
		System.out.println("Robot adapter");
		System.out.println(robotAdapter.fireWeapon());
		System.out.println(robotAdapter.move());
		System.out.println(robotAdapter.assignDriver("Dave"));
	}

	@Test
	public void verifyAdapterTest() {

		assertEquals(robot.move(), robotAdapter.move());
		assertEquals(robot.smashHuman("Dave"), robotAdapter.assignDriver("Dave"));
	}

}
