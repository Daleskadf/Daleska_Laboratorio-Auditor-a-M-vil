package org.apache.tika.sax;

import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
class LinkBuilder {
    private final String type;
    private final StringBuilder text = new StringBuilder();
    private String uri = StringUtils.EMPTY;
    private String title = StringUtils.EMPTY;
    private String rel = StringUtils.EMPTY;

    public LinkBuilder(String str) {
        this.type = str;
    }

    public void characters(char[] cArr, int i7, int i8) {
        this.text.append(cArr, i7, i8);
    }

    public Link getLink() {
        return getLink(false);
    }

    public String getType() {
        return this.type;
    }

    public void setRel(String str) {
        if (str != null) {
            this.rel = str;
        } else {
            this.rel = StringUtils.EMPTY;
        }
    }

    public void setTitle(String str) {
        if (str != null) {
            this.title = str;
        } else {
            this.title = StringUtils.EMPTY;
        }
    }

    public void setURI(String str) {
        if (str != null) {
            this.uri = str;
        } else {
            this.uri = StringUtils.EMPTY;
        }
    }

    public Link getLink(boolean z7) {
        String sb = this.text.toString();
        if (z7) {
            sb = sb.replaceAll("\\s+", StringUtils.SPACE).trim();
        }
        return new Link(this.type, this.uri, this.title, sb, this.rel);
    }
}
