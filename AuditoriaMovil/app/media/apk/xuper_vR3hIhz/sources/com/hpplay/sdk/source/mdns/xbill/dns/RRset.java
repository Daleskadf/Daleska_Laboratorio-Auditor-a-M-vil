package com.hpplay.sdk.source.mdns.xbill.dns;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public class RRset implements Serializable {
    private static final long serialVersionUID = -3270249290171239695L;
    private short nsigs;
    private short position;
    private List rrs;

    public RRset() {
        this.rrs = new ArrayList(1);
        this.nsigs = (short) 0;
        this.position = (short) 0;
    }

    private synchronized Iterator iterator(boolean z10, boolean z11) {
        int i10;
        int i11;
        int size = this.rrs.size();
        if (z10) {
            i10 = size - this.nsigs;
        } else {
            i10 = this.nsigs;
        }
        if (i10 == 0) {
            return Collections.EMPTY_LIST.iterator();
        }
        if (z10) {
            if (!z11) {
                i11 = 0;
            } else {
                if (this.position >= i10) {
                    this.position = (short) 0;
                }
                i11 = this.position;
                this.position = (short) (i11 + 1);
            }
        } else {
            i11 = size - this.nsigs;
        }
        ArrayList arrayList = new ArrayList(i10);
        if (z10) {
            arrayList.addAll(this.rrs.subList(i11, i10));
            if (i11 != 0) {
                arrayList.addAll(this.rrs.subList(0, i11));
            }
        } else {
            arrayList.addAll(this.rrs.subList(i11, size));
        }
        return arrayList.iterator();
    }

    private String iteratorToString(Iterator it) {
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            stringBuffer.append("[");
            stringBuffer.append(((Record) it.next()).rdataToString());
            stringBuffer.append("]");
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    private void safeAddRR(Record record) {
        if (!(record instanceof RRSIGRecord)) {
            if (this.nsigs == 0) {
                this.rrs.add(record);
                return;
            }
            List list = this.rrs;
            list.add(list.size() - this.nsigs, record);
            return;
        }
        this.rrs.add(record);
        this.nsigs = (short) (this.nsigs + 1);
    }

    public synchronized void addRR(Record record) {
        if (this.rrs.size() == 0) {
            safeAddRR(record);
            return;
        }
        Record first = first();
        if (record.sameRRset(first)) {
            if (record.getTTL() != first.getTTL()) {
                if (record.getTTL() > first.getTTL()) {
                    record = record.cloneRecord();
                    record.setTTL(first.getTTL());
                } else {
                    for (int i10 = 0; i10 < this.rrs.size(); i10++) {
                        Record cloneRecord = ((Record) this.rrs.get(i10)).cloneRecord();
                        cloneRecord.setTTL(record.getTTL());
                        this.rrs.set(i10, cloneRecord);
                    }
                }
            }
            if (!this.rrs.contains(record)) {
                safeAddRR(record);
            }
            return;
        }
        throw new IllegalArgumentException("record does not match rrset");
    }

    public synchronized void clear() {
        this.rrs.clear();
        this.position = (short) 0;
        this.nsigs = (short) 0;
    }

    public synchronized void deleteRR(Record record) {
        if (this.rrs.remove(record) && (record instanceof RRSIGRecord)) {
            this.nsigs = (short) (this.nsigs - 1);
        }
    }

    public synchronized Record first() {
        if (this.rrs.size() != 0) {
        } else {
            throw new IllegalStateException("rrset is empty");
        }
        return (Record) this.rrs.get(0);
    }

    public int getDClass() {
        return first().getDClass();
    }

    public Name getName() {
        return first().getName();
    }

    public synchronized long getTTL() {
        return first().getTTL();
    }

    public int getType() {
        return first().getRRsetType();
    }

    public void release() {
        List list = this.rrs;
        if (list != null) {
            list.clear();
        }
    }

    public synchronized Iterator rrs(boolean z10) {
        return iterator(true, z10);
    }

    public synchronized Iterator sigs() {
        return iterator(false, false);
    }

    public synchronized int size() {
        return this.rrs.size() - this.nsigs;
    }

    public String toString() {
        if (this.rrs.size() == 0) {
            return "{empty}";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{ ");
        stringBuffer.append(getName() + " ");
        stringBuffer.append(getTTL() + " ");
        stringBuffer.append(DClass.string(getDClass()) + " ");
        stringBuffer.append(Type.string(getType()) + " ");
        stringBuffer.append(iteratorToString(iterator(true, false)));
        if (this.nsigs > 0) {
            stringBuffer.append(" sigs: ");
            stringBuffer.append(iteratorToString(iterator(false, false)));
        }
        stringBuffer.append(" }");
        return stringBuffer.toString();
    }

    public synchronized Iterator rrs() {
        return iterator(true, true);
    }

    public RRset(Record record) {
        this();
        safeAddRR(record);
    }

    public RRset(RRset rRset) {
        synchronized (rRset) {
            this.rrs = (List) ((ArrayList) rRset.rrs).clone();
            this.nsigs = rRset.nsigs;
            this.position = rRset.position;
        }
    }
}
