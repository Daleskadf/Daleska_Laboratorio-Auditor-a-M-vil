package E6;

import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f1084a;

    public d(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        this.f1084a = compile;
    }

    public final String toString() {
        String pattern = this.f1084a.toString();
        kotlin.jvm.internal.j.d(pattern, "toString(...)");
        return pattern;
    }
}
