package com.google.firebase;

import A.i;
import A4.a;
import A4.b;
import F.f;
import U3.h;
import X5.E;
import Y1.y;
import android.content.Context;
import android.os.Build;
import c4.C0632a;
import c4.j;
import c4.r;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import v4.c;
import v4.d;
import v4.e;
import v4.g;
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        y b5 = C0632a.b(b.class);
        b5.c(new j(2, 0, a.class));
        b5.f = new i(2);
        arrayList.add(b5.d());
        r rVar = new r(V3.a.class, Executor.class);
        y yVar = new y(c.class, new Class[]{e.class, g.class});
        yVar.c(j.b(Context.class));
        yVar.c(j.b(h.class));
        yVar.c(new j(2, 0, d.class));
        yVar.c(new j(1, 1, b.class));
        yVar.c(new j(rVar, 1, 0));
        yVar.f = new E(rVar, 23);
        arrayList.add(yVar.d());
        arrayList.add(f.i("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(f.i("fire-core", "21.0.0"));
        arrayList.add(f.i("device-name", a(Build.PRODUCT)));
        arrayList.add(f.i("device-model", a(Build.DEVICE)));
        arrayList.add(f.i("device-brand", a(Build.BRAND)));
        arrayList.add(f.o("android-target-sdk", new P0.b(21)));
        arrayList.add(f.o("android-min-sdk", new P0.b(22)));
        arrayList.add(f.o("android-platform", new P0.b(23)));
        arrayList.add(f.o("android-installer", new P0.b(24)));
        try {
            l6.b.f13863b.getClass();
            str = "1.9.24";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(f.i("kotlin", str));
        }
        return arrayList;
    }
}
