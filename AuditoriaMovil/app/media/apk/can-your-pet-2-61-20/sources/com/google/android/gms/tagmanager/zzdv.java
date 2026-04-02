package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
public final class zzdv implements zzcc {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time");
    private final zzdu zzb;
    private volatile zzbj zzc;
    private final Context zzd;
    private final String zze;
    private long zzf;
    private final Clock zzg;
    private final int zzh;
    private final zzey zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdv(zzey zzeyVar, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zze = "gtm_urls.db";
        this.zzi = zzeyVar;
        this.zzg = DefaultClock.getInstance();
        this.zzb = new zzdu(this, applicationContext, "gtm_urls.db");
        this.zzc = new zzfi(applicationContext, new zzdt(this));
        this.zzf = 0L;
        this.zzh = 2000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzdv zzdvVar, long j, long j2) {
        SQLiteDatabase zzk = zzdvVar.zzk("Error opening database for getNumStoredHits.");
        if (zzk == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j2));
        try {
            zzk.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j);
            zzdvVar.zzl(j);
        }
    }

    private final SQLiteDatabase zzk(String str) {
        try {
            return this.zzb.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j) {
        zzj(new String[]{String.valueOf(j)});
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: all -> 0x00fa, TryCatch #11 {all -> 0x00fa, blocks: (B:20:0x00ab, B:23:0x00b2, B:25:0x00bf, B:27:0x00ea, B:26:0x00ce, B:46:0x010e, B:47:0x0130, B:49:0x0136, B:54:0x014a), top: B:112:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    @Override // com.google.android.gms.tagmanager.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza() {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.zza():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r2.close();
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    @Override // com.google.android.gms.tagmanager.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(long r20, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.zzb(long, java.lang.String):void");
    }

    final int zzc() {
        SQLiteDatabase zzk = zzk("Error opening database for getNumStoredHits.");
        if (zzk != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = zzk.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                    r1 = cursor.moveToFirst() ? (int) cursor.getLong(0) : 0;
                    if (cursor != null) {
                        return r1;
                    }
                } catch (SQLiteException unused) {
                    Log.w("GoogleTagManager", "Error getting numStoredHits");
                    if (cursor != null) {
                        cursor.close();
                        return 0;
                    }
                }
                return r1;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return 0;
    }

    final void zzj(String[] strArr) {
        int length;
        SQLiteDatabase zzk;
        if (strArr == null || (length = strArr.length) == 0 || (zzk = zzk("Error opening database for deleteHits.")) == null) {
            return;
        }
        boolean z = true;
        try {
            zzk.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(length, "?"))), strArr);
            zzey zzeyVar = this.zzi;
            if (zzc() != 0) {
                z = false;
            }
            zzeyVar.zza(z);
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting hits");
        }
    }
}
