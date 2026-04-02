package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajz {
    private static final zzfxe zza = zzfxe.zzc(zzfwc.zzc(':'));
    private static final zzfxe zzb = zzfxe.zzc(zzfwc.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzadg zzadgVar, zzaec zzaecVar, List list) throws IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzd = zzadgVar.zzd();
            zzaecVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c3 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 == 2) {
                long zzd2 = zzadgVar.zzd();
                int i4 = this.zze - 20;
                zzfo zzfoVar = new zzfo(i4);
                zzadgVar.zzi(zzfoVar.zzM(), 0, i4);
                int i5 = 0;
                while (i5 < i4 / 12) {
                    zzfoVar.zzL(i3);
                    short zzC = zzfoVar.zzC();
                    if (zzC == s3 || zzC == s2 || zzC == s || zzC == 2819 || zzC == 2820) {
                        i = i4;
                        this.zzc.add(new zzajy(zzC, (zzd2 - this.zze) - zzfoVar.zzi(), zzfoVar.zzi()));
                    } else {
                        zzfoVar.zzL(8);
                        i = i4;
                    }
                    i5++;
                    i4 = i;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzaecVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzaecVar.zza = ((zzajy) this.zzc.get(0)).zza;
                }
            } else {
                long zzf = zzadgVar.zzf();
                int zzd3 = (int) ((zzadgVar.zzd() - zzadgVar.zzf()) - this.zze);
                zzfo zzfoVar2 = new zzfo(zzd3);
                zzadgVar.zzi(zzfoVar2.zzM(), 0, zzd3);
                int i6 = 0;
                while (i6 < this.zzc.size()) {
                    zzajy zzajyVar = (zzajy) this.zzc.get(i6);
                    zzfoVar2.zzK((int) (zzajyVar.zza - zzf));
                    zzfoVar2.zzL(4);
                    int zzi = zzfoVar2.zzi();
                    String zzA = zzfoVar2.zzA(zzi, zzfwd.zzc);
                    switch (zzA.hashCode()) {
                        case -1711564334:
                            if (zzA.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1332107749:
                            if (zzA.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1251387154:
                            if (zzA.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -830665521:
                            if (zzA.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1760745220:
                            if (zzA.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = 2819;
                    } else if (c != 4) {
                        throw zzcc.zza("Invalid SEF name", null);
                    } else {
                        c2 = 2820;
                    }
                    int i7 = zzajyVar.zzb - (zzi + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzf2 = zzb.zzf(zzfoVar2.zzA(i7, zzfwd.zzc));
                        for (int i8 = 0; i8 < zzf2.size(); i8++) {
                            List zzf3 = zza.zzf((CharSequence) zzf2.get(i8));
                            if (zzf3.size() == 3) {
                                try {
                                    arrayList.add(new zzahu(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                                } catch (NumberFormatException e) {
                                    throw zzcc.zza(null, e);
                                }
                            } else {
                                throw zzcc.zza(null, null);
                            }
                        }
                        list.add(new zzahv(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i6++;
                    c3 = 2819;
                }
                zzaecVar.zza = 0L;
            }
        } else {
            zzfo zzfoVar3 = new zzfo(8);
            zzadgVar.zzi(zzfoVar3.zzM(), 0, 8);
            this.zze = zzfoVar3.zzi() + 8;
            if (zzfoVar3.zzg() != 1397048916) {
                zzaecVar.zza = 0L;
            } else {
                zzaecVar.zza = zzadgVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
