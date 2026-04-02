package j7;

import android.media.AudioAttributes;
import j$.util.Objects;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13461a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13462b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13463c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13464d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13465e;
    public final int f;

    public a(boolean z7, boolean z8, int i7, int i8, int i9, int i10) {
        this.f13461a = z7;
        this.f13462b = z8;
        this.f13463c = i7;
        this.f13464d = i8;
        this.f13465e = i9;
        this.f = i10;
    }

    public static a b(a aVar) {
        boolean z7 = aVar.f13461a;
        boolean z8 = aVar.f13462b;
        int i7 = aVar.f13463c;
        int i8 = aVar.f13464d;
        int i9 = aVar.f13465e;
        int i10 = aVar.f;
        aVar.getClass();
        return new a(z7, z8, i7, i8, i9, i10);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f13464d).setContentType(this.f13463c).build();
        j.d(build, "Builder()\n            .s…ype)\n            .build()");
        return build;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13461a == aVar.f13461a && this.f13462b == aVar.f13462b && this.f13463c == aVar.f13463c && this.f13464d == aVar.f13464d && this.f13465e == aVar.f13465e && this.f == aVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f13461a), Boolean.valueOf(this.f13462b), Integer.valueOf(this.f13463c), Integer.valueOf(this.f13464d), Integer.valueOf(this.f13465e), Integer.valueOf(this.f));
    }

    public final String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f13461a + ", stayAwake=" + this.f13462b + ", contentType=" + this.f13463c + ", usageType=" + this.f13464d + ", audioFocus=" + this.f13465e + ", audioMode=" + this.f + ')';
    }
}
