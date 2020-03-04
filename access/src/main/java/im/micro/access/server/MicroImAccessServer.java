package im.micro.access.server;

import im.micro.access.init.ServerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.InetSocketAddress;
@Component
public class MicroImAccessServer {
    private final static Logger LOGGER = LoggerFactory.getLogger(MicroImAccessServer.class);

    private EventLoopGroup boss = new NioEventLoopGroup();
    private EventLoopGroup work = new NioEventLoopGroup();


    @Value("${netty.server.port}")
    private int nettyPort;


    /**
     * 启动服务端
     */
    @PostConstruct
    public void start()  {
        try {
            ServerBootstrap bootstrap = new ServerBootstrap()
                    .group(boss, work)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(nettyPort))
                    .childHandler(new ServerInitializer());

            ChannelFuture future = bootstrap.bind().sync();
            if (future.isSuccess()) {
                LOGGER.info("启动 Netty 成功");
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            // 当服务器关闭时，关闭eventLoop
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }

    }


    /**
     * 销毁
     */
    @PreDestroy
    public void destroy() {
        boss.shutdownGracefully().syncUninterruptibly();
        work.shutdownGracefully().syncUninterruptibly();
        LOGGER.info("关闭 Netty 成功");
    }

}
