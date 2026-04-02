package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbto implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbtp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbto(zzbtp zzbtpVar) {
        this.zza = zzbtpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("User canceled the download.");
    }
}
