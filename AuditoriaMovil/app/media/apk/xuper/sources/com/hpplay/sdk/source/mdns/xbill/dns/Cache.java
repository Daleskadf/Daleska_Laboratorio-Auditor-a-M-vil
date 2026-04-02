package com.hpplay.sdk.source.mdns.xbill.dns;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class Cache {
    private static final int defaultMaxEntries = 50000;
    private CacheMap data;
    private int dclass;
    private int maxcache;
    private int maxncache;

    /* loaded from: classes3.dex */
    public static class CacheMap extends LinkedHashMap {
        private int maxsize;

        public CacheMap(int i10) {
            super(16, 0.75f, true);
            this.maxsize = i10;
        }

        public int getMaxSize() {
            return this.maxsize;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            if (this.maxsize >= 0 && size() > this.maxsize) {
                return true;
            }
            return false;
        }

        public void setMaxSize(int i10) {
            this.maxsize = i10;
        }
    }

    /* loaded from: classes3.dex */
    public interface Element {
        int compareCredibility(int i10);

        boolean expired();

        int getType();
    }

    /* loaded from: classes3.dex */
    public static class NegativeElement implements Element {
        int credibility;
        int expire;
        Name name;
        int type;

        public NegativeElement(Name name, int i10, SOARecord sOARecord, int i11, long j10) {
            long j11;
            this.name = name;
            this.type = i10;
            if (sOARecord != null) {
                j11 = sOARecord.getMinimum();
            } else {
                j11 = 0;
            }
            this.credibility = i11;
            this.expire = Cache.limitExpire(j11, j10);
        }

        @Override // com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element
        public final int compareCredibility(int i10) {
            return this.credibility - i10;
        }

        @Override // com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element
        public final boolean expired() {
            if (((int) (System.currentTimeMillis() / 1000)) >= this.expire) {
                return true;
            }
            return false;
        }

        @Override // com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element
        public int getType() {
            return this.type;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.type == 0) {
                stringBuffer.append("NXDOMAIN " + this.name);
            } else {
                stringBuffer.append("NXRRSET " + this.name + " " + Type.string(this.type));
            }
            stringBuffer.append(" cl = ");
            stringBuffer.append(this.credibility);
            return stringBuffer.toString();
        }
    }

    public Cache(int i10) {
        this.maxncache = -1;
        this.maxcache = -1;
        this.dclass = i10;
        this.data = new CacheMap(defaultMaxEntries);
    }

    private synchronized void addElement(Name name, Element element) {
        V v10 = this.data.get(name);
        if (v10 == 0) {
            this.data.put(name, element);
            return;
        }
        int type = element.getType();
        if (v10 instanceof List) {
            List list = (List) v10;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((Element) list.get(i10)).getType() == type) {
                    list.set(i10, element);
                    return;
                }
            }
            list.add(element);
        } else {
            Element element2 = (Element) v10;
            if (element2.getType() == type) {
                this.data.put(name, element);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(element2);
                linkedList.add(element);
                this.data.put(name, linkedList);
            }
        }
    }

    private synchronized Element[] allElements(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            return (Element[]) list.toArray(new Element[list.size()]);
        }
        return new Element[]{(Element) obj};
    }

    private synchronized Object exactName(Name name) {
        return this.data.get(name);
    }

    private synchronized Element findElement(Name name, int i10, int i11) {
        Object exactName = exactName(name);
        if (exactName == null) {
            return null;
        }
        return oneElement(name, exactName, i10, i11);
    }

    private RRset[] findRecords(Name name, int i10, int i11) {
        SetResponse lookupRecords = lookupRecords(name, i10, i11);
        if (lookupRecords.isSuccessful()) {
            return lookupRecords.answers();
        }
        return null;
    }

    private final int getCred(int i10, boolean z10) {
        if (i10 == 1) {
            if (z10) {
                return 4;
            }
            return 3;
        } else if (i10 == 2) {
            if (z10) {
                return 4;
            }
            return 3;
        } else if (i10 == 3) {
            return 1;
        } else {
            throw new IllegalArgumentException("getCred: invalid section");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int limitExpire(long j10, long j11) {
        if (j11 >= 0 && j11 < j10) {
            j10 = j11;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + j10;
        if (currentTimeMillis >= 0 && currentTimeMillis <= TTL.MAX_VALUE) {
            return (int) currentTimeMillis;
        }
        return Integer.MAX_VALUE;
    }

    private static void markAdditional(RRset rRset, Set set) {
        if (rRset.first().getAdditionalName() == null) {
            return;
        }
        Iterator rrs = rRset.rrs();
        while (rrs.hasNext()) {
            Name additionalName = ((Record) rrs.next()).getAdditionalName();
            if (additionalName != null) {
                set.add(additionalName);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r2.getType() == r7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element oneElement(com.hpplay.sdk.source.mdns.xbill.dns.Name r5, java.lang.Object r6, int r7, int r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 255(0xff, float:3.57E-43)
            if (r7 == r0) goto L4a
            boolean r0 = r6 instanceof java.util.List     // Catch: java.lang.Throwable -> L48
            r1 = 0
            if (r0 == 0) goto L24
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L48
            r0 = 0
        Ld:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L48
            if (r0 < r2) goto L14
            goto L2e
        L14:
            java.lang.Object r2 = r6.get(r0)     // Catch: java.lang.Throwable -> L48
            com.hpplay.sdk.source.mdns.xbill.dns.Cache$Element r2 = (com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element) r2     // Catch: java.lang.Throwable -> L48
            int r3 = r2.getType()     // Catch: java.lang.Throwable -> L48
            if (r3 != r7) goto L21
            goto L2f
        L21:
            int r0 = r0 + 1
            goto Ld
        L24:
            r2 = r6
            com.hpplay.sdk.source.mdns.xbill.dns.Cache$Element r2 = (com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element) r2     // Catch: java.lang.Throwable -> L48
            int r6 = r2.getType()     // Catch: java.lang.Throwable -> L48
            if (r6 != r7) goto L2e
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 != 0) goto L33
            monitor-exit(r4)
            return r1
        L33:
            boolean r6 = r2.expired()     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L3e
            r4.removeElement(r5, r7)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)
            return r1
        L3e:
            int r5 = r2.compareCredibility(r8)     // Catch: java.lang.Throwable -> L48
            if (r5 >= 0) goto L46
            monitor-exit(r4)
            return r1
        L46:
            monitor-exit(r4)
            return r2
        L48:
            r5 = move-exception
            goto L52
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "oneElement(ANY)"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L48
            throw r5     // Catch: java.lang.Throwable -> L48
        L52:
            monitor-exit(r4)
            goto L55
        L54:
            throw r5
        L55:
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.sdk.source.mdns.xbill.dns.Cache.oneElement(com.hpplay.sdk.source.mdns.xbill.dns.Name, java.lang.Object, int, int):com.hpplay.sdk.source.mdns.xbill.dns.Cache$Element");
    }

    private synchronized void removeElement(Name name, int i10) {
        V v10 = this.data.get(name);
        if (v10 == 0) {
            return;
        }
        if (v10 instanceof List) {
            List list = (List) v10;
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((Element) list.get(i11)).getType() == i10) {
                    list.remove(i11);
                    if (list.size() == 0) {
                        this.data.remove(name);
                    }
                    return;
                }
            }
        } else if (((Element) v10).getType() == i10) {
            this.data.remove(name);
        }
    }

    private synchronized void removeName(Name name) {
        this.data.remove(name);
    }

    public SetResponse addMessage(Message message) {
        SOARecord sOARecord;
        SetResponse setResponse;
        boolean flag = message.getHeader().getFlag(5);
        Record question = message.getQuestion();
        int rcode = message.getHeader().getRcode();
        boolean check = Options.check("verbosecache");
        if ((rcode != 0 && rcode != 3) || question == null) {
            return null;
        }
        Name name = question.getName();
        int type = question.getType();
        int dClass = question.getDClass();
        HashSet hashSet = new HashSet();
        int i10 = 1;
        RRset[] sectionRRsets = message.getSectionRRsets(1);
        SetResponse setResponse2 = null;
        Name name2 = name;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < sectionRRsets.length) {
            if (sectionRRsets[i11].getDClass() == dClass) {
                int type2 = sectionRRsets[i11].getType();
                Name name3 = sectionRRsets[i11].getName();
                int cred = getCred(i10, flag);
                if ((type2 == type || type == 255) && name3.equals(name2)) {
                    addRRset(sectionRRsets[i11], cred);
                    if (name2 == name) {
                        if (setResponse2 == null) {
                            setResponse = new SetResponse(6);
                        } else {
                            setResponse = setResponse2;
                        }
                        setResponse.addRRset(sectionRRsets[i11]);
                        setResponse2 = setResponse;
                    }
                    markAdditional(sectionRRsets[i11], hashSet);
                    z10 = true;
                } else if (type2 == 5 && name3.equals(name2)) {
                    addRRset(sectionRRsets[i11], cred);
                    if (name2 == name) {
                        setResponse2 = new SetResponse(4, sectionRRsets[i11]);
                    }
                    name2 = ((CNAMERecord) sectionRRsets[i11].first()).getTarget();
                } else if (type2 == 39 && name2.subdomain(name3)) {
                    addRRset(sectionRRsets[i11], cred);
                    if (name2 == name) {
                        setResponse2 = new SetResponse(5, sectionRRsets[i11]);
                    }
                    try {
                        name2 = name2.fromDNAME((DNAMERecord) sectionRRsets[i11].first());
                    } catch (Exception unused) {
                    }
                }
                i11++;
                i10 = 1;
            }
            i11++;
            i10 = 1;
        }
        int i12 = 2;
        RRset[] sectionRRsets2 = message.getSectionRRsets(2);
        RRset rRset = null;
        RRset rRset2 = null;
        for (int i13 = 0; i13 < sectionRRsets2.length; i13++) {
            if (sectionRRsets2[i13].getType() == 6 && name2.subdomain(sectionRRsets2[i13].getName())) {
                rRset2 = sectionRRsets2[i13];
            } else if (sectionRRsets2[i13].getType() == 2 && name2.subdomain(sectionRRsets2[i13].getName())) {
                rRset = sectionRRsets2[i13];
            }
        }
        if (!z10) {
            if (rcode == 3) {
                type = 0;
            }
            if (rcode != 3 && rRset2 == null && rRset != null) {
                addRRset(rRset, getCred(2, flag));
                markAdditional(rRset, hashSet);
                if (setResponse2 == null) {
                    setResponse2 = new SetResponse(3, rRset);
                }
            } else {
                int cred2 = getCred(2, flag);
                if (rRset2 != null) {
                    sOARecord = (SOARecord) rRset2.first();
                } else {
                    sOARecord = null;
                }
                addNegative(name2, type, sOARecord, cred2);
                if (setResponse2 == null) {
                    if (rcode == 3) {
                        i12 = 1;
                    }
                    setResponse2 = SetResponse.ofType(i12);
                }
            }
        } else if (rcode == 0 && rRset != null) {
            addRRset(rRset, getCred(2, flag));
            markAdditional(rRset, hashSet);
        }
        SetResponse setResponse3 = setResponse2;
        RRset[] sectionRRsets3 = message.getSectionRRsets(3);
        for (int i14 = 0; i14 < sectionRRsets3.length; i14++) {
            int type3 = sectionRRsets3[i14].getType();
            if ((type3 == 1 || type3 == 28 || type3 == 38) && hashSet.contains(sectionRRsets3[i14].getName())) {
                addRRset(sectionRRsets3[i14], getCred(3, flag));
            }
        }
        if (check) {
            System.out.println("addMessage: " + setResponse3);
        }
        return setResponse3;
    }

    public synchronized void addNegative(Name name, int i10, SOARecord sOARecord, int i11) {
        long ttl;
        if (sOARecord != null) {
            ttl = sOARecord.getTTL();
        } else {
            ttl = 0;
        }
        Element findElement = findElement(name, i10, 0);
        if (ttl == 0) {
            if (findElement != null && findElement.compareCredibility(i11) <= 0) {
                removeElement(name, i10);
            }
        } else {
            if (findElement != null && findElement.compareCredibility(i11) <= 0) {
                findElement = null;
            }
            if (findElement == null) {
                addElement(name, new NegativeElement(name, i10, sOARecord, i11, this.maxncache));
            }
        }
    }

    public synchronized void addRRset(RRset rRset, int i10) {
        CacheRRset cacheRRset;
        long ttl = rRset.getTTL();
        Name name = rRset.getName();
        int type = rRset.getType();
        Element findElement = findElement(name, type, 0);
        if (ttl == 0) {
            if (findElement != null && findElement.compareCredibility(i10) <= 0) {
                removeElement(name, type);
            }
        } else {
            if (findElement != null && findElement.compareCredibility(i10) <= 0) {
                findElement = null;
            }
            if (findElement == null) {
                if (rRset instanceof CacheRRset) {
                    cacheRRset = (CacheRRset) rRset;
                } else {
                    cacheRRset = new CacheRRset(rRset, i10, this.maxcache);
                }
                addElement(name, cacheRRset);
            }
        }
    }

    public synchronized void addRecord(Record record, int i10, Object obj) {
        Name name = record.getName();
        int rRsetType = record.getRRsetType();
        if (!Type.isRR(rRsetType)) {
            return;
        }
        Element findElement = findElement(name, rRsetType, i10);
        if (findElement == null) {
            addRRset(new CacheRRset(record, i10, this.maxcache), i10);
        } else if (findElement.compareCredibility(i10) == 0 && (findElement instanceof CacheRRset)) {
            ((CacheRRset) findElement).addRR(record);
        }
    }

    public synchronized void clearCache() {
        this.data.clear();
    }

    public int getDClass() {
        return this.dclass;
    }

    public int getMaxCache() {
        return this.maxcache;
    }

    public int getSize() {
        return this.data.size();
    }

    public synchronized SetResponse lookup(Name name, int i10, int i11) {
        boolean z10;
        boolean z11;
        Name name2;
        Element[] allElements;
        int labels = name.labels();
        for (int i12 = labels; i12 >= 1; i12--) {
            if (i12 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i12 == labels) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                name2 = Name.root;
            } else if (z11) {
                name2 = name;
            } else {
                name2 = new Name(name, labels - i12);
            }
            Object obj = this.data.get(name2);
            if (obj != null) {
                if (z11 && i10 == 255) {
                    SetResponse setResponse = new SetResponse(6);
                    int i13 = 0;
                    for (Element element : allElements(obj)) {
                        if (element.expired()) {
                            removeElement(name2, element.getType());
                        } else if ((element instanceof CacheRRset) && element.compareCredibility(i11) >= 0) {
                            setResponse.addRRset((CacheRRset) element);
                            i13++;
                        }
                    }
                    if (i13 > 0) {
                        return setResponse;
                    }
                } else if (z11) {
                    Element oneElement = oneElement(name2, obj, i10, i11);
                    if (oneElement != null && (oneElement instanceof CacheRRset)) {
                        SetResponse setResponse2 = new SetResponse(6);
                        setResponse2.addRRset((CacheRRset) oneElement);
                        return setResponse2;
                    } else if (oneElement != null) {
                        return new SetResponse(2);
                    } else {
                        Element oneElement2 = oneElement(name2, obj, 5, i11);
                        if (oneElement2 != null && (oneElement2 instanceof CacheRRset)) {
                            return new SetResponse(4, (CacheRRset) oneElement2);
                        }
                    }
                } else {
                    Element oneElement3 = oneElement(name2, obj, 39, i11);
                    if (oneElement3 != null && (oneElement3 instanceof CacheRRset)) {
                        return new SetResponse(5, (CacheRRset) oneElement3);
                    }
                }
                Element oneElement4 = oneElement(name2, obj, 2, i11);
                if (oneElement4 != null && (oneElement4 instanceof CacheRRset)) {
                    return new SetResponse(3, (CacheRRset) oneElement4);
                } else if (z11 && oneElement(name2, obj, 0, i11) != null) {
                    return SetResponse.ofType(1);
                }
            }
        }
        return SetResponse.ofType(0);
    }

    public SetResponse lookupRecords(Name name, int i10, int i11) {
        return lookup(name, i10, i11);
    }

    public void release() {
        CacheMap cacheMap = this.data;
        if (cacheMap != null) {
            cacheMap.clear();
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this) {
            for (V v10 : this.data.values()) {
                for (Element element : allElements(v10)) {
                    stringBuffer.append(element);
                    stringBuffer.append("\n");
                }
            }
        }
        return stringBuffer.toString();
    }

    /* loaded from: classes3.dex */
    public class CacheRRset extends RRset implements Element {
        private static final long serialVersionUID = 5971755205903597024L;
        int credibility;
        int expire;

        public CacheRRset(Record record, int i10, long j10) {
            this.credibility = i10;
            this.expire = Cache.limitExpire(record.getTTL(), j10);
            addRR(record);
        }

        @Override // com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element
        public final int compareCredibility(int i10) {
            return this.credibility - i10;
        }

        @Override // com.hpplay.sdk.source.mdns.xbill.dns.Cache.Element
        public final boolean expired() {
            if (((int) (System.currentTimeMillis() / 1000)) >= this.expire) {
                return true;
            }
            return false;
        }

        @Override // com.hpplay.sdk.source.mdns.xbill.dns.RRset
        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.toString());
            stringBuffer.append(" cl = ");
            stringBuffer.append(this.credibility);
            return stringBuffer.toString();
        }

        public CacheRRset(RRset rRset, int i10, long j10) {
            super(rRset);
            this.credibility = i10;
            this.expire = Cache.limitExpire(rRset.getTTL(), j10);
        }
    }

    public Cache() {
        this(1);
    }

    public Cache(String str) {
        this.maxncache = -1;
        this.maxcache = -1;
        this.data = new CacheMap(defaultMaxEntries);
        Master master = new Master(str);
        while (true) {
            Record nextRecord = master.nextRecord();
            if (nextRecord == null) {
                return;
            }
            addRecord(nextRecord, 0, master);
        }
    }
}
