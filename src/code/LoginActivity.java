package code;

public class LoginActivity implements ButtonClickListner {
	
	static Button button1;
	static EditText idEdt
	
	public static void main(String[] args) {
		
		
//	 버튼이 눌리면 => 에디텍스트에 입력된 값을 출력
		
		button1 = new Button();
					
				
		idEdt = new EditText();
		
		idEdt.setText("ksi");
		
	}

	
//	버튼이 클릭되면 실행될 내용을 실질적으로 작성.
	@Override
	public void onClick() {
	// TODO Auto-generated method stub
		System.out.println(idEdt.getText());
		
		
	}

}
