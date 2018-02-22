package prob05;

public class MyBase extends Base {
	String state;
	
	@Override
	public void service(String state) {
		this.state = state;
		
		if(state.equals("낮") || state.equals("오후")) {			
			day();
			return;
		}
		night();
	}
	
	@Override
	public void day(){
		if(state.equals("낮")) {
			System.out.println("낮에는 열심히 일하자!");
			return;
		}
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
	
}