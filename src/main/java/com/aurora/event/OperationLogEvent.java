package com.aurora.event;

import com.aurora.entity.OperationLog;
import org.springframework.context.ApplicationEvent;
/**操作数据库事件
 * */
public class OperationLogEvent extends ApplicationEvent {

    public OperationLogEvent(OperationLog operationLog) {
        super(operationLog);
    }
}
