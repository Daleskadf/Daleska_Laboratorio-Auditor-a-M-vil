package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzace {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, ModuleDescriptor.MODULE_VERSION, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, LocationRequestCompat.QUALITY_LOW_POWER, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & 63);
    }

    public static zzam zzc(zzfo zzfoVar, String str, String str2, zzae zzaeVar) {
        zzfn zzfnVar = new zzfn();
        zzfnVar.zzi(zzfoVar);
        int i = zzc[zzfnVar.zzd(2)];
        zzfnVar.zzm(8);
        int i2 = zze[zzfnVar.zzd(3)];
        if (zzfnVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzfnVar.zzd(5)] * 1000;
        zzfnVar.zze();
        zzfoVar.zzK(zzfnVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzK(str);
        zzakVar.zzW("audio/ac3");
        zzakVar.zzy(i2);
        zzakVar.zzX(i);
        zzakVar.zzE(zzaeVar);
        zzakVar.zzN(str2);
        zzakVar.zzx(i3);
        zzakVar.zzR(i3);
        return zzakVar.zzac();
    }

    public static zzam zzd(zzfo zzfoVar, String str, String str2, zzae zzaeVar) {
        String str3;
        zzfn zzfnVar = new zzfn();
        zzfnVar.zzi(zzfoVar);
        int zzd2 = zzfnVar.zzd(13) * 1000;
        zzfnVar.zzm(3);
        int i = zzc[zzfnVar.zzd(2)];
        zzfnVar.zzm(10);
        int i2 = zze[zzfnVar.zzd(3)];
        if (zzfnVar.zzd(1) != 0) {
            i2++;
        }
        zzfnVar.zzm(3);
        int zzd3 = zzfnVar.zzd(4);
        zzfnVar.zzm(1);
        if (zzd3 > 0) {
            zzfnVar.zzm(6);
            if (zzfnVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzfnVar.zzm(1);
        }
        if (zzfnVar.zza() > 7) {
            zzfnVar.zzm(7);
            if (zzfnVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfnVar.zze();
                zzfoVar.zzK(zzfnVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzK(str);
                zzakVar.zzW(str3);
                zzakVar.zzy(i2);
                zzakVar.zzX(i);
                zzakVar.zzE(zzaeVar);
                zzakVar.zzN(str2);
                zzakVar.zzR(zzd2);
                return zzakVar.zzac();
            }
        }
        str3 = "audio/eac3";
        zzfnVar.zze();
        zzfoVar.zzK(zzfnVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzK(str);
        zzakVar2.zzW(str3);
        zzakVar2.zzy(i2);
        zzakVar2.zzX(i);
        zzakVar2.zzE(zzaeVar);
        zzakVar2.zzN(str2);
        zzakVar2.zzR(zzd2);
        return zzakVar2.zzac();
    }

    public static zzacd zze(zzfn zzfnVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzc2 = zzfnVar.zzc();
        zzfnVar.zzm(40);
        int zzd2 = zzfnVar.zzd(5);
        zzfnVar.zzk(zzc2);
        int i12 = -1;
        if (zzd2 > 10) {
            zzfnVar.zzm(16);
            int zzd3 = zzfnVar.zzd(2);
            if (zzd3 == 0) {
                i12 = 0;
            } else if (zzd3 == 1) {
                i12 = 1;
            } else if (zzd3 == 2) {
                i12 = 2;
            }
            zzfnVar.zzm(3);
            int zzd4 = zzfnVar.zzd(11) + 1;
            int zzd5 = zzfnVar.zzd(2);
            if (zzd5 == 3) {
                i8 = zzd[zzfnVar.zzd(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int zzd6 = zzfnVar.zzd(2);
                int i13 = zzb[zzd6];
                i7 = zzd6;
                i8 = zzc[zzd5];
                i9 = i13;
            }
            int i14 = zzd4 + zzd4;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzd7 = zzfnVar.zzd(3);
            boolean zzo = zzfnVar.zzo();
            int i16 = zze[zzd7] + (zzo ? 1 : 0);
            zzfnVar.zzm(10);
            if (zzfnVar.zzo()) {
                zzfnVar.zzm(8);
            }
            if (zzd7 == 0) {
                zzfnVar.zzm(5);
                if (zzfnVar.zzo()) {
                    zzfnVar.zzm(8);
                }
                i10 = 0;
                zzd7 = 0;
            } else {
                i10 = zzd7;
            }
            if (i12 == 1) {
                if (zzfnVar.zzo()) {
                    zzfnVar.zzm(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzfnVar.zzo()) {
                if (i10 > 2) {
                    zzfnVar.zzm(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzfnVar.zzm(6);
                }
                if ((i10 & 4) != 0) {
                    zzfnVar.zzm(6);
                }
                if (zzo && zzfnVar.zzo()) {
                    zzfnVar.zzm(5);
                }
                if (i11 == 0) {
                    if (zzfnVar.zzo()) {
                        zzfnVar.zzm(6);
                    }
                    if (i10 == 0 && zzfnVar.zzo()) {
                        zzfnVar.zzm(6);
                    }
                    if (zzfnVar.zzo()) {
                        zzfnVar.zzm(6);
                    }
                    int zzd8 = zzfnVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfnVar.zzm(5);
                    } else if (zzd8 == 2) {
                        zzfnVar.zzm(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfnVar.zzd(5);
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(5);
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(4);
                            }
                            if (zzfnVar.zzo()) {
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(4);
                                }
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(4);
                                }
                            }
                        }
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(5);
                            if (zzfnVar.zzo()) {
                                zzfnVar.zzm(7);
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(8);
                                }
                            }
                        }
                        zzfnVar.zzm((zzd9 + 2) * 8);
                        zzfnVar.zze();
                    }
                    if (i10 < 2) {
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(14);
                        }
                        if (zzd7 == 0 && zzfnVar.zzo()) {
                            zzfnVar.zzm(14);
                        }
                    }
                    if (zzfnVar.zzo()) {
                        if (i7 == 0) {
                            zzfnVar.zzm(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i17 = 0; i17 < i9; i17++) {
                                if (zzfnVar.zzo()) {
                                    zzfnVar.zzm(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzfnVar.zzo()) {
                zzfnVar.zzm(5);
                if (i10 == 2) {
                    zzfnVar.zzm(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzfnVar.zzm(2);
                }
                if (zzfnVar.zzo()) {
                    zzfnVar.zzm(8);
                }
                if (i10 == 0 && zzfnVar.zzo()) {
                    zzfnVar.zzm(8);
                }
                if (zzd5 < 3) {
                    zzfnVar.zzl();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzfnVar.zzl();
            }
            if (i11 == 2 && (i7 == 3 || zzfnVar.zzo())) {
                zzfnVar.zzm(6);
            }
            str = (zzfnVar.zzo() && zzfnVar.zzd(6) == 1 && zzfnVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i14;
            i3 = i8;
            i6 = i9 * 256;
            i = i15;
            i4 = i16;
        } else {
            zzfnVar.zzm(32);
            int zzd10 = zzfnVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzfnVar.zzd(6);
            int i18 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzfnVar.zzm(8);
            int zzd12 = zzfnVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfnVar.zzm(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfnVar.zzm(2);
            }
            if (zzd12 == 2) {
                zzfnVar.zzm(2);
            }
            str = str2;
            i = i18;
            i2 = zzf2;
            i3 = zzd10 < 3 ? zzc[zzd10] : -1;
            i4 = zze[zzd12] + (zzfnVar.zzo() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new zzacd(str, i5, i4, i3, i2, i6, i, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
