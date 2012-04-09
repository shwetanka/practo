package com.practo.utils;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;

/**
 * Company: AcStack
 * User: Shwetanka
 * Date: Apr 7, 2012
 * Time: 12:20:18 PM
 */
public class HttpUtil {
  public static HttpClient client = new HttpClient();
  static {
    client.getState().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("shwetanka@gmail.com", "@myTest123"));
  }
  public static String getResponse(String url){
    HttpMethod method = new GetMethod(url);
    try {
      int status = client.executeMethod(method);
      if(status == HttpStatus.SC_OK){
        return method.getResponseBodyAsString();
      }
    }catch (HttpException he){
      System.out.println("Some error occurred"+he);
    }catch (IOException ie){
      System.out.println("Some error occurred"+ie);
    }finally {
      method.releaseConnection();
    }
    return null;
  }

  public static String getResponse(URL url) throws Exception{
    HttpURLConnection con;
    con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    con.setInstanceFollowRedirects(true);
//    Authenticator.setDefault(new Authenticator(){
//      @Override
//      protected PasswordAuthentication getPasswordAuthentication() {
//        return new PasswordAuthentication("shwetanka@gmail.com", "@myTest123".toCharArray());
//      }
//    });
    con.setRequestProperty("Authorization", "Basic "+ com.google.appengine.repackaged.com.google.common.util.Base64.encodeWebSafe("shwetanka@gmail.com:@myTest123".getBytes(), true));
    BufferedReader bf = new BufferedReader(new InputStreamReader(con.getInputStream()));
    String response = "";
    String str;
    while((str=bf.readLine())!=null){
      response+=str;
    }
    bf.close();
    return response;
  }

  public static void main(String arg[]){
    //System.out.println(getResponse("http://practo.zendesk.com/tickets/2.json"));
    try{
      URL url = new URL(Urls.OPEN_TICKETS_URL);
      String response = getResponse(url);
      System.out.println(response);
    }catch (Exception e){

    }
  }
}
