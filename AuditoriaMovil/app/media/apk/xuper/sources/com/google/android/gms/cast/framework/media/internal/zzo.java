package com.google.android.gms.cast.framework.media.internal;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzo extends MediaSessionCompat.b {
    final /* synthetic */ zzp zza;

    public zzo(zzp zzpVar) {
        this.zza = zzpVar;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public final boolean onMediaButtonEvent(Intent intent) {
        RemoteMediaClient remoteMediaClient;
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) {
                remoteMediaClient = this.zza.zzj;
                remoteMediaClient.togglePlayback();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public final void onPause() {
        RemoteMediaClient remoteMediaClient;
        remoteMediaClient = this.zza.zzj;
        remoteMediaClient.togglePlayback();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public final void onPlay() {
        RemoteMediaClient remoteMediaClient;
        remoteMediaClient = this.zza.zzj;
        remoteMediaClient.togglePlayback();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.b
    public final void onSeekTo(long j10) {
        RemoteMediaClient remoteMediaClient;
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.setPosition(j10);
        MediaSeekOptions build = builder.build();
        remoteMediaClient = this.zza.zzj;
        remoteMediaClient.seek(build);
    }
}
