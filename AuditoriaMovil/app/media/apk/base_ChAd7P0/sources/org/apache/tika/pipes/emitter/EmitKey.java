package org.apache.tika.pipes.emitter;

import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
import java.io.Serializable;
/* loaded from: classes.dex */
public class EmitKey implements Serializable {
    public static EmitKey NO_EMIT = new EmitKey(null, null);
    private static final long serialVersionUID = -3861669115439125268L;
    private String emitKey;
    private String emitterName;

    public EmitKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmitKey emitKey = (EmitKey) obj;
        if (!Objects.equals(this.emitterName, emitKey.emitterName)) {
            return false;
        }
        return Objects.equals(this.emitKey, emitKey.emitKey);
    }

    public String getEmitKey() {
        return this.emitKey;
    }

    public String getEmitterName() {
        return this.emitterName;
    }

    public int hashCode() {
        int i7;
        String str = this.emitterName;
        int i8 = 0;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        String str2 = this.emitKey;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return b.j("EmitterKey{emitterName='", this.emitterName, "', emitterKey='", this.emitKey, "'}");
    }

    public EmitKey(String str, String str2) {
        this.emitterName = str;
        this.emitKey = str2;
    }
}
