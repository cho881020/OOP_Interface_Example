package code;

public class Button {
	
//	눌린다! 기능만. (메쏘드)
	
	ButtonClickListener bcl;
	
	public void click() {

//		클릭 메쏘드 처리를 버튼클릭리스너 역할을 수행하는 클래스에게 넘긴다!
		bcl.onClick();
		
	}

}
