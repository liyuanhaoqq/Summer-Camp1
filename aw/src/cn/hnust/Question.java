package cn.hnust;

public class Question {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getquestion() {
		return question;
	}

	public void setquestion(String question) {
		this.question = question;
	}

	public String getoption1() {
		return option1;
	}

	public void setoption1(String option1) {
		this.option1 = option1;
	}
	public String getoption2() {
		return option2;
	}

	public void setoption2(String option2) {
		this.option2 = option2;
	}
	public String getoption3() {
		return option3;
	}

	public void setoption3(String option3) {
		this.option3 = option3;
	}
	public String getoption4() {
		return option4;
	}

	public void setoption4(String option4) {
		this.option1 = option4;
	}

	public String getanswer() {
		return answer;
	}

	public void setDept(String answer) {
		this.answer = answer;
	}

	

	public int id;
	public String question;
	public String option1;
	public String option2;
	public String option3;
	public String option4;
	public String answer;
	
	public Question() {
		
	}
	public Question(int id, 
			String question,String option1,String option2,String option3,String option4,  
			String answer) {
		this.id = id;
		this.question=question;
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.option4=option4;
		this.answer = answer;
	}
	public static void main(String[] args) {
		

	}

}
