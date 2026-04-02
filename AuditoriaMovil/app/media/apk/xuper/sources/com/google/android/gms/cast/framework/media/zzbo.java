package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbo implements com.google.android.gms.cast.internal.zzam {
    final /* synthetic */ RemoteMediaClient zza;

    public /* synthetic */ zzbo(RemoteMediaClient remoteMediaClient, zzbn zzbnVar) {
        this.zza = remoteMediaClient;
    }

    private final void zzn() {
        RemoteMediaClient.ParseAdsInfoCallback parseAdsInfoCallback;
        MediaStatus mediaStatus;
        RemoteMediaClient.ParseAdsInfoCallback parseAdsInfoCallback2;
        RemoteMediaClient.ParseAdsInfoCallback parseAdsInfoCallback3;
        parseAdsInfoCallback = this.zza.zzk;
        if (parseAdsInfoCallback != null && (mediaStatus = this.zza.getMediaStatus()) != null) {
            MediaStatus.Writer writer = mediaStatus.getWriter();
            parseAdsInfoCallback2 = this.zza.zzk;
            writer.setIsPlayingAd(parseAdsInfoCallback2.parseIsPlayingAdFromMediaStatus(mediaStatus));
            parseAdsInfoCallback3 = this.zza.zzk;
            List<AdBreakInfo> parseAdBreaksFromMediaStatus = parseAdsInfoCallback3.parseAdBreaksFromMediaStatus(mediaStatus);
            MediaInfo mediaInfo = this.zza.getMediaInfo();
            if (mediaInfo != null) {
                mediaInfo.getWriter().setAdBreaks(parseAdBreaksFromMediaStatus);
            }
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zza() {
        List<RemoteMediaClient.Listener> list;
        list = this.zza.zzh;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onAdBreakStatusUpdated();
        }
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.onAdBreakStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzb(MediaError mediaError) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.onMediaError(mediaError);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzc() {
        List<RemoteMediaClient.Listener> list;
        zzn();
        list = this.zza.zzh;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onMetadataUpdated();
        }
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.onMetadataUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzd() {
        List<RemoteMediaClient.Listener> list;
        list = this.zza.zzh;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onPreloadStatusUpdated();
        }
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.onPreloadStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zze(int[] iArr) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zza(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzf(int[] iArr, int i10) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zzb(iArr, i10);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzg(MediaQueueItem[] mediaQueueItemArr) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zzc(mediaQueueItemArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzh(int[] iArr) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zzd(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzi(List<Integer> list, List<Integer> list2, int i10) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zze(list, list2, i10);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzj(int[] iArr) {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zzf(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzk() {
        List<RemoteMediaClient.Listener> list;
        list = this.zza.zzh;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onQueueStatusUpdated();
        }
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.onQueueStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzl() {
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.zzg();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzam
    public final void zzm() {
        List<RemoteMediaClient.Listener> list;
        zzn();
        RemoteMediaClient.zzl(this.zza);
        list = this.zza.zzh;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onStatusUpdated();
        }
        for (RemoteMediaClient.Callback callback : this.zza.zza) {
            callback.onStatusUpdated();
        }
    }
}
