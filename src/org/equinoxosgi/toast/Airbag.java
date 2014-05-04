package org.equinoxosgi.toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 导入到本地
 * @author bbfking
 *
 */
public class Airbag {
	private List listeners;
	public Airbag(){
		super();
		listeners = new ArrayList();
	}
	public synchronized void addListener(IAirbagListener listener){
		listeners.add(listener);
	}
	public synchronized void deploy(){
		for(Iterator i = listeners.iterator(); i.hasNext();){
			((IAirbagListener) i.next()).deployed();
		}
	}
	public synchronized void removeListener(IAirbagListener listener){
		listeners.remove(listener);
	}
}
