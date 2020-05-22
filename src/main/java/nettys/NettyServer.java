package nettys;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

public class NettyServer {
    public static void main(String [] args){

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workeGroup = new NioEventLoopGroup();

        ServerBootstrap bootstrap = new ServerBootstrap();

    }
}
