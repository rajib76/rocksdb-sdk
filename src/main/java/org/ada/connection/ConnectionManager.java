// Author: Rajib Deb
// Date:18-Mar-2023
// Purpose: This module is the connection manager for RocksDB. It creates the RocksDB container
// in the local drive
package org.ada.connection;

import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class ConnectionManager {
    /**
     * This method takes the local drive path as a parameter and creates an empty DB
     * in that pah
     */
    public static RocksDB getConnection(String dbPath) {
        RocksDB rocksDB = null;
        try (final Options options = new Options().setCreateIfMissing(true)) {
            try {
                /**
                 * Initializing the database
                 */
                rocksDB = RocksDB.open(options, dbPath);
                System.out.println("Connected");
            } catch (RocksDBException e) {
                e.printStackTrace();
            }
        }
        return rocksDB;
    }

}
