package code;

public class LoginActivity implements ButtonClickListener {
	
	static Button button1 ;
	static EditText idEdt;
	public static void main(String[] args) {
		
//		버튼이 눌리면 => 에딧텍스트에 입력된 값을 출력.
		
		
		button1 = new Button();

		
//		ID를 입력받는 EditText 객체화
		

		
//		idEdt에 monaru1124라는 값을 입력.
		
		idEdt = new EditText();
		idEdt.setText("monaru1124");
		
//		실제로 버튼을 클릭!
		button1.click();
		
		
		
		
	} // main

//	버튼이 클릭되면 실행될 내용을 실질적으로 작성.
	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
		System.out.println(idEdt.getText());
		
		
	} // on click
}
