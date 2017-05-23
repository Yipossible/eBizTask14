package databean;



import javax.servlet.http.HttpServletRequest;

import controller.Action;

public class CustomerMonitorAction extends Action{
	public String getName() {return "customerMonitor.do";}
	
	public String perform(HttpServletRequest request) {
		
		
		
		
		return "customerMonitor.jsp";
	}
}
