package com.atguigu.maven;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
	/**
	 *在Maven工程中需要引用其他的jar或者其他的项目
	 *必须通过坐标在maven仓库中获取
	 *如果连接的是本地maven仓库，通过GAV进行寻找，如果找不到，就会报错
	 *如果要连接自己创建的项目，需要用命令把项目安装到到本地的Maven仓库中，才可以用GVA去引用它
	 * @author Administrator
	 *
	 */
public class HelloFriendTest {
	@Test
	public void testHelloFriend() {
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("litingwei");
		assertEquals("Hello litingwei! I am John", results);
	}
}
