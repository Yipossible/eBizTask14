package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Action;

public class CustomerMonitorAction extends Action{
	public String getName() {return "customerMonitor.do";}
	
	public String perform(HttpServletRequest request, HttpServletResponse response) {
		return "customerMonitor.jsp";
	}
}
