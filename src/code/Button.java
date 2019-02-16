package code;

public class Button {

//	TODO - 눌린다! 기능만. (메쏘드)
	
	ButtonClickListener bcl;
	
	public void click() {
		
//		클릭 메쏘드 처리를 버튼클릭리스너 역할을 수행하는 클래스에게 넘긴다!
		bcl.onClick();

	}
	
	public void setButtonClickListner(ButtonClickListener inputBcl) {
		
//		누군가 처리 대행을 자원하면, 그 역할을 받아들임.
		
		this.bcl = inputBcl;
				
	}
	
	
}
