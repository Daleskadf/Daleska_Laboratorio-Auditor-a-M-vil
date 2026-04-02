package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgm implements zzgo {
    @Override // com.google.android.gms.internal.measurement.zzgo
    public final String zza(ContentResolver contentResolver, String str) throws zzgr {
        Cursor query = contentResolver.query(zzgg.zza, null, null, new String[]{str}, null);
        try {
            if (query == null) {
                throw new zzgr("Failed to connect to GservicesProvider");
            }
            if (query.moveToFirst()) {
                String string = query.getString(1);
                if (query != null) {
                    query.close();
                }
                return string;
            } else if (query != null) {
                query.close();
                return null;
            } else {
                return null;
            }
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    public final <T extends Map<String, String>> T zza(ContentResolver contentResolver, String[] strArr, zzgp<T> zzgpVar) throws zzgr {
        Cursor query = contentResolver.query(zzgg.zzb, null, null, strArr, null);
        try {
            if (query == null) {
                throw new zzgr("Failed to connect to GservicesProvider");
            }
            T zza = zzgpVar.zza(query.getCount());
            while (query.moveToNext()) {
                zza.put(query.getString(0), query.getString(1));
            }
            if (query != null) {
                query.close();
            }
            return zza;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
