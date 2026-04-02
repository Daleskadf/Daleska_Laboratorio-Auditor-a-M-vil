package org.apache.tika.sax.xpath;
/* loaded from: classes.dex */
public class CompositeMatcher extends Matcher {

    /* renamed from: a  reason: collision with root package name */
    private final Matcher f14621a;

    /* renamed from: b  reason: collision with root package name */
    private final Matcher f14622b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f14621a = matcher;
        this.f14622b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher descend = this.f14621a.descend(str, str2);
        Matcher descend2 = this.f14622b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        if (descend == matcher) {
            return descend2;
        }
        if (descend2 == matcher) {
            return descend;
        }
        if (this.f14621a == descend && this.f14622b == descend2) {
            return this;
        }
        return new CompositeMatcher(descend, descend2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        if (!this.f14621a.matchesAttribute(str, str2) && !this.f14622b.matchesAttribute(str, str2)) {
            return false;
        }
        return true;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        if (!this.f14621a.matchesElement() && !this.f14622b.matchesElement()) {
            return false;
        }
        return true;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        if (!this.f14621a.matchesText() && !this.f14622b.matchesText()) {
            return false;
        }
        return true;
    }
}
