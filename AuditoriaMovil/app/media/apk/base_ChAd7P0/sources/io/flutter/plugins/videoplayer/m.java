package io.flutter.plugins.videoplayer;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class m implements L5.g {

    /* renamed from: a  reason: collision with root package name */
    public L5.h f12417a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f12418b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12419c = false;

    public final void a() {
        if (this.f12417a == null) {
            return;
        }
        ArrayList arrayList = this.f12418b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof k) {
                this.f12417a.a();
            } else if (next instanceof l) {
                l lVar = (l) next;
                this.f12417a.b(lVar.f12414a, lVar.f12415b, lVar.f12416c);
            } else {
                this.f12417a.c(next);
            }
        }
        arrayList.clear();
    }

    public final void b(Object obj) {
        if (!this.f12419c) {
            this.f12418b.add(obj);
        }
        a();
    }
}
