package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;
@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public final class MultiScaleDecodingOptions {
    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];
    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;
    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public float[] getExtraScales() {
        return this.extraScales;
    }

    public int getMinimumDetectedDimension() {
        return this.minimumDetectedDimension;
    }

    public boolean getSkipProcessingIfBarcodeFound() {
        return this.skipProcessingIfBarcodeFound;
    }

    public void setExtraScales(float[] fArr) {
        this.extraScales = fArr;
    }

    public void setMinimumDetectedDimension(int i7) {
        this.minimumDetectedDimension = i7;
    }

    public void setSkipProcessingIfBarcodeFound(boolean z7) {
        this.skipProcessingIfBarcodeFound = z7;
    }
}
