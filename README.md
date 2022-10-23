1. 「.env.example」のファイル名 を 「.env」に変更してください。  
2. docker-compose.ymlが存在するディレクトリで以下のコマンドを実行すると起動します。
```
docker-compose up -d
```
3. npm
```
docker exec frontend npm install
```
4. vueのビルドと起動
docker exec frontend npm run serve

