package ca;

import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
/* loaded from: classes3.dex */
public final class p0 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5789a;

    public p0(boolean z10) {
        this.f5789a = z10;
    }

    @Override // ca.a1
    public q1 c() {
        return null;
    }

    @Override // ca.a1
    public boolean isActive() {
        return this.f5789a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append(ASCIIPropertyListParser.DICTIONARY_END_TOKEN);
        return sb.toString();
    }
}
