package org.lpw.tephra.nio;

/**
 * 客户端监听器。用于处理来自服务端的信息。
 *
 * @author lpw
 */
public interface ClientListener extends Listener {
    /**
     * 连接完成。当连接完成时回调此方法。
     */
    void connect(String sessionId);

    /**
     * 连接被断开。当连接被断开时回调此方法。
     */
    void disconnect();
}
