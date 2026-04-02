package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import java.io.Closeable;
import java.nio.ByteBuffer;
import n5.C1534a;
import x3.C1987a;
/* loaded from: classes.dex */
public class BarhopperV3 implements Closeable {
    private static final long NULLPTR = 0;
    private static final String TAG = "BarhopperV3";
    private long nativePointer;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i7, int i8, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i7, int i8, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j, int i7, int i8, int i9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j, int i7, int i8, int i9, byte[] bArr, RecognitionOptions recognitionOptions);

    private static C1534a toProto(byte[] bArr) {
        bArr.getClass();
        try {
            return C1534a.a(bArr, zzds.zza());
        } catch (zzer e7) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.nativePointer;
        if (j != NULLPTR) {
            closeNative(j);
            this.nativePointer = NULLPTR;
        }
    }

    public void create() {
        if (this.nativePointer != NULLPTR) {
            Log.w(TAG, "Native pointer already exists.");
            return;
        }
        long createNative = createNative();
        this.nativePointer = createNative;
        if (createNative == NULLPTR) {
            throw new IllegalStateException("Failed to create native pointer.");
        }
    }

    public C1534a recognize(int i7, int i8, int i9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.nativePointer;
        if (j != NULLPTR) {
            return toProto(recognizeStridedBufferNative(j, i7, i8, i9, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public void create(C1987a c1987a) {
        if (this.nativePointer != NULLPTR) {
            Log.w(TAG, "Native pointer already exists.");
            return;
        }
        long createNativeWithClientOptions = createNativeWithClientOptions(c1987a.zzD());
        this.nativePointer = createNativeWithClientOptions;
        if (createNativeWithClientOptions == NULLPTR) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    public C1534a recognize(int i7, int i8, int i9, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.nativePointer;
        if (j != NULLPTR) {
            return toProto(recognizeStridedNative(j, i7, i8, i9, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C1534a recognize(int i7, int i8, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.nativePointer;
        if (j != NULLPTR) {
            return toProto(recognizeBufferNative(j, i7, i8, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C1534a recognize(int i7, int i8, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.nativePointer;
        if (j != NULLPTR) {
            return toProto(recognizeNative(j, i7, i8, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public C1534a recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.nativePointer != NULLPTR) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                Log.d(TAG, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                bitmap = bitmap.copy(config2, bitmap.isMutable());
            }
            return toProto(recognizeBitmapNative(this.nativePointer, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }
}
