
package org.mule.modules.dbsplunk.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.dbsplunk.DbSplunkConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>DbSplunkConnectorProcessAdapter</code> is a wrapper around {@link DbSplunkConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-05-04T02:29:24+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class DbSplunkConnectorProcessAdapter
    extends DbSplunkConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<DbSplunkConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, DbSplunkConnectorCapabilitiesAdapter> getProcessTemplate() {
        final DbSplunkConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,DbSplunkConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, DbSplunkConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, DbSplunkConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
