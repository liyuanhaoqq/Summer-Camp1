package cn.hnust.wechat;

import org.json.JSONException; 
import org.json.JSONObject; 

public class MenuSetting {

	public static String appId = "wx2efbdc881ce70b09";
    public static String appSecret= "e9cdd9afe807c488b2c88c169a298c8d"; 
    
	public static void main(String[] args) throws JSONException {
		add();
		//delete();
	}

    public static String getAccessToken() throws JSONException{
        NetWorkHelper netHelper = new NetWorkHelper();
        String Url = String.format("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s",appId,appSecret);
        String result = netHelper.getHttpsResponse(Url,"");
        System.out.println(result);
        //JSONObject json = JSONObject.fromObject(result);
        JSONObject json = new JSONObject(result);
        return  json.getString("access_token");
    }
    
    public static void delete() throws JSONException{
    		String s = getAccessToken();
        NetWorkHelper netHelper = new NetWorkHelper();
        String Url = String.format("https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=%s", s);
        String result = netHelper.getHttpsResponse(Url,"");
        System.out.println(result);
    }
    
    public static void add() throws JSONException{
    		String s = getAccessToken();
        NetWorkHelper netHelper = new NetWorkHelper();
        String json = "{"
        		+ "\"button\":["
        		+ "{"
        		+ "\"name\":\"Ȥζ����\","
        		+ "\"sub_button\":["
        		+ "{"	
                + "\"type\":\"view\","
                + "\"name\":\"��ʼ����\","
                + "\"url\":\"http://j74htv.natappfree.cc/aw/qa.html\""
                + "}]"
        		+ "},"
        		+ "{"
        		+ "\"name\":\"�ҵ�����\","
        		+ "\"sub_button\":["
        		+ "{"	
                + "\"type\":\"view\","
                + "\"name\":\"��������\","
                + "\"url\":\"http://www.hnust.cn\""
             	+ "},"
             	 + "{"
                 + "\"type\":\"view\","
                 + "\"name\":\"�༶����\","
                 + "\"url\":\"http://www.hnust.cn\""
              	+ "},"
             	+ "{"
                + "\"type\":\"view\","
                + "\"name\":\"����\","
                + "\"url\":\"http://www.hnust.cn\""
             	+ "}]"
        		+ "},"
        		+ "{"
        		+ "\"name\":\"��������\","
        		+ "\"sub_button\":["
        		+ "{"	
                + "\"type\":\"view\","
                + "\"name\":\"������\","
                + "\"url\":\"http://www.hnust.cn/\""
                + "},"
             	+ "{"
                + "\"type\":\"view\","
                + "\"name\":\"��ϵ��\","
                + "\"url\":\"http://www.hnust.cn/\""
             	+ "}]"
        		+ "}]"
        		+ "}";
        System.out.println(json);
         
        String Url = String.format("https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s", s);      
        String result = netHelper.getHttpsResponsePostBody(Url, "POST", json);
        System.out.println(result);
    }
    
}

