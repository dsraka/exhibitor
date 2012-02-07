package com.netflix.exhibitor.index;

import org.apache.jute.Record;
import org.apache.zookeeper.txn.TxnHeader;

public interface LogEntryReceiver
{
    public void     receiveEntry(TxnHeader header, Record record) throws Exception;
}
