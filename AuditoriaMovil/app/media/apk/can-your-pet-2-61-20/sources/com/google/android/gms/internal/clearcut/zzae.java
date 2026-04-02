package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;
/* loaded from: classes3.dex */
public abstract class zzae<T> {
    private static final Object zzdn = new Object();
    private static boolean zzdo = false;
    private static volatile Boolean zzdp;
    private static volatile Boolean zzdq;
    private static Context zzh;
    private final zzao zzdr;
    final String zzds;
    private final String zzdt;
    private final T zzdu;
    private T zzdv;
    private volatile zzab zzdw;
    private volatile SharedPreferences zzdx;

    private zzae(zzao zzaoVar, String str, T t) {
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        Uri uri2;
        this.zzdv = null;
        this.zzdw = null;
        this.zzdx = null;
        str2 = zzaoVar.zzef;
        if (str2 == null) {
            uri2 = zzaoVar.zzeg;
            if (uri2 == null) {
                throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            }
        }
        str3 = zzaoVar.zzef;
        if (str3 != null) {
            uri = zzaoVar.zzeg;
            if (uri != null) {
                throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            }
        }
        this.zzdr = zzaoVar;
        str4 = zzaoVar.zzeh;
        String valueOf = String.valueOf(str4);
        String valueOf2 = String.valueOf(str);
        this.zzdt = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        str5 = zzaoVar.zzei;
        String valueOf3 = String.valueOf(str5);
        String valueOf4 = String.valueOf(str);
        this.zzds = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        this.zzdu = t;
    }

