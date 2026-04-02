package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbp;
import h5.BinderC1088a;
import i3.InterfaceC1109a;
import i3.b;
@DynamiteApi
/* loaded from: classes.dex */
public class ThickBarcodeScannerCreator extends zzbp {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbq
    public zzbn newBarcodeScanner(InterfaceC1109a interfaceC1109a, zzba zzbaVar) {
        return new BinderC1088a((Context) b.c(interfaceC1109a), zzbaVar);
    }
}
