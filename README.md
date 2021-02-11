# first_java

## どんなプログラム
DockerFileを実行して動かすJavaのプログラムです。
二次元配列の内容を回転して表示します。

## 回転パラメータ

```java
//　回転後の出力
// 1：そのまま表示/2：右回転/3：反転/４：左回転
rotateSw(ary, 2);
```
## 動作方法
Mainファイルのコードを変更したら再ビルドすること
### docker build
```sh
$ docker build -t my-java-app .
```
### docker run
```sh
$ docker run -it --rm --name my-java-running-app my-java-app
```

## Docker 削除方法
Main.javaのコーディングでエラーになった場合コンテナが増えている場合があるため削除する
### status　確認
```sh
$ docker ps -a

CONTAINER ID   IMAGE                           COMMAND                  CREATED          STATUS                      PORTS                  NAMES
aa8c49e55660   4865dd961707                    "/bin/sh -c 'javac M…"   16 seconds ago   Exited (1) 16 seconds ago                          quirky_allen
0eb23bdbce9e   mysql:5.7                       "docker-entrypoint.s…"   2 weeks ago      Up 41 hours                 3306/tcp, 33060/tcp    wiki_db_1
f791df83110e   wordpress                       "docker-entrypoint.s…"   2 weeks ago      Up 41 hours                 0.0.0.0:8080->80/tcp   wiki_wordpress_1

```
### コンテナ 削除
```sh
$ docker rm aa8c49e55660
```
### イメージ確認
```sh
$ docker images 

REPOSITORY                      TAG            IMAGE ID       CREATED         SIZE
<none>                          <none>         4865dd961707   2 minutes ago   467MB
my-java-app                     latest         be80ce072b00   4 minutes ago   467MB
my-python-app                   latest         1fc28976853a   7 days ago      912MB
openjdk                         16             3ab5025baebc   2 weeks ago     467MB
wordpress                       latest         d94129b6e1f4   2 weeks ago     550MB
mysql                           5.7            a70d36bc331a   3 weeks ago     449MB
```


### イメージ削除
```sh
$ docker rmi  4865dd961707
```

