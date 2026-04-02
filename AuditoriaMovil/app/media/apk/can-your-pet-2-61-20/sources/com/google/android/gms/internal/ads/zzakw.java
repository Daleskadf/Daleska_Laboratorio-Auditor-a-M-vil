package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakw extends zzaku {
    private zzakv zza;
    private int zzb;
    private boolean zzc;
    private zzaer zzd;
    private zzaep zze;

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final long zza(zzfo zzfoVar) {
        if ((zzfoVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfoVar.zzM()[0];
        zzakv zzakvVar = this.zza;
        zzek.zzb(zzakvVar);
        int i = !zzakvVar.zzd[(b >> 1) & (255 >>> (8 - zzakvVar.zze))].zza ? zzakvVar.zza.zze : zzakvVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfoVar.zzc() < zzfoVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfoVar.zzM(), zzfoVar.zze() + 4);
            zzfoVar.zzI(copyOf, copyOf.length);
        } else {
            zzfoVar.zzJ(zzfoVar.zze() + 4);
        }
        long j = i2;
        byte[] zzM = zzfoVar.zzM();
        zzM[zzfoVar.zze() - 4] = (byte) (j & 255);
        zzM[zzfoVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzM[zzfoVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzM[zzfoVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaku
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaku
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaer zzaerVar = this.zzd;
        this.zzb = zzaerVar != null ? zzaerVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) throws IOException {
        zzakv zzakvVar;
        int i;
        int i2;
        int i3;
        int i4;
        zzaer zzaerVar;
        long j2;
        if (this.zza == null) {
            zzaer zzaerVar2 = this.zzd;
            int i5 = 4;
            if (zzaerVar2 == null) {
                zzaes.zzd(1, zzfoVar, false);
                int zzj = zzfoVar.zzj();
                int zzm = zzfoVar.zzm();
                int zzj2 = zzfoVar.zzj();
                int zzi = zzfoVar.zzi();
                int i6 = zzi <= 0 ? -1 : zzi;
                int zzi2 = zzfoVar.zzi();
                int i7 = zzi2 <= 0 ? -1 : zzi2;
                int zzi3 = zzfoVar.zzi();
                int i8 = zzi3 <= 0 ? -1 : zzi3;
                int zzm2 = zzfoVar.zzm();
                this.zzd = new zzaer(zzj, zzm, zzj2, i6, i7, i8, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzfoVar.zzm() & 1), Arrays.copyOf(zzfoVar.zzM(), zzfoVar.zze()));
            } else {
                zzaep zzaepVar = this.zze;
                if (zzaepVar == null) {
                    this.zze = zzaes.zzc(zzfoVar, true, true);
                } else {
                    byte[] bArr = new byte[zzfoVar.zze()];
                    System.arraycopy(zzfoVar.zzM(), 0, bArr, 0, zzfoVar.zze());
                    int i9 = zzaerVar2.zza;
                    int i10 = 5;
                    zzaes.zzd(5, zzfoVar, false);
                    int zzm3 = zzfoVar.zzm() + 1;
                    zzaeo zzaeoVar = new zzaeo(zzfoVar.zzM());
                    zzaeoVar.zzc(zzfoVar.zzd() * 8);
                    int i11 = 0;
                    while (true) {
                        int i12 = 2;
                        int i13 = 16;
                        if (i11 < zzm3) {
                            if (zzaeoVar.zzb(24) != 5653314) {
                                throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaeoVar.zza(), null);
                            }
                            int zzb = zzaeoVar.zzb(16);
                            int zzb2 = zzaeoVar.zzb(24);
                            if (!zzaeoVar.zzd()) {
                                boolean zzd = zzaeoVar.zzd();
                                for (int i14 = 0; i14 < zzb2; i14++) {
                                    if (zzd) {
                                        if (zzaeoVar.zzd()) {
                                            zzaeoVar.zzc(5);
                                        }
                                    } else {
                                        zzaeoVar.zzc(5);
                                    }
                                }
                            } else {
                                zzaeoVar.zzc(5);
                                for (int i15 = 0; i15 < zzb2; i15 += zzaeoVar.zzb(zzaes.zza(zzb2 - i15))) {
                                }
                            }
                            int zzb3 = zzaeoVar.zzb(i5);
                            if (zzb3 > 2) {
                                throw zzcc.zza("lookup type greater than 2 not decodable: " + zzb3, null);
                            }
                            if (zzb3 == 1) {
                                i12 = zzb3;
                            } else if (zzb3 != 2) {
                                zzaerVar = zzaerVar2;
                                i11++;
                                zzaerVar2 = zzaerVar;
                                i5 = 4;
                            }
                            zzaeoVar.zzc(32);
                            zzaeoVar.zzc(32);
                            int zzb4 = zzaeoVar.zzb(i5) + 1;
                            zzaeoVar.zzc(1);
                            if (i12 != 1) {
                                zzaerVar = zzaerVar2;
                                j2 = zzb * zzb2;
                            } else if (zzb != 0) {
                                zzaerVar = zzaerVar2;
                                j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                            } else {
                                zzaerVar = zzaerVar2;
                                j2 = 0;
                            }
                            zzaeoVar.zzc((int) (j2 * zzb4));
                            i11++;
                            zzaerVar2 = zzaerVar;
                            i5 = 4;
                        } else {
                            zzaer zzaerVar3 = zzaerVar2;
                            int i16 = 6;
                            int zzb5 = zzaeoVar.zzb(6) + 1;
                            for (int i17 = 0; i17 < zzb5; i17++) {
                                if (zzaeoVar.zzb(16) != 0) {
                                    throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                                }
                            }
                            int i18 = 1;
                            int zzb6 = zzaeoVar.zzb(6) + 1;
                            int i19 = 0;
                            while (true) {
                                int i20 = 3;
                                if (i19 < zzb6) {
                                    int zzb7 = zzaeoVar.zzb(i13);
                                    if (zzb7 == 0) {
                                        i3 = zzb6;
                                        int i21 = 8;
                                        zzaeoVar.zzc(8);
                                        zzaeoVar.zzc(16);
                                        zzaeoVar.zzc(16);
                                        zzaeoVar.zzc(6);
                                        zzaeoVar.zzc(8);
                                        int zzb8 = zzaeoVar.zzb(4) + 1;
                                        int i22 = 0;
                                        while (i22 < zzb8) {
                                            zzaeoVar.zzc(i21);
                                            i22++;
                                            i21 = 8;
                                        }
                                    } else if (zzb7 != i18) {
                                        throw zzcc.zza("floor type greater than 1 not decodable: " + zzb7, null);
                                    } else {
                                        int zzb9 = zzaeoVar.zzb(i10);
                                        int[] iArr = new int[zzb9];
                                        int i23 = -1;
                                        for (int i24 = 0; i24 < zzb9; i24++) {
                                            int zzb10 = zzaeoVar.zzb(4);
                                            iArr[i24] = zzb10;
                                            if (zzb10 > i23) {
                                                i23 = zzb10;
                                            }
                                        }
                                        int i25 = i23 + 1;
                                        int[] iArr2 = new int[i25];
                                        int i26 = 0;
                                        while (i26 < i25) {
                                            iArr2[i26] = zzaeoVar.zzb(i20) + 1;
                                            int zzb11 = zzaeoVar.zzb(i12);
                                            if (zzb11 > 0) {
                                                i4 = 8;
                                                zzaeoVar.zzc(8);
                                            } else {
                                                i4 = 8;
                                            }
                                            int i27 = zzb6;
                                            int i28 = 0;
                                            for (int i29 = 1; i28 < (i29 << zzb11); i29 = 1) {
                                                zzaeoVar.zzc(i4);
                                                i28++;
                                                i4 = 8;
                                            }
                                            i26++;
                                            zzb6 = i27;
                                            i12 = 2;
                                            i20 = 3;
                                        }
                                        i3 = zzb6;
                                        zzaeoVar.zzc(2);
                                        int zzb12 = zzaeoVar.zzb(4);
                                        int i30 = 0;
                                        int i31 = 0;
                                        for (int i32 = 0; i32 < zzb9; i32++) {
                                            i30 += iArr2[iArr[i32]];
                                            while (i31 < i30) {
                                                zzaeoVar.zzc(zzb12);
                                                i31++;
                                            }
                                        }
                                    }
                                    i19++;
                                    zzb6 = i3;
                                    i16 = 6;
                                    i13 = 16;
                                    i12 = 2;
                                    i18 = 1;
                                    i10 = 5;
                                } else {
                                    int i33 = 1;
                                    int zzb13 = zzaeoVar.zzb(i16) + 1;
                                    int i34 = 0;
                                    while (i34 < zzb13) {
                                        if (zzaeoVar.zzb(16) <= 2) {
                                            zzaeoVar.zzc(24);
                                            zzaeoVar.zzc(24);
                                            zzaeoVar.zzc(24);
                                            int zzb14 = zzaeoVar.zzb(i16) + i33;
                                            int i35 = 8;
                                            zzaeoVar.zzc(8);
                                            int[] iArr3 = new int[zzb14];
                                            for (int i36 = 0; i36 < zzb14; i36++) {
                                                iArr3[i36] = ((zzaeoVar.zzd() ? zzaeoVar.zzb(5) : 0) * 8) + zzaeoVar.zzb(3);
                                            }
                                            int i37 = 0;
                                            while (i37 < zzb14) {
                                                int i38 = 0;
                                                while (i38 < i35) {
                                                    if ((iArr3[i37] & (1 << i38)) != 0) {
                                                        zzaeoVar.zzc(i35);
                                                    }
                                                    i38++;
                                                    i35 = 8;
                                                }
                                                i37++;
                                                i35 = 8;
                                            }
                                            i34++;
                                            i16 = 6;
                                            i33 = 1;
                                        } else {
                                            throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                        }
                                    }
                                    int zzb15 = zzaeoVar.zzb(i16) + 1;
                                    for (int i39 = 0; i39 < zzb15; i39++) {
                                        int zzb16 = zzaeoVar.zzb(16);
                                        if (zzb16 != 0) {
                                            zzfe.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb16);
                                        } else {
                                            if (zzaeoVar.zzd()) {
                                                i = 1;
                                                i2 = zzaeoVar.zzb(4) + 1;
                                            } else {
                                                i = 1;
                                                i2 = 1;
                                            }
                                            if (zzaeoVar.zzd()) {
                                                int zzb17 = zzaeoVar.zzb(8) + i;
                                                for (int i40 = 0; i40 < zzb17; i40++) {
                                                    int i41 = i9 - 1;
                                                    zzaeoVar.zzc(zzaes.zza(i41));
                                                    zzaeoVar.zzc(zzaes.zza(i41));
                                                }
                                            }
                                            if (zzaeoVar.zzb(2) != 0) {
                                                throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                            }
                                            if (i2 > 1) {
                                                for (int i42 = 0; i42 < i9; i42++) {
                                                    zzaeoVar.zzc(4);
                                                }
                                            }
                                            for (int i43 = 0; i43 < i2; i43++) {
                                                zzaeoVar.zzc(8);
                                                zzaeoVar.zzc(8);
                                                zzaeoVar.zzc(8);
                                            }
                                        }
                                    }
                                    int zzb18 = zzaeoVar.zzb(6) + 1;
                                    zzaeq[] zzaeqVarArr = new zzaeq[zzb18];
                                    for (int i44 = 0; i44 < zzb18; i44++) {
                                        zzaeqVarArr[i44] = new zzaeq(zzaeoVar.zzd(), zzaeoVar.zzb(16), zzaeoVar.zzb(16), zzaeoVar.zzb(8));
                                    }
                                    if (!zzaeoVar.zzd()) {
                                        throw zzcc.zza("framing bit after modes not set as expected", null);
                                    }
                                    zzakvVar = new zzakv(zzaerVar3, zzaepVar, bArr, zzaeqVarArr, zzaes.zza(zzb18 - 1));
                                }
                            }
                        }
                    }
                }
            }
            zzakvVar = null;
            this.zza = zzakvVar;
            if (zzakvVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzaer zzaerVar4 = zzakvVar.zza;
            arrayList.add(zzaerVar4.zzg);
            arrayList.add(zzakvVar.zzc);
            zzby zzb19 = zzaes.zzb(zzfzn.zzl(zzakvVar.zzb.zzb));
            zzak zzakVar = new zzak();
            zzakVar.zzW("audio/vorbis");
            zzakVar.zzx(zzaerVar4.zzd);
            zzakVar.zzR(zzaerVar4.zzc);
            zzakVar.zzy(zzaerVar4.zza);
            zzakVar.zzX(zzaerVar4.zzb);
            zzakVar.zzL(arrayList);
            zzakVar.zzP(zzb19);
            zzakrVar.zza = zzakVar.zzac();
            return true;
        }
        zzakrVar.zza.getClass();
        return false;
    }
}
