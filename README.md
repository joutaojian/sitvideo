这是一个SSM测试项目

##如何配置？

1.git clone 你的git地址
2.作为maven项目导入
3.检查下:编码为utf-8，JDK为1.7，Web为3.0（必须检查.properties文件）

##我之前配置出现的问题

1.maven导入后编码错误，JDK版本错误，Web版本错误
2.修正问题1后，项目不是web项目，无法发布到tomcat
3.修正问题2后，将maven项目转为web项目，可以发布和运行，但是项目就是有个小红叉(报错：Dynamic Web Module 3.0 requires Java 1.6 or newer)
4.虽然问题3不影响项目运行，但是有红叉就必须解决，于是在pom.xml加入以下配置,加上该配置，一次性解决了问题1，2，3，4
```xml
<build>
		<finalName>TestSSM</finalName>
		<!-- 解决Maven打红叉问题 -->
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.0</version>
				<configuration>
					<source>1.7</source>
					<target>1.7</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
```
