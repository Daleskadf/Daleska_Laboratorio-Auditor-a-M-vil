package G1;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1353a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f1354b;

    public /* synthetic */ c() {
    }

    public static String b(int i7) {
        return StringUtils.EMPTY + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int d(int i7) {
        return (i7 >> 24) & 255;
    }

    public void a(int i7) {
        this.f1354b = i7 | this.f1354b;
    }

    public boolean c(int i7) {
        if ((this.f1354b & i7) == i7) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f1353a) {
            case 0:
                return b(this.f1354b);
            default:
                return super.toString();
        }
    }

    public c(int i7) {
        this.f1354b = i7;
    }
}
