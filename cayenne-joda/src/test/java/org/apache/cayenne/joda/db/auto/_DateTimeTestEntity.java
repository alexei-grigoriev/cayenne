package org.apache.cayenne.joda.db.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.joda.time.DateTime;

/**
 * Class _DateTimeTestEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DateTimeTestEntity extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<DateTime> TIMESTAMP = new Property<DateTime>("timestamp");

    public void setTimestamp(DateTime timestamp) {
        writeProperty("timestamp", timestamp);
    }
    public DateTime getTimestamp() {
        return (DateTime)readProperty("timestamp");
    }

}
