# Visual Studio Code Remote - Containers を用いたSpringBoot×MySQL開発環境構築

## start container
VSCodeで、Remote Containers - Reopen in Container によりコンテナを開始する

## install extension
Remote ContainerのVSCodeに必要なExtensionを導入する
* Java extension
* Spring boot develop extension
* Lombok
  
## Start Spring Boot App
メインクラスを選択した状態で、</br>
サイドバーから、Runを選択し、Run and Debugを押下

## MySQL接続
```
$ docker exec -it <container_id> /bin/bash
# mysql -u root -p -h 127.0.0.1
```

## Docker不調時のお掃除
```
$ docker system prune
```