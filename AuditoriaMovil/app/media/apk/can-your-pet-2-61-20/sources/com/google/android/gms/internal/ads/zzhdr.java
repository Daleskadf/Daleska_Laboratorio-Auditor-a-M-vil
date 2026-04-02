package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzhdr implements zzgzz {
    USER_POPULATION_UNSPECIFIED(0),
    CARTER_SB_CHROME_INTERSTITIAL(1),
    GMAIL_PHISHY_JOURNEY(2),
    DOWNLOAD_RELATED_POPULATION_MIN(1000),
    RISKY_DOWNLOADER(PointerIconCompat.TYPE_CONTEXT_MENU),
    INFREQUENT_DOWNLOADER(PointerIconCompat.TYPE_HAND),
    REGULAR_DOWNLOADER(PointerIconCompat.TYPE_HELP),
    BOTLIKE_DOWNLOADER(PointerIconCompat.TYPE_WAIT),
    DOCUMENT_DOWNLOADER(1005),
    HIGHLY_TECHNICAL_DOWNLOADER(PointerIconCompat.TYPE_CELL),
    LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(PointerIconCompat.TYPE_CROSSHAIR),
    HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(PointerIconCompat.TYPE_TEXT),
    SPAM_PING_SENDER(1009),
    RFA_TRUSTED(PointerIconCompat.TYPE_ALIAS),
    DOWNLOAD_RELATED_POPULATION_MAX(1999);
    
    private static final zzhaa zzp = new zzhaa() { // from class: com.google.android.gms.internal.ads.zzhdp
        @Override // com.google.android.gms.internal.ads.zzhaa
        public final /* synthetic */ zzgzz zza(int i) {
            return zzhdr.zzc(i);
        }
    };
    private final int zzr;

    zzhdr(int i) {
        this.zzr = i;
    }

    public static zzhab zzb() {
        return zzhdq.zza;
    }

    public static zzhdr zzc(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1999) {
                        switch (i) {
                            case 1000:
                                return DOWNLOAD_RELATED_POPULATION_MIN;
                            case PointerIconCompat.TYPE_CONTEXT_MENU /* 1001 */:
                                return RISKY_DOWNLOADER;
                            case PointerIconCompat.TYPE_HAND /* 1002 */:
                                return INFREQUENT_DOWNLOADER;
                            case PointerIconCompat.TYPE_HELP /* 1003 */:
                                return REGULAR_DOWNLOADER;
                            case PointerIconCompat.TYPE_WAIT /* 1004 */:
                                return BOTLIKE_DOWNLOADER;
                            case 1005:
                                return DOCUMENT_DOWNLOADER;
                            case PointerIconCompat.TYPE_CELL /* 1006 */:
                                return HIGHLY_TECHNICAL_DOWNLOADER;
                            case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                                return LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
                            case PointerIconCompat.TYPE_TEXT /* 1008 */:
                                return HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
                            case 1009:
                                return SPAM_PING_SENDER;
                            case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                                return RFA_TRUSTED;
                            default:
                                return null;
                        }
                    }
                    return DOWNLOAD_RELATED_POPULATION_MAX;
                }
                return GMAIL_PHISHY_JOURNEY;
            }
            return CARTER_SB_CHROME_INTERSTITIAL;
        }
        return USER_POPULATION_UNSPECIFIED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzgzz
    public final int zza() {
        return this.zzr;
    }
}
