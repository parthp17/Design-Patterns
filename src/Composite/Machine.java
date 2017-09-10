package Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Machine extends Component{
	List<Component> components;
	
	public Machine(List<Component> components) {
		this.components = components;
	}

	@Override
	public int getPrice() {
		return components.stream().map(i -> i.getPrice()).collect(Collectors.summingInt(Integer::intValue));
	}
	
}

class Device extends Component {
	List<Component> components;
	
	public Device(List<Component> components) {
		this.components = components;
	}

	@Override
	public int getPrice() {
		return components.stream().map(i -> i.getPrice()).collect(Collectors.summingInt(Integer::intValue));
	}
}

class Circuit extends Component {
	List<Component> components;
	
	public Circuit(List<Component> components) {
		this.components = components;
	}

	@Override
	public int getPrice() {
		return components.stream().map(i -> i.getPrice()).collect(Collectors.summingInt(Integer::intValue));
	}
}


class Main
{
	public static void main(String[] args) {
		
		List<Component> mbElements = new ArrayList<>();
		mbElements.add(new Resistors());
		mbElements.add(new Capacitors());
		mbElements.add(new Wires());
		List<Component> mmElements = new ArrayList<>();
		mmElements.add(new Resistors());
		mmElements.add(new Capacitors());
		mmElements.add(new Wires());
		mmElements.add(new Resistors());
		mmElements.add(new Capacitors());
		mmElements.add(new Wires());
		List<Component> cpuCircuits = new ArrayList<>();
		Circuit mb = new Circuit(mbElements);
		Circuit mm = new Circuit(mmElements);
		cpuCircuits.add(mb);
		cpuCircuits.add(mm);
		
		List<Component> ioCircuits = new ArrayList<>();
		Circuit io = new Circuit(mbElements);
		Circuit iom = new Circuit(mmElements);
		ioCircuits.add(io);
		ioCircuits.add(iom);
		
		Device cpu = new Device(cpuCircuits);
		Device ioDevice = new Device(ioCircuits);
		
		
		List<Component> parts = new ArrayList<>();
		parts.add(cpu);
		parts.add(ioDevice);
		
		Machine robot = new Machine(parts);
		
		System.out.println(robot.getPrice());
		
	}
}