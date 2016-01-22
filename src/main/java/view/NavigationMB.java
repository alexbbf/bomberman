package view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class NavigationMB {

	public String gotoSecond() {
		return "pm:second";
	}
}
