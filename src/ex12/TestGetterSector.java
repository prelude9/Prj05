package ex12;

class Emp {
	// field는 앞에 private! 
	private int eno;
	private String name;
	private String phone; 
	
	
	public Emp(int eno, String name, String phone) {
		this.eno = eno;
		this.name = name;
		this.phone = phone;
	}
	//alt+shift+s 	
	//getter, setter 함수: 형태 함수, get으로 시작하면 getter, set으로 시작하면 setter
	//목적: private 변수들을 저정하고 출력할 수 있게 

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public int getEno() {
		return eno;
	}
	public void setEno(int eno) { // 중간에 if를 넣어서 입력 데이터를 관리할 수 있음 
		this.eno = eno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//method 
	void info() {
		System.out.printf("%d  %s    %s",
				           eno, name, phone);
	}

}
public class TestGetterSector {

	public static void main(String[] args) {
		Emp emp1 = new Emp(); // emp라는 명령어를 쓰면 직원 이름과 연락처를 출력해준다 
     // emp1.eno = 1; >> 필드 앞에 private이 있으면 접근 제한이 걸려서 'eno' 부분에 오류 발생하고 getter, setter 함수 만들어 줘야 한다. 
		                 // private을 쓰면, 생성자를 쓰거나 get을 써서 쓸 수 있다. 
		emp1.setEno(1);
		emp1.setName("장원영");
		emp1.setPhone("010-1111-1111");
		emp1.info();
				
		System.out.println("");
	// int neweno = emp1.getEno();
    // System.out.println(neweno);
	    
	    Emp emp2 = new Emp(2, "카리나", "010-1111-1111");
	    emp2.info();
	}

}
