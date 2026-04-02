package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfxb implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfxe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxb(zzfxe zzfxeVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfxeVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfwg.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
