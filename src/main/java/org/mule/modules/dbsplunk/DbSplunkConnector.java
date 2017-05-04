/**
 *
 */
package org.mule.modules.dbsplunk;

import java.io.IOException;
import java.net.ConnectException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.lifecycle.OnException;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.modules.dbsplunk.config.ConnectorConfig;
import org.mule.modules.dbsplunk.error.ErrorHandler;
import org.slf4j.LoggerFactory;

import com.splunk.*;
@Connector(name="db-splunk", friendlyName="DbSplunk")
@OnException(handler=ErrorHandler.class)
public class DbSplunkConnector {

    @Config
    ConnectorConfig config;

    private  Service splunkService ;
    

   private void connect() throws ConnectException{
	   Map <String,Object> connectionArgs = new HashMap<String,Object>();

   	ServiceArgs loginArgs = new ServiceArgs();
   	  HttpService.setSslSecurityProtocol(SSLSecurityProtocol.TLSv1_2);
   	 
   	connectionArgs.put("host", config.getHost());
       connectionArgs.put("username", config.getUsername());
       connectionArgs.put("password", config.getPassword());
       connectionArgs.put("port", config.getPort());
       connectionArgs.put("scheme", "https");
        splunkService = Service.connect(connectionArgs);  
   }
    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     * @throws ConnectException 
     */
   	@ReconnectOn(exceptions = {ConnectException.class})
	@Processor
    public void addDataToIndex(String index,String data) throws ConnectException{
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
         /* end comment for overriding the method setSslSecurityProtocol */
		connect();
		Index myIndex=splunkService.getIndexes().get(index);
		 Args eventArgs = new Args();
		 eventArgs.put("sourcetype", "log");
		 eventArgs.put("host","mule server");
		 myIndex.submit(eventArgs, data);

		
  
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    

}