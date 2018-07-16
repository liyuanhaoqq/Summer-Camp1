package cn.hnust;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DBTest2 {

	public static void main(int args) {
		try {
			DBConnection b =new DBConnection();
			String sql = "insert into person_rank(name,score,rank) values('1507',"+args+",'1')";
			
			b.execute(sql);
			
			b.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
