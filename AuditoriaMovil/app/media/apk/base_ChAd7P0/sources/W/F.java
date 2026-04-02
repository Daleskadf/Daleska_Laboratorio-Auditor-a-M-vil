package W;

import android.app.Notification;
import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public abstract class F {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [W.O, java.lang.Object] */
    public static O b(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            iconCompat = IconCompat.b(person.getIcon());
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ?? obj = new Object();
        obj.f6016a = name;
        obj.f6017b = iconCompat;
        obj.f6018c = uri;
        obj.f6019d = key;
        obj.f6020e = isBot;
        obj.f = isImportant;
        return obj;
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static Person d(O o7) {
        Person.Builder name = new Person.Builder().setName(o7.f6016a);
        Icon icon = null;
        IconCompat iconCompat = o7.f6017b;
        if (iconCompat != null) {
            icon = iconCompat.h(null);
        }
        return name.setIcon(icon).setUri(o7.f6018c).setKey(o7.f6019d).setBot(o7.f6020e).setImportant(o7.f).build();
    }
}
