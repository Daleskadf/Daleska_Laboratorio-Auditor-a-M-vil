package org.apache.tika.renderer;

import j$.util.Objects;
/* loaded from: classes.dex */
public class PageRangeRequest implements RenderRequest {
    public static PageRangeRequest RENDER_ALL = new PageRangeRequest(1, -1);
    private final int from;
    private final int to;

    public PageRangeRequest(int i7, int i8) {
        this.from = i7;
        this.to = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageRangeRequest pageRangeRequest = (PageRangeRequest) obj;
        if (this.from == pageRangeRequest.from && this.to == pageRangeRequest.to) {
            return true;
        }
        return false;
    }

    public int getFrom() {
        return this.from;
    }

    public int getTo() {
        return this.to;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.from), Integer.valueOf(this.to));
    }
}
