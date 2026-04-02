package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public m f11949a;

    /* renamed from: b  reason: collision with root package name */
    public w f11950b;

    /* renamed from: c  reason: collision with root package name */
    public Long f11951c;

    /* renamed from: d  reason: collision with root package name */
    public Long f11952d;

    public final ArrayList a() {
        Integer valueOf;
        ArrayList arrayList = new ArrayList(4);
        m mVar = this.f11949a;
        ArrayList arrayList2 = null;
        if (mVar == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(mVar.index);
        }
        arrayList.add(valueOf);
        w wVar = this.f11950b;
        if (wVar != null) {
            arrayList2 = wVar.b();
        }
        arrayList.add(arrayList2);
        arrayList.add(this.f11951c);
        arrayList.add(this.f11952d);
        return arrayList;
    }
}
