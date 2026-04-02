package D3;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f863a;

    static {
        byte[] bArr = new byte[RecognitionOptions.ITF];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i8 = 0; i8 < 26; i8++) {
            byte b5 = (byte) (i8 + 10);
            bArr[i8 + 65] = b5;
            bArr[i8 + 97] = b5;
        }
        f863a = bArr;
    }
}
