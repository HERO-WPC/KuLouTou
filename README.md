# KuLouTou 仅支持paper其他不知道
* 添加凋零骷髅头合成：周围一圈煤中间是石头
* 打包：安装gradle
* # Linux / macOS 示例

  
先检查 Java

java -version


Gradle推荐 JDK 21
如果没安装，先装 OpenJDK：

sudo apt update
sudo apt install openjdk-21-jdk -y


下载最新版 Gradle
去 Gradle 官方下载页
 找最新版本



解压到 /opt/gradle





配置环境变量
编辑 ~/.bashrc 或 ~/.zshrc：

export PATH=$PATH:/opt/gradle/gradle你的版本/bin


然后刷新：

source ~/.bashrc


验证

gradle -v


如果显示最新版本，说明安装成功 ✅
* 打包 
 
 ```bash
#bash
gradle clean build

```
* # 指令

/xiangyaole:给玩家一个凋零骷髅头

/nb:你猜（无害）

* # 加了个合成表
周围摆煤炭中间放石头