    public /* synthetic */ zzae(zzao zzaoVar, String str, Object obj, zzai zzaiVar) {
        this(zzaoVar, str, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0020 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:34:0x0007, B:36:0x000d, B:43:0x001c, B:45:0x0020, B:46:0x0023, B:47:0x0025, B:39:0x0014), top: B:53:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void maybeInit(android.content.Context r3) {
        /*
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.zzh
            if (r0 != 0) goto L2d
            java.lang.Object r0 = com.google.android.gms.internal.clearcut.zzae.zzdn
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2a
            r2 = 24
            if (r1 < r2) goto L14
            boolean r1 = androidx.print.PrintHelper$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L14
            goto L1c
        L14:
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r3 = r1
        L1c:
            android.content.Context r1 = com.google.android.gms.internal.clearcut.zzae.zzh     // Catch: java.lang.Throwable -> L2a
            if (r1 == r3) goto L23
            r1 = 0
            com.google.android.gms.internal.clearcut.zzae.zzdp = r1     // Catch: java.lang.Throwable -> L2a
        L23:
            com.google.android.gms.internal.clearcut.zzae.zzh = r3     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            com.google.android.gms.internal.clearcut.zzae.zzdo = r3
            goto L2d
        L2a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r3
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzae.maybeInit(android.content.Context):void");
    }

    public static <T> zzae<T> zza(zzao zzaoVar, String str, T t, zzan<T> zzanVar) {
        return new zzal(zzaoVar, str, t, zzanVar);
    }

    public static zzae<String> zza(zzao zzaoVar, String str, String str2) {
        return new zzak(zzaoVar, str, str2);
    }

    public static zzae<Boolean> zza(zzao zzaoVar, String str, boolean z) {
        return new zzaj(zzaoVar, str, Boolean.valueOf(z));
    }

    private static <V> V zza(zzam<V> zzamVar) {
        try {
            return zzamVar.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzamVar.zzp();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static boolean zza(String str, boolean z) {
        if (zzn()) {
            return ((Boolean) zza(new zzam(str, false) { // from class: com.google.android.gms.internal.clearcut.zzah
                private final String zzea;
                private final boolean zzeb = false;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzea = str;
                }

                @Override // com.google.android.gms.internal.clearcut.zzam
                public final Object zzp() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(zzy.zza(zzae.zzh.getContentResolver(), this.zzea, this.zzeb));
                    return valueOf;
                }
            })).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x007d  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final T zzl() {
        /*
            r4 = this;
            java.lang.String r0 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            r1 = 0
            boolean r0 = zza(r0, r1)
            r2 = 0
            if (r0 != 0) goto L9e
            com.google.android.gms.internal.clearcut.zzao r0 = r4.zzdr
            android.net.Uri r0 = com.google.android.gms.internal.clearcut.zzao.zzb(r0)
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.clearcut.zzab r0 = r4.zzdw
            if (r0 != 0) goto L28
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.zzh
            android.content.ContentResolver r0 = r0.getContentResolver()
            com.google.android.gms.internal.clearcut.zzao r1 = r4.zzdr
            android.net.Uri r1 = com.google.android.gms.internal.clearcut.zzao.zzb(r1)
            com.google.android.gms.internal.clearcut.zzab r0 = com.google.android.gms.internal.clearcut.zzab.zza(r0, r1)
            r4.zzdw = r0
        L28:
            com.google.android.gms.internal.clearcut.zzab r0 = r4.zzdw
            com.google.android.gms.internal.clearcut.zzaf r1 = new com.google.android.gms.internal.clearcut.zzaf
            r1.<init>(r4, r0)
            java.lang.Object r0 = zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r4.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.clearcut.zzao r0 = r4.zzdr
            java.lang.String r0 = com.google.android.gms.internal.clearcut.zzao.zza(r0)
            if (r0 == 0) goto Lbb
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L79
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.zzh
            boolean r0 = androidx.print.PrintHelper$$ExternalSyntheticApiModelOutline0.m(r0)
            if (r0 != 0) goto L79
            java.lang.Boolean r0 = com.google.android.gms.internal.clearcut.zzae.zzdq
            if (r0 == 0) goto L5e
            java.lang.Boolean r0 = com.google.android.gms.internal.clearcut.zzae.zzdq
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L72
        L5e:
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.zzh
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r0 = androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0.m(r0, r3)
            android.os.UserManager r0 = (android.os.UserManager) r0
            boolean r0 = kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.internal.clearcut.zzae.zzdq = r0
        L72:
            java.lang.Boolean r0 = com.google.android.gms.internal.clearcut.zzae.zzdq
            boolean r0 = r0.booleanValue()
            goto L7a
        L79:
            r0 = 1
        L7a:
            if (r0 != 0) goto L7d
            return r2
        L7d:
            android.content.SharedPreferences r0 = r4.zzdx
            if (r0 != 0) goto L8f
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.zzh
            com.google.android.gms.internal.clearcut.zzao r3 = r4.zzdr
            java.lang.String r3 = com.google.android.gms.internal.clearcut.zzao.zza(r3)
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r1)
            r4.zzdx = r0
        L8f:
            android.content.SharedPreferences r0 = r4.zzdx
            java.lang.String r1 = r4.zzds
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto Lbb
            java.lang.Object r0 = r4.zza(r0)
            return r0
        L9e:
            java.lang.String r0 = r4.zzds
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            if (r1 == 0) goto Lb1
            java.lang.String r0 = r3.concat(r0)
            goto Lb6
        Lb1:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        Lb6:
            java.lang.String r1 = "PhenotypeFlag"
            android.util.Log.w(r1, r0)
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzae.zzl():java.lang.Object");
    }

    @Nullable
    private final T zzm() {
        boolean z;
        String str;
        z = this.zzdr.zzej;
        if (z || !zzn() || (str = (String) zza(new zzam(this) { // from class: com.google.android.gms.internal.clearcut.zzag
            private final zzae zzdy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdy = this;
            }

            @Override // com.google.android.gms.internal.clearcut.zzam
            public final Object zzp() {
                return this.zzdy.zzo();
            }
        })) == null) {
            return null;
        }
        return zzb(str);
    }

    private static boolean zzn() {
        if (zzdp == null) {
            Context context = zzh;
            if (context == null) {
                return false;
            }
            zzdp = Boolean.valueOf(PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzdp.booleanValue();
    }

    public final T get() {
        boolean z;
        if (zzh != null) {
            z = this.zzdr.zzek;
            if (z) {
                T zzm = zzm();
                if (zzm != null) {
                    return zzm;
                }
                T zzl = zzl();
                if (zzl != null) {
                    return zzl;
                }
            } else {
                T zzl2 = zzl();
                if (zzl2 != null) {
                    return zzl2;
                }
                T zzm2 = zzm();
                if (zzm2 != null) {
                    return zzm2;
                }
            }
            return this.zzdu;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    protected abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zzb(String str);

    public final /* synthetic */ String zzo() {
        return zzy.zza(zzh.getContentResolver(), this.zzdt, (String) null);
    }
}
