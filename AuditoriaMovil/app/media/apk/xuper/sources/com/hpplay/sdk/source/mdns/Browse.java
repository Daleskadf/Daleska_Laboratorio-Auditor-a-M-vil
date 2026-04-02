package com.hpplay.sdk.source.mdns;

import com.hpplay.sdk.source.mdns.xbill.dns.Message;
import com.hpplay.sdk.source.mdns.xbill.dns.Name;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes3.dex */
public class Browse extends MulticastDNSLookupBase {
    public static final String TAG = "MDNSBrowse";
    protected List<BrowseOperation> browseOperations;

    public Browse() {
        this.browseOperations = new LinkedList();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        for (BrowseOperation browseOperation : this.browseOperations) {
            try {
                browseOperation.release();
            } catch (Exception unused) {
            }
        }
        this.browseOperations.clear();
    }

    public String getErrorMsg() {
        try {
            if (this.browseOperations.size() <= 0) {
                return null;
            }
            String str = null;
            for (BrowseOperation browseOperation : this.browseOperations) {
                str = browseOperation.getErrorMsg();
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    public synchronized void start(DNSSDListener dNSSDListener) {
        try {
            if (dNSSDListener != null) {
                Message[] messageArr = this.queries;
                if (messageArr != null && messageArr.length != 0) {
                    BrowseOperation browseOperation = new BrowseOperation(null, this.queries, this.querier, this.dclass);
                    browseOperation.setDNSSDListener(dNSSDListener);
                    this.browseOperations.add(browseOperation);
                    browseOperation.start();
                } else {
                    throw new NullPointerException("Error sending asynchronous query, No queries specified!");
                }
            } else {
                throw new NullPointerException("Error sending asynchronous query, listener is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Browse(Name... nameArr) {
        super(nameArr);
        this.browseOperations = new LinkedList();
    }

    public Browse(Name[] nameArr, int i10) {
        super(nameArr, i10);
        this.browseOperations = new LinkedList();
    }

    public Browse(Name[] nameArr, int i10, int i11) {
        super(nameArr, i10, i11);
        this.browseOperations = new LinkedList();
    }

    public Browse(Message message) {
        super(message);
        this.browseOperations = new LinkedList();
    }

    public Browse(String... strArr) {
        super(strArr);
        this.browseOperations = new LinkedList();
    }

    public Browse(String[] strArr, int i10) {
        super(strArr, i10);
        this.browseOperations = new LinkedList();
    }

    public Browse(String[] strArr, int i10, int i11) {
        super(strArr, i10, i11);
        this.browseOperations = new LinkedList();
    }
}
