package j4;

import h4.InterfaceC1086f;
import h4.InterfaceC1087g;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c implements InterfaceC1086f {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f13445a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f13445a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    @Override // h4.InterfaceC1081a
    public final void encode(Object obj, Object obj2) {
        ((InterfaceC1087g) obj2).add(f13445a.format((Date) obj));
    }
}
