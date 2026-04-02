package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzawo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
public final class zzo implements View.OnTouchListener {
    final /* synthetic */ zzt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzawo zzawoVar;
        zzawo zzawoVar2;
        zzt zztVar = this.zza;
        zzawoVar = zztVar.zzh;
        if (zzawoVar != null) {
            zzawoVar2 = zztVar.zzh;
            zzawoVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
