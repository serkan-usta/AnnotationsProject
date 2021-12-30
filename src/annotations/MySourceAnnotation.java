
package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation with Source Retention Policy
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface MySourceAnnotation {
}