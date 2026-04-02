package org.apache.tika.config;

import g7.d;
import io.flutter.plugins.pathprovider.b;
/* loaded from: classes.dex */
public interface LoadErrorHandler {
    public static final LoadErrorHandler IGNORE = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.1
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
        }

        public String toString() {
            return "IGNORE";
        }
    };
    public static final LoadErrorHandler WARN = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.2
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
            d.c(str).p(str, th, "Unable to load {}");
        }

        public String toString() {
            return "WARN";
        }
    };
    public static final LoadErrorHandler THROW = new LoadErrorHandler() { // from class: org.apache.tika.config.LoadErrorHandler.3
        @Override // org.apache.tika.config.LoadErrorHandler
        public void handleLoadError(String str, Throwable th) {
            throw new RuntimeException(b.h("Unable to load ", str), th);
        }

        public String toString() {
            return "THROW";
        }
    };

    void handleLoadError(String str, Throwable th);
}
