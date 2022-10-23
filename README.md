# ブログアプリ

## 概要
spring boot + vue2の練習で、ブログアプリを開発します。

## 設定
windows用、コマンドプロンプト等でgitの設定を以下にしてからcloneしてください。
```
git config --global core.autocrlf input
```


## 起動までの手順
1. 「.env.example」のファイル名 を 「.env」に変更してください。  
2. docker-compose.ymlが存在するディレクトリで以下のコマンドを実行すると起動します。  
※ビルド時にダウンロードが止まることがあれば、もう一度やり直してください。  
※docker-composeコマンドを実行できるようにしておいてください。  
```
docker-compose up -d
```
3. npm
```
docker exec frontend npm install
```
※npm installが終了しない場合は、以下のコマンドでコンテナ内に入り、npm installを実行します。
```
docker exec -it frontend bash
npm install
```

4. vueのビルドと起動
```
docker exec frontend npm run serve
```

## 起動確認
spring(api)

DB内のデータが返ってきます。

http://localhost:8080/testAPI

vue

http://localhost:9090/

