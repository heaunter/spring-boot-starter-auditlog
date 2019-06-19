package wiki.xsx.core.log;

import java.lang.annotation.*;

/**
 * 参数日志
 * @author xsx
 * @date 2019/6/17
 * @since 1.8
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamLog {
    /**
     * 业务名称
     * @return
     */
    String value();

    /**
     * 日志级别
     * @return
     */
    Level level() default Level.DEBUG;
}
