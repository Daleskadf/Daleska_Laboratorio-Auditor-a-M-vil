package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzgs implements zzgz {
    private static final Map<Uri, zzgs> zza = new ArrayMap();
    private static final String[] zzb = {"key", "value"};
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private final ContentObserver zzf;
    private final Object zzg;
    private volatile Map<String, String> zzh;
    private final List<zzgx> zzi;

    public static zzgs zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgs zzgsVar;
        synchronized (zzgs.class) {
            Map<Uri, zzgs> map = zza;
            zzgsVar = map.get(uri);
            if (zzgsVar == null) {
                try {
                    zzgs zzgsVar2 = new zzgs(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzgsVar2);
                    } catch (SecurityException unused) {
                    }
                    zzgsVar = zzgsVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzgsVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzgz
    public final /* synthetic */ Object zza(String str) {
        return zza().get(str);
    }

    public final Map<String, String> zza() {
        Map<String, String> map = this.zzh;
        if (map == null) {
            synchronized (this.zzg) {
                map = this.zzh;
                if (map == null) {
                    map = zze();
                    this.zzh = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzb() {
        Map hashMap;
        Cursor query = this.zzc.query(this.zzd, zzb, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    private final Map<String, String> zze() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) zzgy.zza(new zzhb() { // from class: com.google.android.gms.internal.measurement.zzgv
                    @Override // com.google.android.gms.internal.measurement.zzhb
                    public final Object zza() {
                        return zzgs.this.zzb();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private zzgs(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzgu zzguVar = new zzgu(this, null);
        this.zzf = zzguVar;
        this.zzg = new Object();
        this.zzi = new ArrayList();
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
        contentResolver.registerContentObserver(uri, false, zzguVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzgs.class) {
            for (zzgs zzgsVar : zza.values()) {
                zzgsVar.zzc.unregisterContentObserver(zzgsVar.zzf);
            }
            zza.clear();
        }
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzh = null;
            this.zze.run();
        }
        synchronized (this) {
            for (zzgx zzgxVar : this.zzi) {
                zzgxVar.zza();
            }
        }
    }
}
