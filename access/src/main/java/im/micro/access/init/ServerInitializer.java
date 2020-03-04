package im.micro.access.init;

import im.micro.access.decode.HeartbeatDecoder;
import im.micro.access.handle.AccessHandle;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class ServerInitializer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline()

                .addLast(new IdleStateHandler(11, 15, 20, TimeUnit.SECONDS))
                .addLast(new HeartbeatDecoder()) // 未来会转变为 protoBuffer的编解码
                .addLast(new AccessHandle()) //添加自己处理事件的handle
                .addLast(new HttpServerCodec()) //因为基于http协议，使用http的编码和解码器
                .addLast(new ChunkedWriteHandler())//是以块方式写，添加ChunkedWriteHandler处理器
                /*
                    说明
                    1. http数据在传输过程中是分段, HttpObjectAggregator ，就是可以将多个段聚合
                    2. 这就就是为什么，当浏览器发送大量数据时，就会发出多次http请求
                     */
                .addLast(new HttpObjectAggregator(8192))
                /*
                   说明
                   1. 对应websocket ，它的数据是以 帧(frame) 形式传递
                   2. 可以看到WebSocketFrame 下面有六个子类
                   3. 浏览器请求时 ws://localhost:7000/hello 表示请求的uri
                   4. WebSocketServerProtocolHandler 核心功能是将 http协议升级为 ws协议 , 保持长连接
                   5. 是通过一个 状态码 101
                    */
                .addLast(new WebSocketServerProtocolHandler("/hello2"));

//                .addLast(new ProtobufVarint32FrameDecoder())
//                .addLast(new ProtobufDecoder(CIMRequestProto.CIMReqProtocol.getDefaultInstance()))
//                .addLast(new ProtobufVarint32LengthFieldPrepender())
//                .addLast(new ProtobufEncoder())
    }
}
