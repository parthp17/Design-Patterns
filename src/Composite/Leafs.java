package Composite;

class Resistors extends Component{

	@Override
	public int getPrice() {
		return 2;
	}
}

class Capacitors extends Component{
	
	@Override
	public int getPrice() {
		return 5;
	}
}

class Wires extends Component{
	
	@Override
	public int getPrice() {
		return 10;
	}
}