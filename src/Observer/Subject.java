package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	List<IObserver> list;
	Subject(){
		list = new ArrayList<>();
	}
	abstract void add(IObserver observer);
	abstract void remove(IObserver observer);
	abstract void doNotify(String update);
	public List<IObserver> getList() {
		return list;
	}
	public void setList(List<IObserver> list) {
		this.list = list;
	}
}