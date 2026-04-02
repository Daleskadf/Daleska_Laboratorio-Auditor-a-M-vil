package y5;

import com.google.android.libraries.barhopper.RecognitionOptions;
/* renamed from: y5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2037b {
    UNKNOWN(-1),
    ALL_FORMATS(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(4),
    CODABAR(8),
    DATA_MATRIX(16),
    EAN_13(32),
    EAN_8(64),
    ITF(RecognitionOptions.ITF),
    QR_CODE(RecognitionOptions.QR_CODE),
    UPC_A(RecognitionOptions.UPC_A),
    UPC_E(RecognitionOptions.UPC_E),
    PDF417(RecognitionOptions.PDF417),
    AZTEC(RecognitionOptions.AZTEC);
    
    public static final C2036a Companion = new Object();
    private final int intValue;

    EnumC2037b(int i7) {
        this.intValue = i7;
    }

    public final int a() {
        return this.intValue;
    }
}
