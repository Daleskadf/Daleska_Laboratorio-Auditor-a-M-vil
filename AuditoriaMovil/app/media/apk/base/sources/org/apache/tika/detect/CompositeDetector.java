package org.apache.tika.detect;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MediaTypeRegistry;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public class CompositeDetector implements Detector {
    private static final long serialVersionUID = 5980683158436430252L;
    private final List<Detector> detectors;
    private final MediaTypeRegistry registry;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeDetector(MediaTypeRegistry mediaTypeRegistry, List<Detector> list, Collection<Class<? extends Detector>> collection) {
        if (collection != null && !collection.isEmpty()) {
            this.detectors = new ArrayList();
            for (Detector detector : list) {
                if (!isExcluded(collection, detector.getClass())) {
                    this.detectors.add(detector);
                }
            }
        } else {
            this.detectors = list;
        }
        this.registry = mediaTypeRegistry;
    }

    private boolean assignableFrom(Collection<Class<? extends Detector>> collection, Class<? extends Detector> cls) {
        for (Class<? extends Detector> cls2 : collection) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    private static MediaType detectOverrides(Metadata metadata) {
        MediaType parse;
        MediaType parse2;
        String str = metadata.get(TikaCoreProperties.CONTENT_TYPE_USER_OVERRIDE);
        if (!StringUtils.isBlank(str) && (parse2 = MediaType.parse(str)) != null) {
            return parse2;
        }
        String str2 = metadata.get(TikaCoreProperties.CONTENT_TYPE_PARSER_OVERRIDE);
        if (!StringUtils.isBlank(str2) && (parse = MediaType.parse(str2)) != null) {
            return parse;
        }
        return null;
    }

    private boolean isExcluded(Collection<Class<? extends Detector>> collection, Class<? extends Detector> cls) {
        if (!collection.contains(cls) && !assignableFrom(collection, cls)) {
            return false;
        }
        return true;
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        MediaType detectOverrides = detectOverrides(metadata);
        if (detectOverrides != null) {
            return detectOverrides;
        }
        MediaType mediaType = MediaType.OCTET_STREAM;
        for (Detector detector : getDetectors()) {
            MediaType detect = detector.detect(inputStream, metadata);
            if (this.registry.isSpecializationOf(detect, mediaType)) {
                mediaType = detect;
            }
        }
        return mediaType;
    }

    public List<Detector> getDetectors() {
        return DesugarCollections.unmodifiableList(this.detectors);
    }

    public CompositeDetector(MediaTypeRegistry mediaTypeRegistry, List<Detector> list) {
        this(mediaTypeRegistry, list, null);
    }

    public CompositeDetector(List<Detector> list) {
        this(new MediaTypeRegistry(), list);
    }

    public CompositeDetector(Detector... detectorArr) {
        this(Arrays.asList(detectorArr));
    }
}
