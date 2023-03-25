// Author: Rajib Deb
// Date:18-Mar-2023
// Purpose: This interface has the required operations for RocksDB.
package org.ada.interfaces;

import org.ada.models.RocksDBRecord;
import org.rocksdb.RocksDBException;

public interface DBInterface {
    String kvStoreName = "";


    //void put(byte[] key, String value) throws RocksDBException;


    //public void put(byte[] key, String value) throws RocksDBException {
    void put(RocksDBRecord record) throws RocksDBException;

    String get(String key) throws RocksDBException;


}
