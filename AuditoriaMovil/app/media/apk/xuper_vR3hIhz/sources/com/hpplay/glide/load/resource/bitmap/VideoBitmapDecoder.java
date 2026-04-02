package com.hpplay.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import com.hpplay.glide.load.DecodeFormat;
import com.hpplay.glide.load.engine.bitmap_recycle.BitmapPool;
/* loaded from: classes2.dex */
public class VideoBitmapDecoder implements BitmapDecoder<ParcelFileDescriptor> {
    private static final MediaMetadataRetrieverFactory DEFAULT_FACTORY = new MediaMetadataRetrieverFactory();
    private static final int NO_FRAME = -1;
    private MediaMetadataRetrieverFactory factory;
    private int frame;

    /* loaded from: classes2.dex */
    public static class MediaMetadataRetrieverFactory {
        public MediaMetadataRetriever build() {
            return new MediaMetadataRetriever();
        }
    }

    public VideoBitmapDecoder() {
        this(DEFAULT_FACTORY, -1);
    }

    private static int checkValidFrame(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException("Requested frame must be non-negative");
    }

    @Override // com.hpplay.glide.load.resource.bitmap.BitmapDecoder
    public String getId() {
        return "VideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    }

    public VideoBitmapDecoder(int i10) {
        this(DEFAULT_FACTORY, checkValidFrame(i10));
    }

    @Override // com.hpplay.glide.load.resource.bitmap.BitmapDecoder
    public Bitmap decode(ParcelFileDescriptor parcelFileDescriptor, BitmapPool bitmapPool, int i10, int i11, DecodeFormat decodeFormat) {
        Bitmap frameAtTime;
        MediaMetadataRetriever build = this.factory.build();
        build.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i12 = this.frame;
        if (i12 >= 0) {
            frameAtTime = build.getFrameAtTime(i12);
        } else {
            frameAtTime = build.getFrameAtTime();
        }
        build.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }

    public VideoBitmapDecoder(MediaMetadataRetrieverFactory mediaMetadataRetrieverFactory) {
        this(mediaMetadataRetrieverFactory, -1);
    }

    public VideoBitmapDecoder(MediaMetadataRetrieverFactory mediaMetadataRetrieverFactory, int i10) {
        this.factory = mediaMetadataRetrieverFactory;
        this.frame = i10;
    }
}
