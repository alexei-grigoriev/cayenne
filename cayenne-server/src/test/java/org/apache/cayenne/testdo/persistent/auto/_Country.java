package org.apache.cayenne.testdo.persistent.auto;

import org.apache.cayenne.PersistentObject;
import org.apache.cayenne.ValueHolder;
import org.apache.cayenne.testdo.persistent.Continent;

/**
 * A generated persistent class mapped as "Country" Cayenne entity. It is a good idea to
 * avoid changing this class manually, since it will be overwritten next time code is
 * regenerated. If you need to make any customizations, put them in a subclass.
 */
public abstract class _Country extends PersistentObject {

    public static final String NAME_PROPERTY = "name";
    public static final String CONTINENT_PROPERTY = "continent";

    protected String name;
    protected ValueHolder continent;

    public String getName() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "name", false);
        }

        return name;
    }
    public void setName(String name) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "name", false);
        }

        Object oldValue = this.name;
        this.name = name;

        // notify objectContext about simple property change
        if(objectContext != null) {
            objectContext.propertyChanged(this, "name", oldValue, name);
        }
    }

    public Continent getContinent() {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "continent", true);
        }

        return (Continent) continent.getValue();
    }
    public void setContinent(Continent continent) {
        if(objectContext != null) {
            objectContext.prepareForAccess(this, "continent", true);
        }

        this.continent.setValue(continent);
    }

}
