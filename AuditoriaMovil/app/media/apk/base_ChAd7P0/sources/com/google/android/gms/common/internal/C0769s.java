package com.google.android.gms.common.internal;

import j$.util.concurrent.ConcurrentHashMap;
import org.apache.tika.utils.StringUtils;
/* renamed from: com.google.android.gms.common.internal.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769s {

    /* renamed from: b  reason: collision with root package name */
    public static final C0765n f9386b = new C0765n("LibraryVersion", StringUtils.EMPTY);

    /* renamed from: c  reason: collision with root package name */
    public static final C0769s f9387c = new C0769s();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f9388a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "LibraryVersion"
            com.google.android.gms.common.internal.n r1 = com.google.android.gms.common.internal.C0769s.f9386b
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.lang.String r3 = "/"
            java.lang.String r4 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.I.f(r11, r4)
            j$.util.concurrent.ConcurrentHashMap r4 = r10.f9388a
            boolean r5 = r4.containsKey(r11)
            if (r5 == 0) goto L1c
            java.lang.Object r11 = r4.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1c:
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            r7.<init>(r3)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            r7.append(r11)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            java.lang.String r3 = ".properties"
            r7.append(r3)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            java.lang.String r3 = r7.toString()     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            java.lang.Class<com.google.android.gms.common.internal.s> r7 = com.google.android.gms.common.internal.C0769s.class
            java.io.InputStream r3 = r7.getResourceAsStream(r3)     // Catch: java.io.IOException -> L8f java.lang.Throwable -> L92
            if (r3 == 0) goto L70
            r5.load(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = "version"
            java.lang.String r6 = r5.getProperty(r7, r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r11)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = " version is "
            r5.append(r7)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = r1.f9383a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r8 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            if (r7 == 0) goto La7
            java.lang.String r5 = r1.c(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            android.util.Log.v(r0, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            goto La7
        L69:
            r11 = move-exception
            goto L8d
        L6b:
            r5 = move-exception
            r9 = r6
            r6 = r3
            r3 = r9
            goto L95
        L70:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r11)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = r1.f9383a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r8 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            if (r7 == 0) goto La7
            java.lang.String r5 = r1.c(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            goto La7
        L8d:
            r6 = r3
            goto Lc6
        L8f:
            r3 = move-exception
            r5 = r3
            goto L94
        L92:
            r11 = move-exception
            goto Lc6
        L94:
            r3 = r6
        L95:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L92
            r7.append(r11)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L92
            r1.a(r5, r0, r2)     // Catch: java.lang.Throwable -> L92
            r9 = r6
            r6 = r3
            r3 = r9
        La7:
            if (r3 == 0) goto Lac
            r3.close()     // Catch: java.io.IOException -> Lac
        Lac:
            if (r6 != 0) goto Lc2
            java.lang.String r2 = r1.f9383a
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto Lc0
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r1 = r1.c(r2)
            android.util.Log.d(r0, r1)
        Lc0:
            java.lang.String r6 = "UNKNOWN"
        Lc2:
            r4.put(r11, r6)
            return r6
        Lc6:
            if (r6 == 0) goto Lcb
            r6.close()     // Catch: java.io.IOException -> Lcb
        Lcb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C0769s.a(java.lang.String):java.lang.String");
    }
}
