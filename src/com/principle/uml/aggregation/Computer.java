package com.principle.uml.aggregation;

/**
 * 聚合关系
 * 整体与部分可以分开
 */
public class Computer {
	private Mouse mouse;//鼠标可以与computer分开
	private Monitor monitor;//显示器可以与computer分开，满足整体与部分可以分开

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
}
