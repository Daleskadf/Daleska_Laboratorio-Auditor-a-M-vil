package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import com.google.common.net.HttpHeaders;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzajr {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzbx zza(zzfo zzfoVar) {
        String str;
        zzbx zzagoVar;
        int zzd = zzfoVar.zzd() + zzfoVar.zzg();
        int zzg = zzfoVar.zzg();
        int i = (zzg >> 24) & 255;
        zzbx zzbxVar = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = zzg & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int zzg2 = zzfoVar.zzg();
                    if (zzfoVar.zzg() == 1684108385) {
                        zzfoVar.zzL(8);
                        String zzz = zzfoVar.zzz(zzg2 - 16);
                        zzbxVar = new zzagw("und", zzz, zzz);
                    } else {
                        zzfe.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzaja.zzf(zzg)));
                    }
                } else {
                    if (i2 != 7233901 && i2 != 7631467) {
                        if (i2 != 6516589 && i2 != 7828084) {
                            if (i2 == 6578553) {
                                zzbxVar = zze(zzg, "TDRC", zzfoVar);
                            } else if (i2 == 4280916) {
                                zzbxVar = zze(zzg, "TPE1", zzfoVar);
                            } else if (i2 == 7630703) {
                                zzbxVar = zze(zzg, "TSSE", zzfoVar);
                            } else if (i2 == 6384738) {
                                zzbxVar = zze(zzg, "TALB", zzfoVar);
                            } else if (i2 == 7108978) {
                                zzbxVar = zze(zzg, "USLT", zzfoVar);
                            } else if (i2 == 6776174) {
                                zzbxVar = zze(zzg, "TCON", zzfoVar);
                            } else {
                                if (i2 == 6779504) {
                                    zzbxVar = zze(zzg, "TIT1", zzfoVar);
                                }
                                zzfe.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzaja.zzf(zzg));
                            }
                        }
                        zzbxVar = zze(zzg, "TCOM", zzfoVar);
                    }
                    zzbxVar = zze(zzg, "TIT2", zzfoVar);
                }
            } else if (zzg == 1735291493) {
                int zzb2 = zzb(zzfoVar);
                String str2 = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                if (str2 != null) {
                    zzagoVar = new zzahl("TCON", null, zzfzn.zzn(str2));
                    zzbxVar = zzagoVar;
                } else {
                    zzfe.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (zzg == 1684632427) {
                zzbxVar = zzd(1684632427, "TPOS", zzfoVar);
            } else if (zzg == 1953655662) {
                zzbxVar = zzd(1953655662, "TRCK", zzfoVar);
            } else if (zzg == 1953329263) {
                zzbxVar = zzc(1953329263, "TBPM", zzfoVar, true, false);
            } else if (zzg == 1668311404) {
                zzbxVar = zzc(1668311404, "TCMP", zzfoVar, true, true);
            } else if (zzg == 1668249202) {
                int zzg3 = zzfoVar.zzg();
                if (zzfoVar.zzg() == 1684108385) {
                    int zzg4 = zzfoVar.zzg() & ViewCompat.MEASURED_SIZE_MASK;
                    if (zzg4 == 13) {
                        str = "image/jpeg";
                    } else if (zzg4 == 14) {
                        str = "image/png";
                        zzg4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzfe.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzg4);
                    } else {
                        zzfoVar.zzL(4);
                        int i3 = zzg3 - 16;
                        byte[] bArr = new byte[i3];
                        zzfoVar.zzG(bArr, 0, i3);
                        zzagoVar = new zzago(str, null, 3, bArr);
                        zzbxVar = zzagoVar;
                    }
                } else {
                    zzfe.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg == 1631670868) {
                zzbxVar = zze(1631670868, "TPE2", zzfoVar);
            } else if (zzg == 1936682605) {
                zzbxVar = zze(1936682605, "TSOT", zzfoVar);
            } else if (zzg == 1936679276) {
                zzbxVar = zze(1936679276, "TSO2", zzfoVar);
            } else if (zzg == 1936679282) {
                zzbxVar = zze(1936679282, "TSOA", zzfoVar);
            } else if (zzg == 1936679265) {
                zzbxVar = zze(1936679265, "TSOP", zzfoVar);
            } else if (zzg == 1936679791) {
                zzbxVar = zze(1936679791, "TSOC", zzfoVar);
            } else if (zzg == 1920233063) {
                zzbxVar = zzc(1920233063, "ITUNESADVISORY", zzfoVar, false, false);
            } else if (zzg == 1885823344) {
                zzbxVar = zzc(1885823344, "ITUNESGAPLESS", zzfoVar, false, true);
            } else if (zzg == 1936683886) {
                zzbxVar = zze(1936683886, "TVSHOWSORT", zzfoVar);
            } else if (zzg == 1953919848) {
                zzbxVar = zze(1953919848, "TVSHOW", zzfoVar);
            } else {
                if (zzg == 757935405) {
                    String str3 = null;
                    String str4 = null;
                    int i4 = -1;
                    int i5 = -1;
                    while (zzfoVar.zzd() < zzd) {
                        int zzd2 = zzfoVar.zzd();
                        int zzg5 = zzfoVar.zzg();
                        int zzg6 = zzfoVar.zzg();
                        zzfoVar.zzL(4);
                        if (zzg6 == 1835360622) {
                            str3 = zzfoVar.zzz(zzg5 - 12);
                        } else {
                            int i6 = zzg5 - 12;
                            if (zzg6 == 1851878757) {
                                str4 = zzfoVar.zzz(i6);
                            } else {
                                if (zzg6 == 1684108385) {
                                    i5 = zzg5;
                                }
                                if (zzg6 == 1684108385) {
                                    i4 = zzd2;
                                }
                                zzfoVar.zzL(i6);
                            }
                        }
                    }
                    if (str3 != null && str4 != null && i4 != -1) {
                        zzfoVar.zzK(i4);
                        zzfoVar.zzL(16);
                        zzbxVar = new zzahf(str3, str4, zzfoVar.zzz(i5 - 16));
                    }
                }
                zzfe.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzaja.zzf(zzg));
            }
            return zzbxVar;
        } finally {
            zzfoVar.zzK(zzd);
        }
    }

    private static int zzb(zzfo zzfoVar) {
        zzfoVar.zzL(4);
        if (zzfoVar.zzg() == 1684108385) {
            zzfoVar.zzL(8);
            return zzfoVar.zzm();
        }
        zzfe.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzahd zzc(int i, String str, zzfo zzfoVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzfoVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            zzfe.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaja.zzf(i)));
            return null;
        } else if (z) {
            return new zzahl(str, null, zzfzn.zzn(Integer.toString(zzb2)));
        } else {
            return new zzagw("und", str, Integer.toString(zzb2));
        }
    }

    private static zzahl zzd(int i, String str, zzfo zzfoVar) {
        int zzg = zzfoVar.zzg();
        if (zzfoVar.zzg() == 1684108385 && zzg >= 22) {
            zzfoVar.zzL(10);
            int zzq = zzfoVar.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzfoVar.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzahl(str, null, zzfzn.zzn(sb2));
            }
        }
        zzfe.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaja.zzf(i)));
        return null;
    }

    private static zzahl zze(int i, String str, zzfo zzfoVar) {
        int zzg = zzfoVar.zzg();
        if (zzfoVar.zzg() == 1684108385) {
            zzfoVar.zzL(8);
            return new zzahl(str, null, zzfzn.zzn(zzfoVar.zzz(zzg - 16)));
        }
        zzfe.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzaja.zzf(i)));
        return null;
    }
}
