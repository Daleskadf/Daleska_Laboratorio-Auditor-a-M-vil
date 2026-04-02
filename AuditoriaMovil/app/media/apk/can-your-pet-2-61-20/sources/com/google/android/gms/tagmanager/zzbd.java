package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgb;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzbd implements zzaw {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");
    private final Executor zzb;
    private final Context zzc;
    private final zzbb zzd;
    private final Clock zze;

    public zzbd(Context context) {
        Clock defaultClock = DefaultClock.getInstance();
        ExecutorService zza2 = zzgb.zza().zza(2);
        this.zzc = context;
        this.zze = defaultClock;
        this.zzb = zza2;
        this.zzd = new zzbb(this, context, "google_tagmanager.db");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ List zzf(zzbd zzbdVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbdVar.zzk(zzbdVar.zze.currentTimeMillis());
            SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for loadSerialized.");
            ArrayList<zzbc> arrayList = new ArrayList();
            if (zzi != null) {
                Cursor query = zzi.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
                while (query.moveToNext()) {
                    arrayList.add(new zzbc(query.getString(0), query.getBlob(1)));
                }
                query.close();
            }
            ArrayList arrayList2 = new ArrayList();
            for (zzbc zzbcVar : arrayList) {
                String str = zzbcVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbcVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                Object obj = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        obj = objectInputStream.readObject();
                    } catch (IOException unused) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzat(str, obj));
                    } catch (ClassNotFoundException unused2) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzat(str, obj));
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException unused3) {
                                throw th;
                            }
                        }
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused4) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused5) {
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (IOException unused6) {
                }
                arrayList2.add(new zzat(str, obj));
            }
            return arrayList2;
        } finally {
            zzbdVar.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzbd zzbdVar, String str) {
        SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for clearKeysWithPrefix.");
        try {
            if (zzi == null) {
                return;
            }
            int delete = zzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"});
            zzdg.zzb.zzd("Cleared " + delete + " items");
        } catch (SQLiteException e) {
            String obj = e.toString();
            Log.w("GoogleTagManager", "Error deleting entries with key prefix: " + str + " (" + obj + ").");
        } finally {
            zzbdVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
            zzdg.zzb.zzd("Deleted " + delete + " expired items");
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
        if (r5 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[Catch: all -> 0x017a, TRY_LEAVE, TryCatch #10 {, blocks: (B:70:0x016d, B:4:0x0003, B:23:0x0046, B:25:0x004b, B:35:0x0093, B:60:0x012b, B:61:0x012e, B:48:0x00bf, B:50:0x00e8, B:53:0x00ec, B:55:0x00f4, B:56:0x010f, B:58:0x0115, B:62:0x012f, B:65:0x013a, B:66:0x013e, B:68:0x0144, B:15:0x0031, B:22:0x0042, B:76:0x0176, B:77:0x0179), top: B:93:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x017a, TryCatch #10 {, blocks: (B:70:0x016d, B:4:0x0003, B:23:0x0046, B:25:0x004b, B:35:0x0093, B:60:0x012b, B:61:0x012e, B:48:0x00bf, B:50:0x00e8, B:53:0x00ec, B:55:0x00f4, B:56:0x010f, B:58:0x0115, B:62:0x012f, B:65:0x013a, B:66:0x013e, B:68:0x0144, B:15:0x0031, B:22:0x0042, B:76:0x0176, B:77:0x0179), top: B:93:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a A[Catch: all -> 0x017a, TryCatch #10 {, blocks: (B:70:0x016d, B:4:0x0003, B:23:0x0046, B:25:0x004b, B:35:0x0093, B:60:0x012b, B:61:0x012e, B:48:0x00bf, B:50:0x00e8, B:53:0x00ec, B:55:0x00f4, B:56:0x010f, B:58:0x0115, B:62:0x012f, B:65:0x013a, B:66:0x013e, B:68:0x0144, B:15:0x0031, B:22:0x0042, B:76:0x0176, B:77:0x0179), top: B:93:0x0003 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzl(java.util.List r19, long r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzl(java.util.List, long):void");
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zza(String str) {
        this.zzb.execute(new zzba(this, str));
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zzb(zzav zzavVar) {
        this.zzb.execute(new zzaz(this, zzavVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r6 == null) goto L11;
     */
    @Override // com.google.android.gms.tagmanager.zzaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.util.List r8, long r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r8.next()
            com.google.android.gms.tagmanager.zzat r1 = (com.google.android.gms.tagmanager.zzat) r1
            com.google.android.gms.tagmanager.zzbc r2 = new com.google.android.gms.tagmanager.zzbc
            java.lang.String r3 = r1.zza
            java.lang.Object r1 = r1.zzb
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L43
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L43
            r6.writeObject(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L37
        L2d:
            r6.close()     // Catch: java.io.IOException -> L48
        L30:
            r4.close()     // Catch: java.io.IOException -> L48
            goto L48
        L34:
            r8 = move-exception
            r5 = r6
            goto L3a
        L37:
            goto L45
        L39:
            r8 = move-exception
        L3a:
            if (r5 == 0) goto L3f
            r5.close()     // Catch: java.io.IOException -> L42
        L3f:
            r4.close()     // Catch: java.io.IOException -> L42
        L42:
            throw r8
        L43:
            r6 = r5
        L45:
            if (r6 == 0) goto L30
            goto L2d
        L48:
            r2.<init>(r3, r5)
            r0.add(r2)
            goto L9
        L4f:
            java.util.concurrent.Executor r8 = r7.zzb
            com.google.android.gms.tagmanager.zzay r1 = new com.google.android.gms.tagmanager.zzay
            r1.<init>(r7, r0, r9)
            r8.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzc(java.util.List, long):void");
    }
}
