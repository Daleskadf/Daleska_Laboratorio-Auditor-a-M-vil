package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzn extends Cast.Listener {
    final /* synthetic */ CastSession zza;

    public /* synthetic */ zzn(CastSession castSession, zzm zzmVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onActiveInputStateChanged(int i10) {
        Set set;
        set = this.zza.zzd;
        for (Cast.Listener listener : new HashSet(set)) {
            listener.onActiveInputStateChanged(i10);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onApplicationDisconnected(int i10) {
        Set set;
        CastSession.zzg(this.zza, i10);
        this.zza.notifySessionEnded(i10);
        set = this.zza.zzd;
        for (Cast.Listener listener : new HashSet(set)) {
            listener.onApplicationDisconnected(i10);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        Set set;
        set = this.zza.zzd;
        for (Cast.Listener listener : new HashSet(set)) {
            listener.onApplicationMetadataChanged(applicationMetadata);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onApplicationStatusChanged() {
        Set set;
        set = this.zza.zzd;
        for (Cast.Listener listener : new HashSet(set)) {
            listener.onApplicationStatusChanged();
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onStandbyStateChanged(int i10) {
        Set set;
        set = this.zza.zzd;
        for (Cast.Listener listener : new HashSet(set)) {
            listener.onStandbyStateChanged(i10);
        }
    }

    @Override // com.google.android.gms.cast.Cast.Listener
    public final void onVolumeChanged() {
        Set set;
        set = this.zza.zzd;
        for (Cast.Listener listener : new HashSet(set)) {
            listener.onVolumeChanged();
        }
    }
}
