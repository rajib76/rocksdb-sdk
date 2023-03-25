package org.example;

import org.ada.models.RocksDBRecord;
import org.ada.stores.RocksDBStore;
import org.rocksdb.RocksDBException;

public class GetAndPut {
    public static void main(String[] args) throws RocksDBException {
        RocksDBRecord record = new RocksDBRecord();
        record.setKey("KEY01");
        record.setValue("This is key 01");

        RocksDBStore publishStore = new RocksDBStore("pub01");
        publishStore.put(record);

        String value = publishStore.get("KEY01");
        System.out.println("The value is " + value);

    }
}