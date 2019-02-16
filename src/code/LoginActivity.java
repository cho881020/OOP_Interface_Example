package code;

public class LoginActivity implements ButtonClickListener {
	
	Button button1;
	EditText idEdt;
	
	public void runSceinario() {
		
//		버튼이 눌리면 => 에딧텍스트에 입력된 값을 출력
		
		button1 = new Button();
		
		button1.click();
		
//		데이터(id)를 입력받는 EditText를 객체화
		
		idEdt = new EditText();
		
//		idEdt에 6muse이라는 값을 입력
		idEdt.setTest("6muse");
		
		button1.setButtonClickListener(this);
		
//		실제로 버튼을 클릭!
		button1.click();
		
	}
	
//	버튼이 클릭되면 실행될 내용을 실질적으로 작성.
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
		System.out.println(idEdt.getText());
		
	}

}
