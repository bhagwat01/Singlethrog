package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class EmployeeConsumer {

	public static void main(String[] args) {
       String url="http://localhost:2018/EmployeeProvider/rest/ceaget/bivi/101/sagar/HVPMCOET";
       
       Client ctr=Client.create();
       
       WebResource wr=ctr.resource(url);
       ClientResponse res=wr.get(ClientResponse.class);
       
       String str=res.getEntity(String.class);
       
       System.out.println(str);
       System.out.println(res.getStatus());

	}

}
