package code;

public class LoginActivity implements ButtonClickListener{

	static Button button1;
	static EditText idEdt;
	
	public static void main(String[] args) {
//		버튼이 눌리면 => 에딧텍스트에 입력된 값을 출력
		
		button1 = new Button();
		
		button1.click();
		
		idEdt = new EditText();
		
//		idEdt에 shairyu이라는 값을 입력.
		idEdt.setText("shairyu");
		
//		실제로 버튼을 클릭한다
		button1.click();
	}

//	버튼이 클릭되면 실행될 내용을 실질적으로 작성.
	@Override
	public void onClick() {
		
		System.out.println(idEdt.getText());
		
	}
}
