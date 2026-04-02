package com.google.android.gms.internal.auth;

import java.util.Comparator;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
final class zzdx implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzef zzefVar = (zzef) obj;
        zzef zzefVar2 = (zzef) obj2;
        zzdw zzdwVar = new zzdw(zzefVar);
        zzdw zzdwVar2 = new zzdw(zzefVar2);
        while (zzdwVar.hasNext() && zzdwVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzdwVar.zza() & ForkServer.ERROR).compareTo(Integer.valueOf(zzdwVar2.zza() & ForkServer.ERROR));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzefVar.zzd()).compareTo(Integer.valueOf(zzefVar2.zzd()));
    }
}
