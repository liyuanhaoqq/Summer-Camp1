package cn.hnust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import cn.hnust.DBConnection;

public class offerAns extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		String student_id = request.getParameter("id");
		System.out.println("id:" + student_id);
		
		try {
			/////////////
			//do search
			////////////
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from data");
			
			int id=0;
			String question="";
			String option1="";
			String option2="";
			String option3="";
			String option4="";
			String answer="";
			//if(!rs.next())System.out.print("error");
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				id=rs.getInt("id");
				question=rs.getString("question");
				option1=rs.getString("opt1");
				option2=rs.getString("opt2");
				option3=rs.getString("opt3");
				option4=rs.getString("opt4");
				answer=rs.getString("answer");
				Question q=new Question(id,question,option1,option2,option3,option4,answer);
				list.add(q);
			}
			db.close();
			//rs.close();
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			
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
					//System.out.println(randnumber);
					//if not exist 
					ques[j] = randnumber;
					j++;
				}
				
			}
			
			
			for(int i=0;i<4;i++)
			{
				JSONObject obj1=new JSONObject();
				Question q1=list.get(ques[i]);
				obj1.put("id",q1.id);
				obj1.put("question", q1.question);
				obj1.put("option1", q1.option1);
				obj1.put("option2",q1.option2);
				obj1.put("option3", q1.option3);
				obj1.put("option4", q1.option4);
				obj1.put("answer", q1.answer);
				int num=i+1;
				obj.put("question"+num, obj1);
			}
			
				
//				System.out.println("FGHJK");
			System.out.println(obj.toString());
			
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doSearch(String student_id) {
		try {
			
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from data");
			
			int id=0;
			String question="";
			String option1="";
			String option2="";
			String option3="";
			String option4="";
			String answer="";
			//if(!rs.next())System.out.print("error\n");
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				id=rs.getInt("id");
				question=rs.getString("question");
				option1=rs.getString("opt1");
				option2=rs.getString("opt2");
				option3=rs.getString("opt3");
				option4=rs.getString("opt4");
				answer=rs.getString("answer");
				Question q=new Question(id,question,option1,option2,option3,option4,answer);
				list.add(q);
			}
			db.close();
			JSONObject obj = new JSONObject();
			
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
					//System.out.println(randnumber);
					//if not exist 
					ques[j] = randnumber;
					j++;
				}
				
			}
			
			for(int i=0;i<4;i++)
			{
				JSONObject obj1=new JSONObject();
				Question q=list.get(ques[i]);
				obj1.put("id",q.id);
				obj1.put("question", q.question);
				obj1.put("option1", q.option1);
				obj1.put("option2",q.option2);
				obj1.put("option3", q.option3);
				obj1.put("option4", q.option4);
				obj1.put("answer", q.answer);
				int num=i+1;
				obj.put("question"+num, obj1);
			}
			
//				System.out.println("FGHJK");
			System.out.println(obj.toString());
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		doSearch("0");
	}

}
