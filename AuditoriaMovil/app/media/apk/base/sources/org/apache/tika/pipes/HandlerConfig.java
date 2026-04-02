package org.apache.tika.pipes;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Locale;
import org.apache.tika.sax.BasicContentHandlerFactory;
/* loaded from: classes.dex */
public class HandlerConfig implements Serializable {
    public static final HandlerConfig DEFAULT_HANDLER_CONFIG = new HandlerConfig(BasicContentHandlerFactory.HANDLER_TYPE.TEXT, PARSE_MODE.RMETA, -1, -1, true);
    private static final long serialVersionUID = -3861669115439125268L;
    int maxEmbeddedResources;
    PARSE_MODE parseMode;
    boolean throwOnWriteLimitReached;
    private BasicContentHandlerFactory.HANDLER_TYPE type;
    int writeLimit;

    /* loaded from: classes.dex */
    public enum PARSE_MODE {
        RMETA,
        CONCATENATE;

        public static PARSE_MODE parseMode(String str) {
            PARSE_MODE[] values;
            int i7 = 0;
            for (PARSE_MODE parse_mode : values()) {
                if (parse_mode.name().equalsIgnoreCase(str)) {
                    return parse_mode;
                }
            }
            StringBuilder sb = new StringBuilder();
            PARSE_MODE[] values2 = values();
            int length = values2.length;
            int i8 = 0;
            while (i7 < length) {
                PARSE_MODE parse_mode2 = values2[i7];
                int i9 = i8 + 1;
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(parse_mode2.name().toLowerCase(Locale.US));
                i7++;
                i8 = i9;
            }
            throw new IllegalArgumentException("mode must be one of: (" + ((Object) sb) + "). I regret I do not understand: " + str);
        }
    }

    public HandlerConfig() {
        this.type = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
        this.writeLimit = -1;
        this.maxEmbeddedResources = -1;
        this.throwOnWriteLimitReached = true;
        this.parseMode = PARSE_MODE.RMETA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HandlerConfig handlerConfig = (HandlerConfig) obj;
        if (this.writeLimit == handlerConfig.writeLimit && this.maxEmbeddedResources == handlerConfig.maxEmbeddedResources && this.throwOnWriteLimitReached == handlerConfig.throwOnWriteLimitReached && this.type == handlerConfig.type && this.parseMode == handlerConfig.parseMode) {
            return true;
        }
        return false;
    }

    public int getMaxEmbeddedResources() {
        return this.maxEmbeddedResources;
    }

    public PARSE_MODE getParseMode() {
        return this.parseMode;
    }

    public BasicContentHandlerFactory.HANDLER_TYPE getType() {
        return this.type;
    }

    public int getWriteLimit() {
        return this.writeLimit;
    }

    public int hashCode() {
        int i7;
        int hashCode = ((((Objects.hashCode(this.type) * 31) + this.writeLimit) * 31) + this.maxEmbeddedResources) * 31;
        if (this.throwOnWriteLimitReached) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return Objects.hashCode(this.parseMode) + ((hashCode + i7) * 31);
    }

    public boolean isThrowOnWriteLimitReached() {
        return this.throwOnWriteLimitReached;
    }

    public void setMaxEmbeddedResources(int i7) {
        this.maxEmbeddedResources = i7;
    }

    public void setParseMode(PARSE_MODE parse_mode) {
        this.parseMode = parse_mode;
    }

    public void setThrowOnWriteLimitReached(boolean z7) {
        this.throwOnWriteLimitReached = z7;
    }

    public void setType(BasicContentHandlerFactory.HANDLER_TYPE handler_type) {
        this.type = handler_type;
    }

    public void setWriteLimit(int i7) {
        this.writeLimit = i7;
    }

    public String toString() {
        BasicContentHandlerFactory.HANDLER_TYPE handler_type = this.type;
        int i7 = this.writeLimit;
        int i8 = this.maxEmbeddedResources;
        boolean z7 = this.throwOnWriteLimitReached;
        PARSE_MODE parse_mode = this.parseMode;
        return "HandlerConfig{type=" + handler_type + ", writeLimit=" + i7 + ", maxEmbeddedResources=" + i8 + ", throwOnWriteLimitReached=" + z7 + ", parseMode=" + parse_mode + "}";
    }

    public void setParseMode(String str) {
        this.parseMode = PARSE_MODE.parseMode(str);
    }

    public void setType(String str) {
        setType(BasicContentHandlerFactory.HANDLER_TYPE.valueOf(str));
    }

    public HandlerConfig(BasicContentHandlerFactory.HANDLER_TYPE handler_type, PARSE_MODE parse_mode, int i7, int i8, boolean z7) {
        this.type = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
        this.writeLimit = -1;
        this.maxEmbeddedResources = -1;
        this.throwOnWriteLimitReached = true;
        PARSE_MODE parse_mode2 = PARSE_MODE.RMETA;
        this.type = handler_type;
        this.parseMode = parse_mode;
        this.writeLimit = i7;
        this.maxEmbeddedResources = i8;
        this.throwOnWriteLimitReached = z7;
    }
}
