package com.adobe.flashruntime.air;

import android.graphics.SurfaceTexture;
import android.view.Surface;
/* loaded from: classes.dex */
public class VideoTextureSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "VideoSurfaceTexture";
    private boolean mAmCreated;
    private long mCPPInstance;
    private Surface mSurface;
    private int mTextureId;
    private SurfaceTexture mVideoTexture;
    private boolean mPlanePositionSet = false;
    private boolean mFrameAvailable = false;

    private native void nativeSetJavaTextureSurfaceReady(long j, boolean z);

    public void VideoPlaybackRestarted() {
    }

    void setNativeInstance(long j) {
    }

    public boolean useOverlay() {
        return true;
    }

    public VideoTextureSurface(int i) {
        this.mAmCreated = false;
        this.mSurface = null;
        this.mTextureId = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.mTextureId);
        this.mVideoTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mVideoTexture);
        this.mAmCreated = true;
    }

    public boolean updateSurfaceTextureTexImage() {
        if (this.mFrameAvailable) {
            this.mVideoTexture.updateTexImage();
            this.mFrameAvailable = false;
            return true;
        }
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mFrameAvailable = true;
        notifyNativeReadyForVideoTexture();
    }

    public void setFPInstance(long j) {
        this.mCPPInstance = j;
    }

    public long getFPInstance() {
        return this.mCPPInstance;
    }

    public Surface getSurface() {
        if (this.mAmCreated && useOverlay()) {
            return this.mSurface;
        }
        return null;
    }

    public void notifyNativeReadyForVideoTexture() {
        long j = this.mCPPInstance;
        if (j != 0) {
            nativeSetJavaTextureSurfaceReady(j, this.mAmCreated);
        }
    }
}
