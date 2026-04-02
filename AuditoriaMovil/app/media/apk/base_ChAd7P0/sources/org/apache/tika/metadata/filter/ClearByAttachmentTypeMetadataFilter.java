package org.apache.tika.metadata.filter;

import io.flutter.plugins.pathprovider.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
/* loaded from: classes.dex */
public class ClearByAttachmentTypeMetadataFilter extends MetadataFilter {
    private final Set<String> types;

    public ClearByAttachmentTypeMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        String str = metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE);
        if (str == null || !this.types.contains(str)) {
            return;
        }
        for (String str2 : metadata.names()) {
            metadata.remove(str2);
        }
    }

    public List<String> getTypes() {
        return new ArrayList(this.types);
    }

    @Field
    public void setTypes(List<String> list) {
        for (String str : list) {
            try {
                TikaCoreProperties.EmbeddedResourceType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                TikaCoreProperties.EmbeddedResourceType[] values = TikaCoreProperties.EmbeddedResourceType.values();
                int length = values.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    TikaCoreProperties.EmbeddedResourceType embeddedResourceType = values[i7];
                    int i9 = i8 + 1;
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(embeddedResourceType.name());
                    i7++;
                    i8 = i9;
                }
                throw new TikaConfigException(b.i("I'm sorry. I regret I don't recognise ", str, ". I do recognize the following (case-sensitive):", sb.toString()));
            }
        }
        this.types.addAll(list);
    }

    public ClearByAttachmentTypeMetadataFilter(Set<String> set) {
        this.types = set;
    }
}
