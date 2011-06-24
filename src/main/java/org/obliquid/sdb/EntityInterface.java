package org.obliquid.sdb;

import java.net.ConnectException;

/**
 * Common interface for Persistence Entities
 * 
 * @author stivlo
 * 
 */
public interface EntityInterface {

    void setPersistenceHelper(final PersistenceInterface persistenceHelper);

    void save() throws ConnectException;

    void delete() throws ConnectException;

}
