package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafd implements zzaev {
    public final zzfzn zza;
    private final int zzb;

    private zzafd(int i, zzfzn zzfznVar) {
        this.zzb = i;
        this.zza = zzfznVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzafd zzc(int i, zzfo zzfoVar) {
        zzaev zzafeVar;
        String str;
        zzfzk zzfzkVar = new zzfzk();
        int zze = zzfoVar.zze();
        int i2 = -2;
        while (zzfoVar.zzb() > 8) {
            int zzi = zzfoVar.zzi();
            int zzd = zzfoVar.zzd() + zzfoVar.zzi();
            zzfoVar.zzJ(zzd);
            if (zzi != 1414744396) {
                zzafe zzafeVar2 = null;
                switch (zzi) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzfoVar.zzL(4);
                            int zzi2 = zzfoVar.zzi();
                            int zzi3 = zzfoVar.zzi();
                            zzfoVar.zzL(4);
                            int zzi4 = zzfoVar.zzi();
                            switch (zzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                zzfe.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + zzi4);
                            } else {
                                zzak zzakVar = new zzak();
                                zzakVar.zzab(zzi2);
                                zzakVar.zzI(zzi3);
                                zzakVar.zzW(str);
                                zzafeVar2 = new zzafe(zzakVar.zzac());
                            }
                        } else if (i2 == 1) {
                            int zzk = zzfoVar.zzk();
                            String str2 = zzk != 1 ? zzk != 85 ? zzk != 255 ? zzk != 8192 ? zzk != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                zzfe.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + zzk);
                            } else {
                                int zzk2 = zzfoVar.zzk();
                                int zzi5 = zzfoVar.zzi();
                                zzfoVar.zzL(6);
                                int zzl = zzfx.zzl(zzfoVar.zzq());
                                int zzk3 = zzfoVar.zzk();
                                byte[] bArr = new byte[zzk3];
                                zzfoVar.zzG(bArr, 0, zzk3);
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzW(str2);
                                zzakVar2.zzy(zzk2);
                                zzakVar2.zzX(zzi5);
                                if ("audio/raw".equals(str2) && zzl != 0) {
                                    zzakVar2.zzQ(zzl);
                                }
                                if ("audio/mp4a-latm".equals(str2) && zzk3 > 0) {
                                    zzakVar2.zzL(zzfzn.zzn(bArr));
                                }
                                zzafeVar = new zzafe(zzakVar2.zzac());
                                break;
                            }
                        } else {
                            zzfe.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfx.zzC(i2)));
                        }
                        zzafeVar = zzafeVar2;
                        break;
                    case 1751742049:
                        zzafeVar = zzafa.zzb(zzfoVar);
                        break;
                    case 1752331379:
                        zzafeVar = zzafb.zzb(zzfoVar);
                        break;
                    case 1852994675:
                        zzafeVar = zzaff.zzb(zzfoVar);
                        break;
                    default:
                        zzafeVar = zzafeVar2;
                        break;
                }
            } else {
                zzafeVar = zzc(zzfoVar.zzi(), zzfoVar);
            }
            if (zzafeVar != null) {
                if (zzafeVar.zza() == 1752331379) {
                    int i3 = ((zzafb) zzafeVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzfe.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfzkVar.zzf(zzafeVar);
            }
            zzfoVar.zzK(zzd);
            zzfoVar.zzJ(zze);
        }
        return new zzafd(i, zzfzkVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaev
    public final int zza() {
        return this.zzb;
    }

    public final zzaev zzb(Class cls) {
        zzfzn zzfznVar = this.zza;
        int size = zzfznVar.size();
        int i = 0;
        while (i < size) {
            zzaev zzaevVar = (zzaev) zzfznVar.get(i);
            i++;
            if (zzaevVar.getClass() == cls) {
                return zzaevVar;
            }
        }
        return null;
    }
}
