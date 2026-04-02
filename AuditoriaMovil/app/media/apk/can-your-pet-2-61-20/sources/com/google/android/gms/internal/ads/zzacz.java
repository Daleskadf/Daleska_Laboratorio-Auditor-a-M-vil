package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzacz {
    public final String zza;

    private zzacz(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzacz zza(zzfo zzfoVar) {
        String str;
        zzfoVar.zzL(2);
        int zzm = zzfoVar.zzm();
        int i = zzm >> 1;
        int i2 = zzm & 1;
        int zzm2 = zzfoVar.zzm() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        int i3 = zzm2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new zzacz(i, i3, sb.toString());
    }
}
