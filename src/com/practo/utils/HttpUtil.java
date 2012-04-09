package com.practo.utils;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.IOException;

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


  public static void main(String arg[]){
    System.out.println(getResponse("http://practo.zendesk.com/tickets/2.json"));
  }
}
