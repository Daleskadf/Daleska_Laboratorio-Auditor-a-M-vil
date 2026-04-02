package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzas extends UIController implements RemoteMediaClient.ProgressListener {
    private final CastSeekBar zza;
    private final long zzb;
    private final com.google.android.gms.cast.framework.media.uicontroller.zza zzc;

    public zzas(CastSeekBar castSeekBar, long j10, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.zza = castSeekBar;
        this.zzb = j10;
        this.zzc = zzaVar;
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final RemoteMediaClient getRemoteMediaClient() {
        return super.getRemoteMediaClient();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void onProgressUpdated(long j10, long j11) {
        zzb();
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        if (super.getRemoteMediaClient() != null) {
            super.getRemoteMediaClient().addProgressListener(this, this.zzb);
        }
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        if (super.getRemoteMediaClient() != null) {
            super.getRemoteMediaClient().removeProgressListener(this);
        }
        super.onSessionEnded();
        zzc();
    }

    public final void zza() {
        int i10;
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        AdBreakClipInfo adBreakClipInfo = null;
        if (remoteMediaClient != null && remoteMediaClient.isPlayingAd()) {
            int approximateAdBreakClipPositionMs = (int) remoteMediaClient.getApproximateAdBreakClipPositionMs();
            MediaStatus mediaStatus = remoteMediaClient.getMediaStatus();
            if (mediaStatus != null) {
                adBreakClipInfo = mediaStatus.getCurrentAdBreakClip();
            }
            if (adBreakClipInfo != null) {
                i10 = (int) adBreakClipInfo.getDurationInMs();
            } else {
                i10 = approximateAdBreakClipPositionMs;
            }
            if (approximateAdBreakClipPositionMs < 0) {
                approximateAdBreakClipPositionMs = 0;
            }
            if (i10 < 0) {
                i10 = 1;
            }
            if (approximateAdBreakClipPositionMs > i10) {
                i10 = approximateAdBreakClipPositionMs;
            }
            CastSeekBar castSeekBar = this.zza;
            castSeekBar.zzb = new com.google.android.gms.cast.framework.media.widget.zzc(approximateAdBreakClipPositionMs, i10);
            castSeekBar.postInvalidate();
            return;
        }
        CastSeekBar castSeekBar2 = this.zza;
        castSeekBar2.zzb = null;
        castSeekBar2.postInvalidate();
    }

    public final void zzb() {
        int zza;
        int zza2;
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        boolean z10 = true;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && !remoteMediaClient.isPlayingAd()) {
            this.zza.setEnabled(true);
        } else {
            this.zza.setEnabled(false);
        }
        com.google.android.gms.cast.framework.media.widget.zze zzeVar = new com.google.android.gms.cast.framework.media.widget.zze();
        zzeVar.zza = this.zzc.zza();
        zzeVar.zzb = this.zzc.zzb();
        zzeVar.zzc = (int) (-this.zzc.zze());
        RemoteMediaClient remoteMediaClient2 = super.getRemoteMediaClient();
        if (remoteMediaClient2 != null && remoteMediaClient2.hasMediaSession() && remoteMediaClient2.zzq()) {
            zza = this.zzc.zzd();
        } else {
            zza = this.zzc.zza();
        }
        zzeVar.zzd = zza;
        RemoteMediaClient remoteMediaClient3 = super.getRemoteMediaClient();
        if (remoteMediaClient3 != null && remoteMediaClient3.hasMediaSession() && remoteMediaClient3.zzq()) {
            zza2 = this.zzc.zzc();
        } else {
            zza2 = this.zzc.zza();
        }
        zzeVar.zze = zza2;
        RemoteMediaClient remoteMediaClient4 = super.getRemoteMediaClient();
        zzeVar.zzf = (remoteMediaClient4 != null && remoteMediaClient4.hasMediaSession() && remoteMediaClient4.zzq()) ? false : false;
        this.zza.zze(zzeVar);
    }

    public final void zzc() {
        int min;
        zzb();
        ArrayList arrayList = null;
        if (super.getRemoteMediaClient() == null) {
            this.zza.zzd(null);
        } else {
            MediaInfo mediaInfo = super.getRemoteMediaClient().getMediaInfo();
            if (super.getRemoteMediaClient().hasMediaSession() && !super.getRemoteMediaClient().isLoadingNextItem() && mediaInfo != null) {
                CastSeekBar castSeekBar = this.zza;
                List<AdBreakInfo> adBreaks = mediaInfo.getAdBreaks();
                if (adBreaks != null) {
                    arrayList = new ArrayList();
                    for (AdBreakInfo adBreakInfo : adBreaks) {
                        if (adBreakInfo != null) {
                            long playbackPositionInMs = adBreakInfo.getPlaybackPositionInMs();
                            if (playbackPositionInMs == -1000) {
                                min = this.zzc.zzb();
                            } else {
                                min = Math.min((int) (playbackPositionInMs - this.zzc.zze()), this.zzc.zzb());
                            }
                            if (min >= 0) {
                                arrayList.add(new com.google.android.gms.cast.framework.media.widget.zzb(min, (int) adBreakInfo.getDurationInMs(), adBreakInfo.isExpanded()));
                            }
                        }
                    }
                }
                castSeekBar.zzd(arrayList);
            } else {
                this.zza.zzd(null);
            }
        }
        zza();
    }
}
