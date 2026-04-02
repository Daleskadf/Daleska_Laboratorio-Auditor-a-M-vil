package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* loaded from: classes.dex */
public enum zzrn implements zzfc {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(RecognitionOptions.ITF),
    FORMAT_QR_CODE(RecognitionOptions.QR_CODE),
    FORMAT_UPC_A(RecognitionOptions.UPC_A),
    FORMAT_UPC_E(RecognitionOptions.UPC_E),
    FORMAT_PDF417(RecognitionOptions.PDF417),
    FORMAT_AZTEC(RecognitionOptions.AZTEC);
    
    private final int zzp;

    zzrn(int i7) {
        this.zzp = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfc
    public final int zza() {
        return this.zzp;
    }
}
