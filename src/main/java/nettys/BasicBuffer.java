package nettys;

import java.nio.IntBuffer;

public class BasicBuffer {

    public static void main(String [] args){
      //创建一个buffer，大小为5，可存放5个int
        IntBuffer allocate = IntBuffer.allocate(5);

        for(int i=0;i<allocate.capacity();i++){
            allocate.put(i*2);
        }
        //从buffer读取数据
        //将buffer转换，读写切换
        allocate.flip();
    }
}
