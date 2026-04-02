package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
final class zzaw implements DialogInterface.OnClickListener {
    final /* synthetic */ zzax zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzax zzaxVar) {
        this.zza = zzaxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzu.zzp();
        zzt.zzU(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
