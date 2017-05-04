
package org.mule.modules.dbsplunk.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.dbsplunk.DbSplunkConnector;


/**
 * A <code>DbSplunkConnectorCapabilitiesAdapter</code> is a wrapper around {@link DbSplunkConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-05-04T02:29:24+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class DbSplunkConnectorCapabilitiesAdapter
    extends DbSplunkConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
