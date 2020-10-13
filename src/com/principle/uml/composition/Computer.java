package com.principle.uml.composition;

/**
 * 组合关系
 * 部分与整体不可分割
 */
public class Computer {
	private Mouse mouse = new Mouse();
	private Monitor monitor = new Monitor();

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
}
