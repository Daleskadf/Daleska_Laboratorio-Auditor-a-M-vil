package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcel extends zzary {
    static final zzcel zzb = new zzcel();

    zzcel() {
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzasc zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzase();
        }
        if ("mvhd".equals(str)) {
            return new zzasf();
        }
        return new zzasg(str);
    }
}
