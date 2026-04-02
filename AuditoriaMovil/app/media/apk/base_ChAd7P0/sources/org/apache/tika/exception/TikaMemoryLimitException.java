package org.apache.tika.exception;

import D.AbstractC0059i;
/* loaded from: classes.dex */
public class TikaMemoryLimitException extends TikaException {
    public TikaMemoryLimitException(String str) {
        super(str);
    }

    private static String msg(long j, long j8) {
        StringBuilder sb = new StringBuilder("Tried to allocate ");
        sb.append(j);
        sb.append(" bytes, but ");
        return AbstractC0059i.C(sb, j8, " is the maximum allowed. Please open an issue https://issues.apache.org/jira/projects/TIKA if you believe this file is not corrupt.");
    }

    public TikaMemoryLimitException(long j, long j8) {
        super(msg(j, j8));
    }
}
