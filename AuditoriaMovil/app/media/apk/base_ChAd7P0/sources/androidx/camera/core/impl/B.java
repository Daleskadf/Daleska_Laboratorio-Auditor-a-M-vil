package androidx.camera.core.impl;

import D.AbstractC0059i;
import D.InterfaceC0065o;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import w.C1936u;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f7525a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final Object f7526b;

    /* renamed from: c  reason: collision with root package name */
    public int f7527c;

    /* renamed from: d  reason: collision with root package name */
    public final B.a f7528d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f7529e;
    public int f;

    public B(B.a aVar) {
        Object obj = new Object();
        this.f7526b = obj;
        this.f7529e = new HashMap();
        this.f7527c = 1;
        synchronized (obj) {
            this.f7528d = aVar;
            this.f = this.f7527c;
        }
    }

    public static void c(C1936u c1936u, EnumC0520w enumC0520w) {
        if (F.f.w()) {
            F.f.z(enumC0520w.ordinal(), "CX:State[" + c1936u + "]");
        }
    }

    public final A a(String str) {
        HashMap hashMap = this.f7529e;
        for (InterfaceC0065o interfaceC0065o : hashMap.keySet()) {
            if (str.equals(interfaceC0065o.a().c())) {
                return (A) hashMap.get(interfaceC0065o);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        boolean D4 = org.slf4j.helpers.i.D("CameraStateRegistry");
        StringBuilder sb = this.f7525a;
        if (D4) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i7 = 0;
        for (Map.Entry entry : this.f7529e.entrySet()) {
            if (org.slf4j.helpers.i.D("CameraStateRegistry")) {
                if (((A) entry.getValue()).f7521a != null) {
                    str = ((A) entry.getValue()).f7521a.toString();
                } else {
                    str = "UNKNOWN";
                }
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0065o) entry.getKey()).toString(), str));
            }
            EnumC0520w enumC0520w = ((A) entry.getValue()).f7521a;
            if (enumC0520w != null && enumC0520w.a()) {
                i7++;
            }
        }
        if (org.slf4j.helpers.i.D("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(AbstractC0059i.y("Open count: ", i7, " (Max allowed: ", this.f7527c, ")"));
            org.slf4j.helpers.i.l("CameraStateRegistry", sb.toString());
        }
        this.f = Math.max(this.f7527c - i7, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:12:0x0036, B:15:0x0067, B:17:0x006b, B:19:0x006f, B:27:0x0084, B:29:0x008c, B:33:0x0097, B:35:0x00ab, B:36:0x00ae, B:26:0x007d), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:12:0x0036, B:15:0x0067, B:17:0x006b, B:19:0x006f, B:27:0x0084, B:29:0x008c, B:33:0x0097, B:35:0x00ab, B:36:0x00ae, B:26:0x007d), top: B:40:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(w.C1936u r12) {
        /*
            r11 = this;
            java.lang.String r0 = "tryOpenCamera("
            java.lang.String r1 = " --> "
            java.lang.Object r2 = r11.f7526b
            monitor-enter(r2)
            java.util.HashMap r3 = r11.f7529e     // Catch: java.lang.Throwable -> L65
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L65
            androidx.camera.core.impl.A r3 = (androidx.camera.core.impl.A) r3     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "Camera must first be registered with registerCamera()"
            g0.c.f(r3, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "CameraStateRegistry"
            boolean r4 = org.slf4j.helpers.i.D(r4)     // Catch: java.lang.Throwable -> L65
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L67
            java.lang.StringBuilder r4 = r11.f7525a     // Catch: java.lang.Throwable -> L65
            r4.setLength(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r4 = r11.f7525a     // Catch: java.lang.Throwable -> L65
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            int r7 = r11.f     // Catch: java.lang.Throwable -> L65
            androidx.camera.core.impl.w r8 = r3.f7521a     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L35
            boolean r8 = r8.a()     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L35
            r8 = r5
            goto L36
        L35:
            r8 = r6
        L36:
            androidx.camera.core.impl.w r9 = r3.f7521a     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L65
            r10.append(r12)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ") [Available Cameras: "
            r10.append(r0)     // Catch: java.lang.Throwable -> L65
            r10.append(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ", Already Open: "
            r10.append(r0)     // Catch: java.lang.Throwable -> L65
            r10.append(r8)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = " (Previous state: "
            r10.append(r0)     // Catch: java.lang.Throwable -> L65
            r10.append(r9)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ")]"
            r10.append(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L65
            r4.append(r0)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r12 = move-exception
            goto Lb0
        L67:
            int r0 = r11.f     // Catch: java.lang.Throwable -> L65
            if (r0 > 0) goto L7d
            androidx.camera.core.impl.w r0 = r3.f7521a     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L77
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L77
            r0 = r5
            goto L78
        L77:
            r0 = r6
        L78:
            if (r0 == 0) goto L7b
            goto L7d
        L7b:
            r5 = r6
            goto L84
        L7d:
            androidx.camera.core.impl.w r0 = androidx.camera.core.impl.EnumC0520w.OPENING     // Catch: java.lang.Throwable -> L65
            r3.f7521a = r0     // Catch: java.lang.Throwable -> L65
            c(r12, r0)     // Catch: java.lang.Throwable -> L65
        L84:
            java.lang.String r12 = "CameraStateRegistry"
            boolean r12 = org.slf4j.helpers.i.D(r12)     // Catch: java.lang.Throwable -> L65
            if (r12 == 0) goto La9
            java.lang.StringBuilder r12 = r11.f7525a     // Catch: java.lang.Throwable -> L65
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L95
            java.lang.String r0 = "SUCCESS"
            goto L97
        L95:
            java.lang.String r0 = "FAIL"
        L97:
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L65
            r12.append(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = "CameraStateRegistry"
            java.lang.StringBuilder r0 = r11.f7525a     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L65
            org.slf4j.helpers.i.l(r12, r0)     // Catch: java.lang.Throwable -> L65
        La9:
            if (r5 == 0) goto Lae
            r11.b()     // Catch: java.lang.Throwable -> L65
        Lae:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
            return r5
        Lb0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.B.d(w.u):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7526b
            monitor-enter(r0)
            B.a r1 = r5.f7528d     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.f223a     // Catch: java.lang.Throwable -> Ld
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r6 = move-exception
            goto L55
        Lf:
            androidx.camera.core.impl.A r6 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            if (r6 == 0) goto L19
            androidx.camera.core.impl.w r6 = r6.f7521a     // Catch: java.lang.Throwable -> Ld
            goto L1a
        L19:
            r6 = r1
        L1a:
            if (r7 == 0) goto L21
            androidx.camera.core.impl.A r7 = r5.a(r7)     // Catch: java.lang.Throwable -> Ld
            goto L22
        L21:
            r7 = r1
        L22:
            if (r7 == 0) goto L26
            androidx.camera.core.impl.w r1 = r7.f7521a     // Catch: java.lang.Throwable -> Ld
        L26:
            androidx.camera.core.impl.w r7 = androidx.camera.core.impl.EnumC0520w.OPEN     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r7.equals(r6)     // Catch: java.lang.Throwable -> Ld
            r4 = 0
            if (r2 != 0) goto L3a
            androidx.camera.core.impl.w r2 = androidx.camera.core.impl.EnumC0520w.CONFIGURED     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r2.equals(r6)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L38
            goto L3a
        L38:
            r6 = r4
            goto L3b
        L3a:
            r6 = r3
        L3b:
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L4c
            androidx.camera.core.impl.w r7 = androidx.camera.core.impl.EnumC0520w.CONFIGURED     // Catch: java.lang.Throwable -> Ld
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L4a
            goto L4c
        L4a:
            r7 = r4
            goto L4d
        L4c:
            r7 = r3
        L4d:
            if (r6 == 0) goto L52
            if (r7 == 0) goto L52
            goto L53
        L52:
            r3 = r4
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.B.e(java.lang.String, java.lang.String):boolean");
    }
}
