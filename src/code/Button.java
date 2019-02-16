package code;

public class Button {

//	 눌린다! 라는 기능만 있으면 됨!
	ButtonClickListener bcl;
	
	public void click() {
		
//		클릭 메소드 처리를 버튼클릭리스너 역할을 수행하는 클래스에게 넘긴다!.
		bcl.onClick();
	}
	
	public void setButtonClickListener(ButtonClickListener inputBcl) {
		
//		누군가가 처리대행을 자원하면 그 역활을 받아드리는 역할.
		
		this.bcl = inputBcl;
	}
}
