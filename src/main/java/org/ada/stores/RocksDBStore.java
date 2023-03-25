package org.ada.stores;

import org.ada.connection.ConnectionManager;
import org.ada.interfaces.DBInterface;
import org.ada.models.RocksDBRecord;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class RocksDBStore implements DBInterface {

    public RocksDB rocksDb;

    public RocksDBStore(String kvStoreName) {
        ConnectionManager connManager = new ConnectionManager();
        RocksDB rocksDb = connManager.getConnection("./" + kvStoreName + "/");
        this.rocksDb = rocksDb;
    }

    @Override
    public void put(RocksDBRecord record) throws RocksDBException {
        byte[] key = record.getKey().getBytes();
        byte[] value = record.getValue().getBytes();
        this.rocksDb.put(key, value);
        System.out.println("Implement the put logic");

    }

    @Override
    public String get(String key) throws RocksDBException {
        String value = new String(this.rocksDb.get(key.getBytes()));
        return value;

    }
}
