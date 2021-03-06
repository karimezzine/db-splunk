
package org.mule.modules.dbsplunk.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.dbsplunk.DbSplunkConnector;


/**
 * A <code>DbSplunkConnectorMetadataAdapter</code> is a wrapper around {@link DbSplunkConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-05-04T04:59:08+01:00", comments = "Build UNNAMED.2793.f49b6c7")
public class DbSplunkConnectorMetadataAdapter
    extends DbSplunkConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "DbSplunk";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.9.0";
    private final static String DEVKIT_BUILD = "UNNAMED.2793.f49b6c7";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
