package jit.edu.paas.domain.enums;

import lombok.Getter;

/**
 * 容器状态枚举
 * @author jitwxs
 * @since 2018/6/5 23:53
 */
@Getter
public enum ContainerStatusEnum {
    STOP("容器关闭", 0),
    RUNNING("容器运行", 1),
    PAUSE("容器暂停", 2),
    REMOVE("容器被删除", 3);

    private String message;
    private int code;

    ContainerStatusEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public static String getMessage(int code) {
        for (ContainerStatusEnum enums : ContainerStatusEnum.values()) {
            if (enums.getCode() == code) {
                return enums.message;
            }
        }
        return null;
    }
}
