package im.micro.access.init;

import im.micro.access.decode.HeartbeatDecoder;
import im.micro.access.handle.HeartBeatSimpleHandle;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

public class ServerInitializer extends ChannelInitializer<Channel> {
    @Override
    protected void initChannel(Channel ch) throws Exception {
        ch.pipeline()
                .addLast(new IdleStateHandler(11, 0, 0))
                .addLast(new HeartbeatDecoder())
                .addLast(new HeartBeatSimpleHandle());;
//                .addLast(new ProtobufVarint32FrameDecoder())
//                .addLast(new ProtobufDecoder(CIMRequestProto.CIMReqProtocol.getDefaultInstance()))
//                .addLast(new ProtobufVarint32LengthFieldPrepender())
//                .addLast(new ProtobufEncoder())
    }
}
