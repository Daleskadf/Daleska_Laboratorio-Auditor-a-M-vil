package retrofit2.converter.scalars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarResponseBodyConverters;
/* loaded from: classes2.dex */
public final class ScalarsConverterFactory extends Converter.Factory {
    private ScalarsConverterFactory() {
    }

    public static ScalarsConverterFactory create() {
        return new ScalarsConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type != String.class && type != Boolean.TYPE && type != Boolean.class && type != Byte.TYPE && type != Byte.class && type != Character.TYPE && type != Character.class && type != Double.TYPE && type != Double.class && type != Float.TYPE && type != Float.class && type != Integer.TYPE && type != Integer.class && type != Long.TYPE && type != Long.class && type != Short.TYPE && type != Short.class) {
            return null;
        }
        return ScalarRequestBodyConverter.INSTANCE;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return ScalarResponseBodyConverters.StringResponseBodyConverter.INSTANCE;
        }
        if (type != Boolean.class && type != Boolean.TYPE) {
            if (type != Byte.class && type != Byte.TYPE) {
                if (type != Character.class && type != Character.TYPE) {
                    if (type != Double.class && type != Double.TYPE) {
                        if (type != Float.class && type != Float.TYPE) {
                            if (type != Integer.class && type != Integer.TYPE) {
                                if (type != Long.class && type != Long.TYPE) {
                                    if (type != Short.class && type != Short.TYPE) {
                                        return null;
                                    }
                                    return ScalarResponseBodyConverters.ShortResponseBodyConverter.INSTANCE;
                                }
                                return ScalarResponseBodyConverters.LongResponseBodyConverter.INSTANCE;
                            }
                            return ScalarResponseBodyConverters.IntegerResponseBodyConverter.INSTANCE;
                        }
                        return ScalarResponseBodyConverters.FloatResponseBodyConverter.INSTANCE;
                    }
                    return ScalarResponseBodyConverters.DoubleResponseBodyConverter.INSTANCE;
                }
                return ScalarResponseBodyConverters.CharacterResponseBodyConverter.INSTANCE;
            }
            return ScalarResponseBodyConverters.ByteResponseBodyConverter.INSTANCE;
        }
        return ScalarResponseBodyConverters.BooleanResponseBodyConverter.INSTANCE;
    }
}
