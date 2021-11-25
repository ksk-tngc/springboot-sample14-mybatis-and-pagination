## 概要

MyBatis で CRUD 操作を行う簡単な Spring Boot アプリケーションです。  

以下の要素を含みます：
* ページネーション
* バリデーション
* Thymeleaf Layout Dialect で共通レイアウト
* CommandLineRunner によるコマンドライン処理 (DB初期データ登録)
* Bootstrap, Bootstrap Icons（WebJars）

## 画面

#### トップページ（一覧）
<img width="620" src="https://user-images.githubusercontent.com/59589496/138786631-051f03b6-fd30-4303-94c9-27324edfb615.png">  

#### 新規追加
<img width="620" src="https://user-images.githubusercontent.com/59589496/138786826-92dd7c99-e49c-410a-b0b0-554f0ee32431.png">  
<img width="620" src="https://user-images.githubusercontent.com/59589496/138786917-250ee102-faf0-4ad7-b80f-d6f37f30cd61.png">  

#### 編集
<img width="620" src="https://user-images.githubusercontent.com/59589496/138787082-d711c690-c94d-461a-9ca0-b43100babbdc.png">  
<img width="620" src="https://user-images.githubusercontent.com/59589496/138787123-c5d71e7b-4e83-42ed-b96b-2477de19c936.png">  

#### 削除
<img width="620" src="https://user-images.githubusercontent.com/59589496/138787244-11f585cb-15c1-4831-8870-5a50fe2ff271.png">  
<img width="620" src="https://user-images.githubusercontent.com/59589496/138787297-20b79e3a-0fb1-466b-9a03-0b809bb592cc.png">  

#### ページネーション
<img width="620" src="https://user-images.githubusercontent.com/59589496/138787528-b1200ca4-702c-4440-bf13-a8575c90adf0.png">  
<img width="620" src="https://user-images.githubusercontent.com/59589496/138787598-bcd2075f-540a-4269-ad8f-6b416deaf937.png">  


## フォルダ構成

<img width="320" src="https://user-images.githubusercontent.com/59589496/138786334-73858ce5-deb3-4661-9f70-9a524709109f.png">


## 依存関係

* Spring Boot DevTools
* Spring Web
* Thymeleaf
* Thymeleaf Layout Dialect
* Validation
* MyBatis
* PageHelper
* Spring Data JPA (Spring Data Commons)
* H2 Database
* Lombok
* WebJars
	- Webjars Locator Core
	- Bootstrap
	- Bootstrap Icons
