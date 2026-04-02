package M0;

import java.io.IOException;
/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3158b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f3159a;

    public i(int i7) {
        this.f3159a = i7;
    }

    public i(Exception exc, int i7) {
        super(exc);
        this.f3159a = i7;
    }

    public i(String str, int i7) {
        super(str);
        this.f3159a = i7;
    }

    public i(String str, Exception exc, int i7) {
        super(str, exc);
        this.f3159a = i7;
    }
}
