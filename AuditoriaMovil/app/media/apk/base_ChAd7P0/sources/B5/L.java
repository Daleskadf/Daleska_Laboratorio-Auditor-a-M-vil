package B5;

import android.content.Context;
import android.view.KeyCharacterMap;
import j3.InterfaceC1365b;
/* loaded from: classes.dex */
public final class L implements InterfaceC1365b {

    /* renamed from: a  reason: collision with root package name */
    public int f327a;

    public Character a(int i7) {
        char c8 = (char) i7;
        if ((Integer.MIN_VALUE & i7) != 0) {
            int i8 = i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            int i9 = this.f327a;
            if (i9 != 0) {
                this.f327a = KeyCharacterMap.getDeadChar(i9, i8);
            } else {
                this.f327a = i8;
            }
        } else {
            int i10 = this.f327a;
            if (i10 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i10, i7);
                if (deadChar > 0) {
                    c8 = (char) deadChar;
                }
                this.f327a = 0;
            }
        }
        return Character.valueOf(c8);
    }

    @Override // j3.InterfaceC1365b
    public int c(Context context, String str) {
        return this.f327a;
    }

    @Override // j3.InterfaceC1365b
    public int e(Context context, String str, boolean z7) {
        return 0;
    }

    public L() {
        this.f327a = 0;
    }

    public L(int i7, int i8) {
        m5.d.i("Generator ID %d contains more than %d reserved bits", (i7 & 1) == i7, Integer.valueOf(i7), 1);
        m5.d.i("Cannot supply target ID from different generator ID", (i8 & 1) == i7, new Object[0]);
        this.f327a = i8;
    }
}
