package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class de {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("ExtractorSessionStoreView");
    private final bh b;
    private final co c;
    private final Map d = new HashMap();
    private final ReentrantLock e = new ReentrantLock();
    private final com.google.android.play.core.assetpacks.internal.aq f;
    private final com.google.android.play.core.assetpacks.internal.aq g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public de(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, co coVar, com.google.android.play.core.assetpacks.internal.aq aqVar2) {
        this.b = bhVar;
        this.f = aqVar;
        this.c = coVar;
        this.g = aqVar2;
    }

    private final db q(int i) {
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        db dbVar = (db) map.get(valueOf);
        if (dbVar != null) {
            return dbVar;
        }
        throw new ck(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    private final Object r(dd ddVar) {
        try {
            this.e.lock();
            return ddVar.a();
        } finally {
            this.e.unlock();
        }
    }

    private static String s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new ck("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    private static List t(List list) {
        return list == null ? Collections.emptyList() : list;
    }

    private final Map u(final List list) {
        return (Map) r(new dd() { // from class: com.google.android.play.core.assetpacks.cv
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return de.this.i(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return true;
        }
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return true;
        }
        db dbVar = (db) this.d.get(valueOf);
        if (dbVar.c.d == 6) {
            return false;
        }
        return Boolean.valueOf(!bg.c(dbVar.c.d, bundle.getInt(com.google.android.play.core.assetpacks.model.b.a(NotificationCompat.CATEGORY_STATUS, s(bundle)))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean b(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return false;
        }
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        boolean z = true;
        if (!map.containsKey(valueOf)) {
            String s = s(bundle);
            long j = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", s));
            String string = bundle.getString(com.google.android.play.core.assetpacks.model.b.a("pack_version_tag", s), "");
            int i2 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a(NotificationCompat.CATEGORY_STATUS, s));
            long j2 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", s));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(com.google.android.play.core.assetpacks.model.b.a("slice_ids", s));
            ArrayList arrayList = new ArrayList();
            for (String str : t(stringArrayList)) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", s, str));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : t(parcelableArrayList)) {
                    if (intent == null) {
                        z = false;
                    }
                    arrayList2.add(new cz(z));
                    z = true;
                }
                String string2 = bundle.getString(com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", s, str));
                long j3 = bundle.getLong(com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", s, str));
                int i3 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.b("patch_format", s, str), 0);
                arrayList.add(i3 != 0 ? new dc(str, string2, j3, arrayList2, 0, i3) : new dc(str, string2, j3, arrayList2, bundle.getInt(com.google.android.play.core.assetpacks.model.b.b("compression_format", s, str), 0), 0));
                z = true;
            }
            this.d.put(Integer.valueOf(i), new db(i, bundle.getInt("app_version_code"), new da(s, j, i2, j2, arrayList, string)));
        } else {
            db q = q(i);
            int i4 = bundle.getInt(com.google.android.play.core.assetpacks.model.b.a(NotificationCompat.CATEGORY_STATUS, q.c.a));
            da daVar = q.c;
            int i5 = daVar.d;
            if (bg.c(i5, i4)) {
                a.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i5));
                da daVar2 = q.c;
                int i6 = daVar2.d;
                String str2 = daVar2.a;
                if (i6 == 4) {
                    ((y) this.f.a()).h(i, str2);
                } else if (i6 == 5) {
                    ((y) this.f.a()).i(i);
                } else if (i6 == 6) {
                    ((y) this.f.a()).e(Arrays.asList(str2));
                }
            } else {
                daVar.d = i4;
                if (bg.d(i4)) {
                    n(i);
                    this.c.c(q.c.a);
                } else {
                    for (dc dcVar : daVar.f) {
                        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", q.c.a, dcVar.a));
                        if (parcelableArrayList2 != null) {
                            for (int i7 = 0; i7 < parcelableArrayList2.size(); i7++) {
                                if (parcelableArrayList2.get(i7) != null && ((Intent) parcelableArrayList2.get(i7)).getData() != null) {
                                    ((cz) dcVar.d.get(i7)).a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object c(String str, int i, long j) {
        db dbVar = (db) u(Arrays.asList(str)).get(str);
        if (dbVar == null || bg.d(dbVar.c.d)) {
            a.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.b.E(str, i, j);
        dbVar.c.d = 4;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object d(int i, int i2) {
        q(i).c.d = 5;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object e(int i) {
        db q = q(i);
        da daVar = q.c;
        if (!bg.d(daVar.d)) {
            throw new ck(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        this.b.E(daVar.a, q.b, daVar.b);
        da daVar2 = q.c;
        int i2 = daVar2.d;
        if (i2 == 5 || i2 == 6) {
            this.b.F(daVar2.a, q.b, daVar2.b);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map f(final List list) {
        return (Map) r(new dd() { // from class: com.google.android.play.core.assetpacks.cu
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return de.this.h(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map g() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map h(List list) {
        Map u = u(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final db dbVar = (db) u.get(str);
            if (dbVar == null) {
                hashMap.put(str, 8);
            } else {
                da daVar = dbVar.c;
                if (bg.a(daVar.d)) {
                    try {
                        daVar.d = 6;
                        ((Executor) this.g.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.cx
                            @Override // java.lang.Runnable
                            public final void run() {
                                de.this.n(dbVar.a);
                            }
                        });
                        this.c.c(str);
                    } catch (ck unused) {
                        a.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(dbVar.a), str);
                    }
                }
                hashMap.put(str, Integer.valueOf(dbVar.c.d));
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map i(List list) {
        HashMap hashMap = new HashMap();
        for (db dbVar : this.d.values()) {
            String str = dbVar.c.a;
            if (list.contains(str)) {
                db dbVar2 = (db) hashMap.get(str);
                if ((dbVar2 == null ? -1 : dbVar2.a) < dbVar.a) {
                    hashMap.put(str, dbVar);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.e.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(final String str, final int i, final long j) {
        r(new dd() { // from class: com.google.android.play.core.assetpacks.cs
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                de.this.c(str, i, j);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        this.e.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(final int i, int i2) {
        r(new dd(i, 5) { // from class: com.google.android.play.core.assetpacks.ct
            public final /* synthetic */ int b;

            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                de.this.d(this.b, 5);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(final int i) {
        r(new dd() { // from class: com.google.android.play.core.assetpacks.cr
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                de.this.e(i);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o(final Bundle bundle) {
        return ((Boolean) r(new dd() { // from class: com.google.android.play.core.assetpacks.cy
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return de.this.a(bundle);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p(final Bundle bundle) {
        return ((Boolean) r(new dd() { // from class: com.google.android.play.core.assetpacks.cw
            @Override // com.google.android.play.core.assetpacks.dd
            public final Object a() {
                return de.this.b(bundle);
            }
        })).booleanValue();
    }
}
