package cn.hnust;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBConnection b =new DBConnection();
			//String sql = "insert into student(id,name,age,dept,address) values('1507','Tom',20,'计算机','湖南')";
			
			//b.execute(sql);
			ResultSet rs = b.executeQuery("select * from data");
			
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				int  id = rs.getInt("id");
				String question = rs.getString("question");
				String  option1 = rs.getString("opt1");
				String option2 = rs.getString("opt2");
				String option3 = rs.getString("opt3");
				String option4 = rs.getString("opt4");
				String answer = rs.getString("answer");
				Question t = new Question(id, question, option1, option2, option3,option4,answer);
				list.add(t);
			}
			b.close();
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int randnumber = r.nextInt(list.size());
				int i=0;boolean ok=true;
				while(i<j)
				{
					if(randnumber==ques[i])
					{
						ok=false;
						break;
					}
					i++;
				}
				if(ok)
				{
					System.out.println(randnumber);
					//if not exist 
					ques[j] = randnumber;
					j++;
				}
				
			}
			
			for(int k=0;k<4;k++) {
				Question s = list.get(ques[k]);
				//System.out.println(s.getId());
				int num=k+1;
				System.out.println("第"+num+"题");
				System.out.println(s.getquestion());
				System.out.println(s.getoption1());
				System.out.println(s.getoption2());
				System.out.println(s.getoption3());
				System.out.println(s.getoption4());
				//System.out.println(s.getanswer());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
