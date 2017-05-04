/**
 *
 */
package org.mule.modules.dbsplunk;

import java.util.HashMap;
import java.util.Map;

import com.splunk.HttpService;
import com.splunk.SSLSecurityProtocol;
import com.splunk.Service;
import com.splunk.ServiceArgs;

public class main {
	
	
	public static void main(String[] args){
		 Map <String,Object> connectionArgs = new HashMap<String,Object>();

	    	ServiceArgs loginArgs = new ServiceArgs();
	    HttpService.setSslSecurityProtocol(SSLSecurityProtocol.TLSv1_2);
	        connectionArgs.put("host", "127.0.0.1");
	        connectionArgs.put("username", "admin");
	        connectionArgs.put("password", "maresca");
	        connectionArgs.put("port", 8089);
	        connectionArgs.put("scheme", "https");
	        Service splunkService = Service.connect(connectionArgs);
	        System.out.println(splunkService.getApplications().toString());
	}

}
