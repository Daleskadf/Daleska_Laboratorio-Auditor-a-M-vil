package org.apache.tika.parser;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
/* loaded from: classes.dex */
public abstract class AbstractExternalProcessParser implements Parser {
    private static final ConcurrentHashMap<String, Process> PROCESS_MAP = new ConcurrentHashMap<>();
    private static final long serialVersionUID = 7186985395903074255L;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new a(0)));
    }

    public static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new org.apache.tika.mime.a(1));
    }

    public String register(Process process) {
        String uuid = UUID.randomUUID().toString();
        PROCESS_MAP.put(uuid, process);
        return uuid;
    }

    public Process release(String str) {
        return PROCESS_MAP.remove(str);
    }
}
